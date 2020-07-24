package com.example.sapriom.calculatorallinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CgpaMainActivity extends AppCompatActivity {

    EditText ed, ed2, ed3, ed4, ed6, ed7, ed8, ed9, edt, edt3, edt4, edt5, edt6, edt7, edt8, edt9;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_main);

        Button btn = (Button) findViewById(R.id.button);
        final TextView txt = (TextView) findViewById(R.id.result);
        ed = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
        ed3 = (EditText) findViewById(R.id.editText3);
        ed4 = (EditText) findViewById(R.id.editText4);
        ed6 = (EditText) findViewById(R.id.editText6);
        ed7 = (EditText) findViewById(R.id.editText7);
        ed8 = (EditText) findViewById(R.id.editText8);
        ed9 = (EditText) findViewById(R.id.editText9);

        edt = (EditText) findViewById(R.id.edit);
        edt3 = (EditText) findViewById(R.id.edit3);
        edt4 = (EditText) findViewById(R.id.edit4);
        edt5 = (EditText) findViewById(R.id.edit5);
        edt6 = (EditText) findViewById(R.id.edit6);
        edt7 = (EditText) findViewById(R.id.edit7);
        edt8 = (EditText) findViewById(R.id.edit8);
        edt9 = (EditText) findViewById(R.id.edit9);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if((edt.getText().toString().equals(""))||(edt3.getText().toString().equals(""))||(edt4.getText().toString().equals(""))||(ed.getText().toString().equals(""))||(edt5.getText().toString().equals(""))||(edt6.getText().toString().equals(""))||(edt7.getText().toString().equals(""))||(edt8.getText().toString().equals(""))||(edt9.getText().toString().equals(""))||(ed2.getText().toString().equals(""))||(ed3.getText().toString().equals(""))||(ed4.getText().toString().equals(""))||(ed6.getText().toString().equals(""))||(ed7.getText().toString().equals(""))||(ed8.getText().toString().equals(""))||(ed9.getText().toString().equals("")))
                {
                    Toast.makeText(CgpaMainActivity.this, "Fill Empty Places with 0", Toast.LENGTH_SHORT).show();
                }

                else {


                    String v1 = edt.getText().toString();
                    String v2 = edt3.getText().toString();
                    String v3 = edt4.getText().toString();
                    String v4 = edt5.getText().toString();
                    String v5 = edt6.getText().toString();
                    String v6 = edt7.getText().toString();
                    String v7 = edt8.getText().toString();
                    String v8 = edt9.getText().toString();

                    Double total = Double.parseDouble(v1) + Double.parseDouble(v2) + Double.parseDouble(v3) + Double.parseDouble(v4) + Double.parseDouble(v5) + Double.parseDouble(v6) + Double.parseDouble(v7) + Double.parseDouble(v8);


                    String value1 = ed.getText().toString();
                    String value2 = edt.getText().toString();
                    Double r1 = Double.parseDouble(value1) * Double.parseDouble(value2);

                    String value3 = ed2.getText().toString();
                    String value4 = edt3.getText().toString();
                    Double r2 = Double.parseDouble(value3) * Double.parseDouble(value4);

                    String value5 = ed3.getText().toString();
                    String value6 = edt4.getText().toString();
                    Double r3 = Double.parseDouble(value5) * Double.parseDouble(value6);

                    String value7 = ed4.getText().toString();
                    String value8 = edt5.getText().toString();
                    Double r4 = Double.parseDouble(value7) * Double.parseDouble(value8);

                    String value9 = ed6.getText().toString();
                    String value10 = edt6.getText().toString();
                    Double r5 = Double.parseDouble(value9) * Double.parseDouble(value10);

                    String value11 = ed7.getText().toString();
                    String value12 = edt7.getText().toString();
                    Double r6 = Double.parseDouble(value11) * Double.parseDouble(value12);

                    String value13 = ed8.getText().toString();
                    String value14 = edt8.getText().toString();
                    Double r7 = Double.parseDouble(value13) * Double.parseDouble(value14);

                    String value15 = ed9.getText().toString();
                    String value16 = edt9.getText().toString();
                    Double r8 = Double.parseDouble(value15) * Double.parseDouble(value16);


                    Double result = (r1 + r2 + r3 + r4 + r5 + r6 + r7 + r8) / total;

                    txt.setText(result + "");

                }

            }
        });

    }
}






