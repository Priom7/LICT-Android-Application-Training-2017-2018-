package com.example.sapriom.calculatorallinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorMainActivity extends AppCompatActivity {

    TextView result;
    EditText num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_main);

        Button add, sub, mul, div, res;


        add = (Button) findViewById(R.id.sum);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        res = (Button) findViewById(R.id.res);
        result = (TextView) findViewById(R.id.result);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(num1.getText().toString().equals("")||num2.getText().toString().equals(""))
                {
                    Toast.makeText(CalculatorMainActivity.this, "Please Enter Your value", Toast.LENGTH_SHORT).show();
                }

                else {
                    String value1 = num1.getText().toString();
                    String value2 = num2.getText().toString();
                    Double r = Double.parseDouble(value1) + Double.parseDouble(value2);

                    result.setText(r + " ");
                }

            }
        });

        sub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().equals("")||num2.getText().toString().equals(""))
                {
                    Toast.makeText(CalculatorMainActivity.this, "Please Enter Your value", Toast.LENGTH_SHORT).show();
                }

                else {
                    String value1 = num1.getText().toString();
                    String value2 = num2.getText().toString();
                    Double r = Double.parseDouble(value1) - Double.parseDouble(value2);

                    result.setText(r + " ");
                }

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().equals("")||num2.getText().toString().equals(""))
                {
                    Toast.makeText(CalculatorMainActivity.this, "Please Enter Your value", Toast.LENGTH_SHORT).show();
                }
                else {
                    String value1 = num1.getText().toString();
                    String value2 = num2.getText().toString();
                    Double r = Double.parseDouble(value1) * Double.parseDouble(value2);

                    result.setText(r + " ");
                }


            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().equals("")||num2.getText().toString().equals(""))
                {
                    Toast.makeText(CalculatorMainActivity.this, "Please Enter Your value", Toast.LENGTH_SHORT).show();
                }
                else {
                    String value1 = num1.getText().toString();
                    String value2 = num2.getText().toString();
                    Double r = Double.parseDouble(value1) / Double.parseDouble(value2);

                    result.setText(r + " ");
                }



            }
        });

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().equals("")||num2.getText().toString().equals(""))
                {
                    Toast.makeText(CalculatorMainActivity.this, "Please Enter Your value", Toast.LENGTH_SHORT).show();
                }
                else {
                    String value1 = num1.getText().toString();
                    String value2 = num2.getText().toString();
                    Double r = Double.parseDouble(value1) % Double.parseDouble(value2);

                    result.setText(r + " ");
                }



            }
        });
    }
}
