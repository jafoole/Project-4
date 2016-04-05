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
    TextView mDepartDateSelected;
    TextView mReturnDateSelected;
    TextView mPassengerCount;
    TextView mSaleTotal;



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
        mDepartDateSelected = (TextView) findViewById(R.id.departDateSelected);
        mReturnDateSelected = (TextView) findViewById(R.id.returnDateSelected);
        mPassengerCount = (TextView) findViewById(R.id.passengerCount);
        mSaleTotal = (TextView) findViewById(R.id.saleTotal);



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
        String departDate = flightInfo.getOutboundFlights().getDepartureTime();
        String returnDate = flightInfo.getInboundFlights().getArrivalTime();
        String saleTotal = flightInfo.getSaleTotal();


        mTravelSelectedOrigin.setText(origin);
        mTravelSelectedDestination.setText(destination);
        mDepartDateSelected.setText(departDate);

        if (returnDate == null){
            mReturnDateSelected.setText("");
        }else {
            mReturnDateSelected.setText(returnDate);
        }


        mSaleTotal.setText(saleTotal);
    }
}
