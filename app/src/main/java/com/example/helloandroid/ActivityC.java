package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        Log.v("lifecycleC","onCreate C");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("lifecycleC","onStart C");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("lifecycleC","onResume C");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("lifecycleC","onPause C");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("lifecycleC","onStop C");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("lifecycleC","onDestroy C");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("lifecycleC","onRestart C");
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