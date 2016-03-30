package com.example.jafoole.zaba;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;

/**          /\     /\      __        _____              __                /\      /\
            \ \    \ \     |__|____ _/ ____\____   ____ |  |   ____       / /     / /
            \ \    \ \     |  \__  \\   __\/  _ \ /  _ \|  | _/ __ \     / /     / /
            \ \    \ \     |  |/ __ \|  | (  <_> |  <_> )  |_\  ___/    / /     / /
            \ \    \ \ /\__|  (____  /__|  \____/ \____/|____/\___  >  / /     / /
            \/     \/  \______|    \/                             \/   \/      \/ **/

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView mDepartingFrom;
    AutoCompleteTextView mFlyingTo;
    TextView mDepartDateEditText;
    TextView mReturnDateEditText;
    EditText mPassengersEditText;
    String data;

    ListView mListView;


//    private AirportAsyncTask mTask;
//    private ArrayAdapter<String> mAdapter;

//    private static String mUrl = "https://zaba.firebaseio.com";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mDepartDateEditText = (TextView)findViewById(R.id.departDateEditText);
        mReturnDateEditText = (TextView)findViewById(R.id.returnDateEditText);
        mPassengersEditText = (EditText)findViewById(R.id.passengersEditText);

        mListView = (ListView) findViewById(R.id.listView);



//        Fragments for switching between Round-trip and One Way
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
        //End of Fragments

    }




    @Override
    protected void onStart() {
        super.onStart();
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

