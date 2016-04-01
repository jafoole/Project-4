package com.zaba.jafoole.zaba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class BookFlightActivity extends AppCompatActivity {

    ImageView backButton;
    ImageView shareButton;
    Button bookButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_flight);


        backButton = (ImageView)findViewById(R.id.backButton2);
        shareButton = (ImageView)findViewById(R.id.shareButton);
        bookButton = (Button)findViewById(R.id.bookButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(BookFlightActivity.this, FlightsListActivity.class);
                startActivity(backIntent);
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
    }
}
