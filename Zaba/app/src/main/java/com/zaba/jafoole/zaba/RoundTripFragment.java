package com.zaba.jafoole.zaba;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.*;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonObject;
import com.zaba.jafoole.zaba.qpxexpress.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;


/**
 * A simple {@link Fragment} subclass.
 */
public class RoundTripFragment extends Fragment {

    private ProgressBar mProgressBar;
    private TextView mDepartDateEditText;
    private TextView mReturnDateEditText;
    private FloatingActionButton mFab;
    private AutoCompleteTextView flyingTo;
    private AutoCompleteTextView departingFrom;

//    String theUrl = "https://www.googleapis.com/qpxExpress/v1/trips/search?&key=AIzaSyAQc52vUM9AbMvzwEByrltTnMDplbQjAik";


    String theUrl = "https://www.googleapis.com/qpxExpress/v1/trips/search?fields=trips&key=AIzaSyA4lmrTg8ZUuOz4oKiZhxgWJsBApLk59xo";






    public RoundTripFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String[] airportCodes = getResources().getStringArray(R.array.airport_codes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line, android.R.id.text1, airportCodes);


        View view = inflater.inflate(R.layout.fragment_round_trip, container, false);



        departingFrom = (AutoCompleteTextView) view.findViewById(R.id.departingFrom);
        departingFrom.setThreshold(1);
        departingFrom.setAdapter(adapter);

        flyingTo = (AutoCompleteTextView) view.findViewById(R.id.flyingTo);
        flyingTo.setThreshold(1);
        flyingTo.setAdapter(adapter);


        mDepartDateEditText = (TextView)view.findViewById(R.id.departDateEditText);
        mReturnDateEditText = (TextView)view.findViewById(R.id.returnDateEditText);
        mFab = (FloatingActionButton)view.findViewById(R.id.fab);
        mProgressBar = (ProgressBar) view.findViewById(R.id.progressBar);

        final Calendar calendar = Calendar.getInstance();


        final DatePickerDialog.OnDateSetListener departListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                mDepartDateEditText.setText(dayOfMonth + "/" + (monthOfYear+1) +  "/" + year);
            }
        };

        final DatePickerDialog.OnDateSetListener returnListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                mReturnDateEditText.setText(dayOfMonth + "/" + (monthOfYear+1) +  "/" + year);
            }
        };


        mDepartDateEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(getContext(), departListener, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        mReturnDateEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(getContext(), returnListener, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();

            }
        });

        //Floating action button that sends data from MainActivity to FlightslistActivity.
        //When the FAB is pressed, the api request is made for the selected locations and dates.
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String departFrom = departingFrom.getText().toString();
                String flyTo = flyingTo.getText().toString();
                String flyDate = mDepartDateEditText.getText().toString();
                String returnDate = mReturnDateEditText.getText().toString();

                SearchAsyncTask searchAsyncTask = new SearchAsyncTask();
                searchAsyncTask.execute();

                Intent intent = new Intent(getContext(), FlightsListActivity.class);
                intent.putExtra("DEPART_FROM", departFrom);
                intent.putExtra("FLY_TO", flyTo);
                intent.putExtra("FLY_DATE",flyDate);
                intent.putExtra("RETURN_DATE",returnDate);
                startActivity(intent);
            }
        });

        return view;

    }


    public class SearchAsyncTask extends AsyncTask<String, Void, com.zaba.jafoole.zaba.qpxexpress.Response> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            String departFrom = departingFrom.getText().toString();
            String flyTo = flyingTo.getText().toString();
            String flyDate = mDepartDateEditText.getText().toString();
            String returnDate = mReturnDateEditText.getText().toString();


//            "https://www.googleapis.com/qpxExpress/v1/trips/search?fields=trips&key=AIzaSyAHFTNJy-9f4e0BSUN3E1QF-USEOKMNLUA"



