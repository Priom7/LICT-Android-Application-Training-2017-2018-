package com.example.sapriom.calculatorallinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CoolDevidativeMainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cool_devidative_main);
        intBtn();
        intAction4(btn);
    }

    public void intBtn()
    {
        btn = (Button) findViewById(R.id.button4);
    }

    public void intAction4(View view)
    {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CoolDevidativeMainActivity.this,ListMainActivity.class);
                startActivity(intent);
            }
        });
    }
}
