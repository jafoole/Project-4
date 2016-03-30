package com.example.jafoole.zaba;


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
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Calendar;

import okhttp3.Response;



/**
 * A simple {@link Fragment} subclass.
 */
public class RoundTripFragment extends Fragment {

    private ProgressBar mProgressBar;



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

        final AutoCompleteTextView departingFrom = (AutoCompleteTextView) view.findViewById(R.id.departingFrom);
        departingFrom.setThreshold(1);
        departingFrom.setAdapter(adapter);

        final AutoCompleteTextView flyingTo = (AutoCompleteTextView) view.findViewById(R.id.flyingTo);
        flyingTo.setThreshold(1);
        flyingTo.setAdapter(adapter);


        final TextView departDateEditText = (TextView)view.findViewById(R.id.departDateEditText);
        final TextView returnDateEditText = (TextView)view.findViewById(R.id.returnDateEditText);
        final FloatingActionButton fab = (FloatingActionButton)view.findViewById(R.id.fab);
        mProgressBar = (ProgressBar) view.findViewById(R.id.progressBar);

        final Calendar calendar = Calendar.getInstance();


        final DatePickerDialog.OnDateSetListener departListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                departDateEditText.setText(dayOfMonth + "/" + (monthOfYear+1) +  "/" + year);
            }
        };

        final DatePickerDialog.OnDateSetListener returnListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                returnDateEditText.setText(dayOfMonth + "/" + (monthOfYear+1) +  "/" + year);
            }
        };


        departDateEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(getContext(), departListener, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        returnDateEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(getContext(), returnListener, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();

            }
        });

        //Floating action button that sends data from MainActivity to FlightslistActivity.
        //When the FAB is pressed, the api request is made for the selected locations and dates.
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String departFrom = departingFrom.getText().toString();
                String flyTo = flyingTo.getText().toString();
                String flyDate = departDateEditText.getText().toString();
                String returnDate = returnDateEditText.getText().toString();

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


    public class SearchAsyncTask extends AsyncTask<String, Void, com.example.jafoole.zaba.qpxdata.Response> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();


        }

        @Override
        protected com.example.jafoole.zaba.qpxdata.Response doInBackground(String... params) {
            return null;

        }

        @Override
        protected void onPostExecute(com.example.jafoole.zaba.qpxdata.Response response) {
            super.onPostExecute(response);
        }
    }
}
