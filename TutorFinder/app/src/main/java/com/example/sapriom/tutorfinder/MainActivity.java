package com.example.sapriom.tutorfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    Button searchButton, registerstudentbutton, registertutorbutton, loginstudentbutton, logintutorbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logintutorbutton = findViewById(R.id.logitutorbutton);

        YoYo.with(Techniques.BounceInRight)
                .duration(700)
                .repeat(2)
                .playOn(findViewById(R.id.logitutorbutton));

        logintutorbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TutorLoginMain2Activity.class);
                startActivity(intent);
            }
        });

        registertutorbutton = findViewById(R.id.registertutobutton);

        YoYo.with(Techniques.BounceInLeft)
                .duration(700)
                .repeat(2)
                .playOn(findViewById(R.id.registertutobutton));

        registertutorbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegisterAsTutorMain2Activity.class);
                startActivity(intent);
            }
        });


        searchButton = findViewById(R.id.searchButton);

        YoYo.with(Techniques.BounceInRight)
                .duration(700)
                .repeat(2)
                .playOn(findViewById(R.id.searchButton));

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SearchForTutorMain2Activity.class);
                startActivity(intent);
            }
        });



    }
}
