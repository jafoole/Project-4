package com.zaba.jafoole.zaba;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.zaba.jafoole.zaba.qpxexpress.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneWayFragment extends Fragment {


    private ProgressBar mProgressBar;
    private TextView mDepartDateEditText;
    private FloatingActionButton mFab;
    private AutoCompleteTextView flyingTo;
    private AutoCompleteTextView departingFrom;


    String theUrl = "https://www.googleapis.com/qpxExpress/v1/trips/search?fields=trips&key=AIzaSyA4lmrTg8ZUuOz4oKiZhxgWJsBApLk59xo";


    public OneWayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one_way, container, false);


        String[] airportCodes = getResources().getStringArray(R.array.airport_codes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line, android.R.id.text1, airportCodes);



        departingFrom = (AutoCompleteTextView) view.findViewById(R.id.departingFrom);
        departingFrom.setThreshold(1);
        departingFrom.setAdapter(adapter);

        flyingTo = (AutoCompleteTextView) view.findViewById(R.id.flyingTo);
        flyingTo.setThreshold(1);
        flyingTo.setAdapter(adapter);


        mDepartDateEditText = (TextView)view.findViewById(R.id.departDateEditText);
        mFab = (FloatingActionButton)view.findViewById(R.id.fab);
        mProgressBar = (ProgressBar) view.findViewById(R.id.progressBar);


        final Calendar calendar = Calendar.getInstance();


        final DatePickerDialog.OnDateSetListener departListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                mDepartDateEditText.setText(year + "-" + (monthOfYear+1) +  "-" + dayOfMonth);
            }
        };


        mDepartDateEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(getContext(), departListener, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });


        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OneWayFragment.SearchAsyncTask searchAsyncTask = new SearchAsyncTask();
                searchAsyncTask.execute();
            }
        });

        return view;
    }

    public class SearchAsyncTask extends AsyncTask<String, Void, Response> {

        String departFrom;
        String flyTo;
        String flyDate;


        @Override
        protected void onPreExecute() {

            mProgressBar.setVisibility(View.VISIBLE);


            departFrom = departingFrom.getText().toString();
            flyTo = flyingTo.getText().toString();
            flyDate = mDepartDateEditText.getText().toString();

            super.onPreExecute();



//            "https://www.googleapis.com/qpxExpress/v1/trips/search?fields=trips&key=AIzaSyAHFTNJy-9f4e0BSUN3E1QF-USEOKMNLUA"



//            https://www.googleapis.com/qpxExpress/v1/trips/search?key=AIzaSyAHFTNJy-9f4e0BSUN3E1QF-USEOKMNLUA
        }

        @Override
        protected com.zaba.jafoole.zaba.qpxexpress.Response doInBackground(String... params) {

//            sendPost();


            JSONObject theRequest = new JSONObject();
            JSONObject request = new JSONObject();
            JSONArray slice = new JSONArray();
            JSONObject aSlice = new JSONObject();
//            JSONObject solutions = new JSONObject();


            JSONObject passengers = new JSONObject();
            {
                try {
                    passengers.put("adultCount", 1);
                    request.put("passengers", passengers);


                    aSlice.put("origin", departFrom);

                    aSlice.put("destination", flyTo);
                    aSlice.put("date", flyDate);
                    slice.put(0, aSlice);

                    request.put("slice", slice);

                    request.put("solutions", 1);
                    theRequest.put("request", request);

                } catch (JSONException e1) {
                    e1.printStackTrace();
                }
            }



            RequestQueue requestQueue = Volley.newRequestQueue(getContext());
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(theUrl, theRequest, new com.android.volley.Response.Listener<JSONObject>() {


                @Override
                public void onResponse(JSONObject response) {

                    Gson gson = new Gson();
                    com.zaba.jafoole.zaba.qpxexpress.Response response1 = gson.fromJson(response.toString(), com.zaba.jafoole.zaba.qpxexpress.Response.class);
                    if (mProgressBar.getVisibility() == View.VISIBLE) {
                        mProgressBar.setVisibility(View.GONE);
                    }
                    Toast.makeText(getContext(), "Response Completed", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getContext(), FlightsListActivity.class);
                    intent.putExtra("DEPART_FROM", departFrom);
                    intent.putExtra("FLY_TO", flyTo);
                    intent.putExtra("FLY_DATE",flyDate);
                    intent.putExtra("RESPONSE_ONE_WAY", response1);
                    intent.putExtra("WHICH_WAY", "ONE_WAY");
                    startActivity(intent);


                }
            }, new com.android.volley.Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(getContext(), "Request Ended With Error", Toast.LENGTH_SHORT).show();
                }
            }) {

                @Override
                public Map<String,String> getHeaders() throws AuthFailureError {
                    Map<String, String> params = new HashMap<String, String>();
                    params.put("Content-Type","application/json; charset=utf-8");


                    return params;
                }
            };

            int SLOW_REQUEST_THRESHOLD_MS = 10000;
            jsonObjectRequest.setRetryPolicy(new DefaultRetryPolicy(
                    SLOW_REQUEST_THRESHOLD_MS,
                    DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                    DefaultRetryPolicy.DEFAULT_BACKOFF_MULT

            ));

            requestQueue.add(jsonObjectRequest);





            return null;

        }

        @Override
        protected void onPostExecute(com.zaba.jafoole.zaba.qpxexpress.Response response) {
            super.onPostExecute(response);


        }
    }


    private String getInputData(InputStream inStream) throws IOException {
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));

        String data = null;

        while ((data = reader.readLine()) != null){
            builder.append(data);
        }

        reader.close();

        return builder.toString();
    }
}
