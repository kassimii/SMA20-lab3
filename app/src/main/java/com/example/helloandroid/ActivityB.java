package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.v("lifecycleB","onCreate B");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("lifecycleB","onStart B");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("lifecycleB","onResume B");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("lifecycleB","onPause B");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("lifecycleB","onStop B");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("lifecycleB","onDestroy B");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("lifecycleB","onRestart B");
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