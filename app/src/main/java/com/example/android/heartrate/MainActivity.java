package com.example.android.heartrate;

import android.content.Context;
import android.content.Intent;

import android.os.Bundle;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.android.heartrate.R;

import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    private Button mRunButton;
    private static final int RESULTS_CODE = 123;
    private int mHeartRate;
    public static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // public context member for use in dialog
        context = this;

        // when run button is pressed
        mRunButton =  findViewById(R.id.run_button);
        mRunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Launch heart rate monitor activity
                Intent i=new Intent(MainActivity.this,CameraActivity.class);
                startActivity(i);
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
