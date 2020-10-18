package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.helloandroid.R;

public class MainIntentActivity extends AppCompatActivity {

    private Button buttonCreateActionViewSite, buttonCreateActionViewPhone, buttonCreateActionMSAViewSite, buttonCreateActionMSAViewPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_intent);

        buttons();
    }

    public void buttons(){
        buttonCreateActionViewSite = (Button)findViewById(R.id.buttonCreateActionViewSite);
        buttonCreateActionViewPhone = (Button)findViewById(R.id.buttonCreateActionViewPhone);
        buttonCreateActionMSAViewSite = (Button)findViewById(R.id.buttonCreateActionMSAViewSite);
        buttonCreateActionMSAViewPhone = (Button)findViewById(R.id.buttonCreateActionMSAViewPhone);

        buttonCreateActionViewSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com";
                Uri uri = Uri.parse(url);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        buttonCreateActionViewPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "tel:00401213456";
                Uri uri = Uri.parse(phone);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        buttonCreateActionMSAViewSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com";
                Uri uri = Uri.parse(url);
                startActivity(new Intent("MSA.LAUNCH",uri));
            }
        });

        buttonCreateActionMSAViewPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "tel:00401213456";
                Uri uri = Uri.parse(phone);
                startActivity(new Intent("MSA.LAUNCH",uri));
            }
        });
    }
}