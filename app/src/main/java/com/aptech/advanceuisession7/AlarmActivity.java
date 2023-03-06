package com.aptech.advanceuisession7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class AlarmActivity extends AppCompatActivity {
    public int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        final TextView counttime=findViewById(R.id.counttime);
        new CountDownTimer(50000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                counttime.setText(String.valueOf(counter));
                counter++;
            }
            @Override
            public void onFinish() {
                counttime.setText("Finished");
            }
        }.start();
    }
}