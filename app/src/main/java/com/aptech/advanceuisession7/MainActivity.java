package com.aptech.advanceuisession7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button nextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextPage  = findViewById(R.id.alarm);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, AlarmActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        // method for displaying the appropriate
        // fragment according to the clicked button
    }

    public void selectFragment(View view) {
        // creating object for Fragment
        Fragment fragment;
        // displaying first fragment
        // if button1 is clicked
        if (view == findViewById(R.id.button1)) {
            fragment = new Fragment1();
        } else {
            fragment = new Fragment2();
        }

        FragmentManager fragmentManager = getSupportFragmentManager();

        // fragment transaction to add or replace
        // fragments while activity is running

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_section, fragment);
        // making a commit after the transaction
        // to assure that the change is effective
        fragmentTransaction.commit();
    }
}