//            https://www.googleapis.com/qpxExpress/v1/trips/search?key=AIzaSyAHFTNJy-9f4e0BSUN3E1QF-USEOKMNLUA
        }

        @Override
        protected com.zaba.jafoole.zaba.qpxexpress.Response doInBackground(String... params) {

//            sendPost();


            RequestQueue requestQueue = Volley.newRequestQueue(getContext());
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, theUrl, null, new Response.Listener<JSONObject>() {


                @Override
                public void onResponse(JSONObject response) {
                    Toast.makeText(getContext(), "Response Completed", Toast.LENGTH_SHORT).show();
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(getContext(), "Request Ended With Error", Toast.LENGTH_SHORT).show();
                }
            }) {

//                String theRequest = "{\n" +
//                        "                    \"request\": {\n" +
//                        "                    \"passengers\": {\n" +
//                        "                        \"adultCount\": 1\n" +
//                        "                    },\n" +
//                        "                    \"slice\": [\n" +
//                        "                    {\n" +
//                        "                        \"origin\": \"SFO\",\n" +
//                        "                            \"destination\": \"LAX\",\n" +
//                        "                            \"date\": \"2016-05-06\"\n" +
//                        "                    }\n" +
//                        "                    ]\n" +
//                        "                }\n" +
//                        "                }";


                JSONObject theRequest = new JSONObject();
            JSONObject request = new JSONObject();
            JSONArray slice = new JSONArray();
            JSONObject aSlice = new JSONObject();
//            JSONObject solutions = new JSONObject();


            JSONObject passengers = new JSONObject();
                {
                    try {
                        passengers.put("adultCount", "1");
                        request.put("passengers", passengers);
                        aSlice.put("origin", "SFO");


                        aSlice.put("destination", "LAX");
                        aSlice.put("date", "2016-13-03");
                        slice.put(0, aSlice);
                        request.put("slice", slice);

                        request.put("solutions", "1");
                        theRequest.put("request", request);
                    } catch (JSONException e1) {
                        e1.printStackTrace();
                    }
            }

                String secondRequestMindYou = theRequest.toString();




                @Override
                protected Map<String, String> getParams() {
                    Map<String, String> params = new HashMap<String, String>();
                    params.put("request", secondRequestMindYou);


                    return params;
                }

                public Map<String,String> getHeaders() throws AuthFailureError{
                    Map<String, String> params = new HashMap<String, String>();
                    params.put("Content-Type","application/json; charset=utf-8");


                    return params;
                }
            };
            requestQueue.add(jsonObjectRequest);



//            JSONObject theRequest = new JSONObject();
//            JSONObject request = new JSONObject();
//            JSONArray slice = new JSONArray();
//            JSONObject aSlice = new JSONObject();
////            JSONObject solutions = new JSONObject();
//
//
//            JSONObject passengers = new JSONObject();
//            try {
//                passengers.put("adultCount", "1");
//                request.put("passengers", passengers);
//                aSlice.put("origin", "SFO");
//
//
//                aSlice.put("destination", "LAX");
//                aSlice.put("date", "2016-13-03");
//                slice.put(0, aSlice);
//                request.put("slice", slice);
//
//                request.put("solutions", "1");
//                theRequest.put("request", request);
//
//
//            } catch (Throwable e) {
//                e.printStackTrace();
//            }
//
//            InputStream inputStream = null;
//
//            HttpURLConnection conn = null;
//
//            OutputStream os = null;
//
//            URL url = null;
//
//            try {
//
//                String theURL = "https://www.googleapis.com/qpxExpress/v1/trips/search?key=AIzaSyBju4kLo3qzq5M_fQ_x9lxeRIiMn1a6B64";
//                url = new URL(theURL);
////                String urlParameters  = request.toString();
//                Log.d("Stuff", url.toString());
//
//                String departingFromText = theRequest.toString();
//                Log.d("DepartingFromText", departingFromText);
//                conn = (HttpURLConnection) url.openConnection();
//                conn.setReadTimeout(10000);
//                conn.setConnectTimeout(15000);
//                conn.setRequestMethod("POST");
//                conn.setDoInput(true);
//                conn.setDoOutput(true);
//                conn.setFixedLengthStreamingMode(departingFromText.getBytes().length);
//
//                //make some HTTP header nicety
//                conn.setRequestProperty("Content-Type", "application/json;charset=utf-8");
//                conn.setRequestProperty("X-Requested-With", "XMLHttpRequest");
//
//                //open
//                conn.connect();
//
//                //setup send
//                os = new BufferedOutputStream(conn.getOutputStream());
//                os.write(departingFromText.getBytes());
//                //clean up
//                os.flush();
//
//                //do something with response
//                inputStream = conn.getInputStream();
//                String contentAsString = getInputData(inputStream);
//                Log.d("Content", contentAsString);
//
//                os.close();
//                inputStream.close();
//                conn.disconnect();
//
//
//            } catch (Throwable e1) {
//                e1.printStackTrace();
//
//
//            } finally {
//                //clean up
//                try {
//
//                } catch (Throwable e) {
//                    e.printStackTrace();
//                }
//
//            }


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
