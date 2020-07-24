package com.example.sapriom.calculatorallinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FeeMainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee_main);
        inBtn();
        intAction(btn);
    }

    public void inBtn()
    {
        btn = (Button) findViewById(R.id.button2);
    }

    public void intAction(View view)
    {
        Intent intent = new Intent(FeeMainActivity.this,ListMainActivity.class);
    }
}
