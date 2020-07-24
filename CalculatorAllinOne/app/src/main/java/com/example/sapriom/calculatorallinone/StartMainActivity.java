package com.example.sapriom.calculatorallinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_main);
    }


    public void Clicked (View view)
    {
        Intent intent = new Intent(StartMainActivity.this,ListMainActivity.class);
        startActivity(intent);
    }
}
