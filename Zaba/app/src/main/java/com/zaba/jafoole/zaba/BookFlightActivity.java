package com.zaba.jafoole.zaba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.zaba.jafoole.zaba.qpxexpress.Response;
import com.zaba.jafoole.zaba.qpxexpress.TripOption;

import java.io.Serializable;

public class BookFlightActivity extends AppCompatActivity {

    ImageView backButton;
    ImageView shareButton;
    Button bookButton;

    TextView mTravelSelectedOrigin;
    TextView mTravelSelectedDestination;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_flight);



        TripOption flightInfo = (TripOption)getIntent().getSerializableExtra("POSITION");


        backButton = (ImageView)findViewById(R.id.backButton2);
        shareButton = (ImageView)findViewById(R.id.shareButton);
        bookButton = (Button)findViewById(R.id.bookButton);
        mTravelSelectedOrigin = (TextView) findViewById(R.id.travelSelectedOrigin);
        mTravelSelectedDestination = (TextView) findViewById(R.id.travelSelectedDestination);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //This is going to be so that the user can share the flight with others.
//                Intent shareIntent = new Intent();
//                startActivity(shareIntent);

                Toast.makeText(BookFlightActivity.this, "Yay I'm gonna share with others!!", Toast.LENGTH_SHORT).show();
            }
        });

        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BookFlightActivity.this, "Take me to the WebView to book!!", Toast.LENGTH_SHORT).show();
            }
        });

        String origin = flightInfo.getOutboundFlights().getOrigin();
        String destination = flightInfo.getOutboundFlights().getDestination();


        mTravelSelectedOrigin.setText(origin);
        mTravelSelectedDestination.setText(destination);


    }
}
