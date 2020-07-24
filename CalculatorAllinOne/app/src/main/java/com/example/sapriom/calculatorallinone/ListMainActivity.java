package com.example.sapriom.calculatorallinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListMainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_main);
        inBtn1();
        intAction(btn1);
        inBtn2();
        intAction2(btn2);
        inBtn3();
        intAction3(btn3);
        intBtn4();
        intAction4(btn4);
        intBtn5();
        intAction5(btn5);
        inBtn6();
        intAction6(btn6);
    }

    public void inBtn1()
    {
        btn1 = (Button) findViewById(R.id.calculator);
    }
    public void inBtn2(){ btn2 = (Button) findViewById(R.id.cgpa);}
    public void inBtn3(){ btn3 = (Button) findViewById(R.id.fee);}
    public void intBtn4(){ btn4 = (Button) findViewById(R.id.c1);
    }
    public void intBtn5(){ btn5 = (Button) findViewById(R.id.c2);
    }

    public void inBtn6()
    {
        btn6 = (Button) findViewById(R.id.c3);
    }

    public void intAction (View view)
    {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMainActivity.this,CalculatorMainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void intAction2(View view)
    {
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMainActivity.this,CgpaMainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void intAction3(View view)
    {
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMainActivity.this,FeeMainActivity.class);
                startActivity(intent);
            }
        });
    }



    public void intAction4(View view)
    {
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMainActivity.this,CoolDevidativeMainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void intAction5(View view)
    {
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMainActivity.this,TriMainActivity.class);
                startActivity(intent);
            }
        });
    }


    public void intAction6(View view)
    {
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMainActivity.this,ThnkMainActivity.class);
                startActivity(intent);
            }
        });
    }
    }




