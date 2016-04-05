package com.zaba.jafoole.zaba;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.zaba.jafoole.zaba.qpxexpress.Carrier;
import com.zaba.jafoole.zaba.qpxexpress.Response;
import com.zaba.jafoole.zaba.qpxexpress.TripOption;

import java.io.Serializable;
import java.net.URL;

public class BookFlightActivity extends AppCompatActivity {

    ImageButton backButton;
    ImageButton shareButton;
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



        backButton = (ImageButton)findViewById(R.id.backButton2);
        shareButton = (ImageButton)findViewById(R.id.shareButton);
        bookButton = (Button)findViewById(R.id.bookButton);
        mTravelSelectedOrigin = (TextView) findViewById(R.id.travelSelectedOrigin);
        mTravelSelectedDestination = (TextView) findViewById(R.id.travelSelectedDestination);
        mDepartDateSelected = (TextView) findViewById(R.id.departDateSelected);
        mReturnDateSelected = (TextView) findViewById(R.id.returnDateSelected);
        mPassengerCount = (TextView) findViewById(R.id.passengerCount);
        mSaleTotal = (TextView) findViewById(R.id.saleTotal);



        String chooseWay = getIntent().getStringExtra("THE_WAY");


        if (chooseWay.equals("THE_ROUNDTRIP_WAY")){
            TripOption flightInfo = (TripOption)getIntent().getSerializableExtra("POSITION");
            final String origin = flightInfo.getOutboundFlights().getOrigin();
            final String destination = flightInfo.getOutboundFlights().getDestination();
            final String departDate = flightInfo.getOutboundFlights().getDepartureTime();
            final String returnDate = flightInfo.getInboundFlights().getArrivalTime();
            final String saleTotal = flightInfo.getSaleTotal();

//            2016-04-06T11:20-04:00
            mTravelSelectedOrigin.setText(origin);
            mTravelSelectedDestination.setText(destination);
            mDepartDateSelected.setText(departDate);

            mReturnDateSelected.setText(returnDate);


            mSaleTotal.setText(saleTotal);


            shareButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //This is going to be so that the user can share the flight with others.
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Check this flight info out!");
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey! Check this flight out! " + "\n" + "Origin: " + origin + " \n" + "Destination: " + destination + " \n" + "Departure Date: " + departDate + " \n" + "Return Date: " + returnDate + " \n" + "Sale Total: " + saleTotal);
                    startActivity(Intent.createChooser(shareIntent, "Share via"));

//                    Toast.makeText(BookFlightActivity.this, "Yay I'm gonna share with others!!", Toast.LENGTH_SHORT).show();
                }
            });

        } else {

            TripOption oneWayFlightInfo = (TripOption)getIntent().getSerializableExtra("POSITION_ONE");

            final String origin = oneWayFlightInfo.getOutboundFlights().getOrigin();
            final String destination = oneWayFlightInfo.getOutboundFlights().getDestination();
            final String departDate = oneWayFlightInfo.getOutboundFlights().getDepartureTime();

            final String saleTotal = oneWayFlightInfo.getSaleTotal();

            mTravelSelectedOrigin.setText(origin);
            mTravelSelectedDestination.setText(destination);
            mDepartDateSelected.setText(departDate);

            mSaleTotal.setText(saleTotal);

            shareButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //This is going to be so that the user can share the flight with others.
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Check this flight info out!");
                    shareIntent.putExtra(Intent.EXTRA_TEXT,"Hey! Check this flight out! " + "\n" + "Origin: " + origin + " \n" + "Destination: " + destination + " \n" + "Departure Date: " + departDate + " \n" + "Sale Total: " +saleTotal);
                    startActivity(Intent.createChooser(shareIntent, "Share via"));

//                    Toast.makeText(BookFlightActivity.this, "Yay I'm gonna share with others!!", Toast.LENGTH_SHORT).show();
                }
            });

        }


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "www.britishairways.com";
                Intent urlIntent = new Intent(Intent.ACTION_VIEW);
                urlIntent.setData(Uri.parse("http://" + url));
                startActivity(urlIntent);

//                Toast.makeText(BookFlightActivity.this, "Take me to the WebView to book!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
