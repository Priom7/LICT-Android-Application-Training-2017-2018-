package com.example.sapriom.tutorfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TutorLoginMain2Activity extends AppCompatActivity {

    Button tutorsLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_login_main2);

        tutorsLoginButton = findViewById(R.id.tutorsLoginButton);

        tutorsLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TutorLoginMain2Activity.this, TutorsProfileMain2Activity.class);
                startActivity(intent);
            }
        });
    }
}
