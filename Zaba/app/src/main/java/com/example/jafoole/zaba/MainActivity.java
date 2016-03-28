package com.example.jafoole.zaba;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.NumberPicker;

/**          /\     /\      __        _____              __                /\      /\
            \ \    \ \     |__|____ _/ ____\____   ____ |  |   ____       / /     / /
            \ \    \ \     |  \__  \\   __\/  _ \ /  _ \|  | _/ __ \     / /     / /
            \ \    \ \     |  |/ __ \|  | (  <_> |  <_> )  |_\  ___/    / /     / /
            \ \    \ \ /\__|  (____  /__|  \____/ \____/|____/\___  >  / /     / /
            \/     \/  \______|    \/                             \/   \/      \/ **/

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView mDepartingFrom;
    AutoCompleteTextView mFlyingTo;
    EditText mDepartDateEditText;
    EditText mReturnDateEditText;
    EditText mPassengersEditText;

    ListView mListView;


    private static final String[] COUNTRIES = new String[] {
            "Belgium", "France", "Italy", "Germany", "Spain"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_round_trip);

//        mDepartingFrom = (AutoCompleteTextView)findViewById(R.id.departingFromEditText);
        mFlyingTo = (AutoCompleteTextView)findViewById(R.id.flyingToEditText);
        mDepartDateEditText = (EditText)findViewById(R.id.departDateEditText);
        mReturnDateEditText = (EditText)findViewById(R.id.returnDateEditText);
        mPassengersEditText = (EditText)findViewById(R.id.passengersEditText);

        mListView = (ListView) findViewById(R.id.listView);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, android.R.id.text1, COUNTRIES);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.departingFrom);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);

        AutoCompleteTextView flyingTo = (AutoCompleteTextView)findViewById(R.id.flyingTo);
        flyingTo.setThreshold(1);
        flyingTo.setAdapter(adapter);



        //Fragments for switching between Round-trip and One Way
//        final FragmentManager fragmentManager = getSupportFragmentManager();
//        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        final RoundTripFragment roundTripFragment = new RoundTripFragment();
//        fragmentTransaction.add(R.id.fragment_container, roundTripFragment);
//        fragmentTransaction.commit();


//        Button oneWayButton = (Button)findViewById(R.id.oneWayButton);
//        oneWayButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction oneWayTransaction = fragmentManager.beginTransaction();
//
//                OneWayFragment oneWayFragment = new OneWayFragment();
//                oneWayTransaction.replace(R.id.fragment_container, oneWayFragment);
//                oneWayTransaction.commit();
//            }
//        });

//        final Button roundTripButton = (Button)findViewById(R.id.roundTripButton);
//        roundTripButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction roundTripTransaction = fragmentManager.beginTransaction();
//
//                RoundTripFragment roundTripFragment = new RoundTripFragment();
//                roundTripTransaction.replace(R.id.fragment_container, roundTripFragment);
//                roundTripTransaction.commit();
//            }
//        });
        //End of Fragments

        //Floating action button that sends data from MainActivity to FlightslistActivity.
        //When the FAB is pressed, the api request is made for the selected locations and dates.
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, FlightsListActivity.class);
//                startActivity(intent);
//
//
//
//
////
////                Intent newListIntent = new Intent(ListCreateActivity.this, ListCollectionActivty.class);
////                newListIntent.putExtra(LIST_TAGS,addedString);
////                newListIntent.putExtra("SCREEN_NAME","listcreateActivity");
////                setResult(RESULT_OK, newListIntent);
////
////                finish();
//            }
//        });




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
