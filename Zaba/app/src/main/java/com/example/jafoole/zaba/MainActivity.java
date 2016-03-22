package com.example.jafoole.zaba;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.NumberPicker;

/**          /\     /\      __        _____              __                /\      /\
            \ \    \ \     |__|____ _/ ____\____   ____ |  |   ____       / /     / /
            \ \    \ \     |  \__  \\   __\/  _ \ /  _ \|  | _/ __ \     / /     / /
            \ \    \ \     |  |/ __ \|  | (  <_> |  <_> )  |_\  ___/    / /     / /
            \ \    \ \ /\__|  (____  /__|  \____/ \____/|____/\___  >  / /     / /
            \/     \/  \______|    \/                             \/   \/      \/ **/

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);





        final FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        final RoundTripFragment roundTripFragment = new RoundTripFragment();
        fragmentTransaction.add(R.id.fragment_container, roundTripFragment);
        fragmentTransaction.commit();


        Button oneWayButton = (Button)findViewById(R.id.oneWayButton);
        oneWayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction oneWayTransaction = fragmentManager.beginTransaction();

                OneWayFragment oneWayFragment = new OneWayFragment();
                oneWayTransaction.replace(R.id.fragment_container, oneWayFragment);
                oneWayTransaction.commit();
            }
        });

        final Button roundTripButton = (Button)findViewById(R.id.roundTripButton);
        roundTripButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction roundTripTransaction = fragmentManager.beginTransaction();

                RoundTripFragment roundTripFragment = new RoundTripFragment();
                roundTripTransaction.replace(R.id.fragment_container, roundTripFragment);
                roundTripTransaction.commit();
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FlightsListActivity.class);
                startActivity(intent);
            }
        });


    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);


    }
}
