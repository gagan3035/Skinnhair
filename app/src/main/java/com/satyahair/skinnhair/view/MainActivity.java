package com.satyahair.skinnhair.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.satyahair.skinnhair.R;
import com.satyahair.skinnhair.view.hair.HairCareActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnSkin;
    Button btnHair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSkin = (Button)findViewById(R.id.skin);
        btnHair = (Button)findViewById(R.id.hair);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        btnHair.setOnClickListener(this);
        btnSkin.setOnClickListener(this);
        setSupportActionBar(toolbar);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.skin:
                Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_LONG).show();
                break;
            case R.id.hair:
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),HairCareActivity.class);
                startActivity(intent);
                break;
        }
    }
}
