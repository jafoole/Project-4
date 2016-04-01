package com.zaba.jafoole.zaba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.zaba.jafoole.zaba.qpxexpress.Response;
import com.zaba.jafoole.zaba.qpxexpress.TripOption;

import java.util.ArrayList;
import java.util.List;

public class FlightsListActivity extends AppCompatActivity {

    ImageView backButton;
    TextView mTravelSelectedTextView;
    TextView mDatesSelectedTextView;
    ListView mListView;

    List<TripOption> tripOptions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flights_list);

        backButton = (ImageView)findViewById(R.id.backButton1);
        mTravelSelectedTextView = (TextView) findViewById(R.id.travelSelectedTextView);
        mDatesSelectedTextView = (TextView) findViewById(R.id.datesSelectedTextView);
        mListView = (ListView) findViewById(R.id.flightsListView);

        String depart_from = getIntent().getStringExtra("DEPART_FROM");
        String fly_to = getIntent().getStringExtra("FLY_TO");
        String fly_date = getIntent().getStringExtra("FLY_DATE");
        String return_date = getIntent().getStringExtra("RETURN_DATE");


        mTravelSelectedTextView.setText(depart_from + " - " + fly_to);
        mDatesSelectedTextView.setText(fly_date + " - " + return_date);

        Response returnedResponse = (Response)getIntent().getSerializableExtra("RESPONSE");


        tripOptions = returnedResponse.getTrips().getTripOption();
























        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(FlightsListActivity.this, MainActivity.class);
                startActivity(backIntent);
            }
        });









    }
}
