package com.example.jafoole.zaba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class FlightsListActivity extends AppCompatActivity {

    ImageView backButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flights_list);

        backButton = (ImageView)findViewById(R.id.backButton1);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(FlightsListActivity.this, MainActivity.class);
                startActivity(backIntent);
            }
        });







    }
}
