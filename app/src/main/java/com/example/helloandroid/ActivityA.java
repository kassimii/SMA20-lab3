package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Log.v("lifecycleA","onCreate A");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("lifecycleA","onStart A");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("lifecycleA","onResume A");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("lifecycleA","onPause A");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("lifecycleA","onStop A");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("lifecycleA","onDestroy A");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("lifecycleA","onRestart A");
    }



    public void clicked(View view){
        switch (view.getId()){
            case R.id.buttonA:
                startActivity(new Intent(this, ActivityA.class));
                break;
            case R.id.buttonB:
                startActivity(new Intent(this, ActivityB.class));
                break;
            case R.id.buttonC:
                startActivity(new Intent(this, ActivityC.class));
                break;
       }
    }
}