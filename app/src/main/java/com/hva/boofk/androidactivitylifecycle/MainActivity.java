package com.hva.boofk.androidactivitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/*
    Adapted from GoalKicker.com - Android Notes for Professionals

    Show which Activity state changes occur.
 */
public class MainActivity extends AppCompatActivity {

    private final String LOG_TAG = MainActivity.class.getSimpleName();

    private void myTrace(String myMethod) {
        String myClass = this.getClass().getSimpleName();
        Log.d(LOG_TAG, "calling " + myMethod + " from " + myClass);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.buttonNext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toNextActivity();
            }
        });
        myTrace(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onStart() {
        super.onStart();
        myTrace(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onResume() {
        super.onResume();
        myTrace(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onPause() {
        super.onPause();
        myTrace(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        myTrace(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        myTrace(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        myTrace(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public void toNextActivity() {
        myTrace(new Object(){}.getClass().getEnclosingMethod().getName());
        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent);
    }
}
