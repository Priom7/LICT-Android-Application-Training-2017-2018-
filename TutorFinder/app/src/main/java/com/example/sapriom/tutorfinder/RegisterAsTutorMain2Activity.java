package com.example.sapriom.tutorfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class RegisterAsTutorMain2Activity extends AppCompatActivity {

    ImageView tutorsRegPageIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_as_tutor_main2);

        tutorsRegPageIV = findViewById(R.id.tutorsregistrationIV);

        YoYo.with(Techniques.BounceInDown)
                .duration(700)
                .repeat(5)
                .playOn(findViewById(R.id.tutorsregistrationIV));
    }
}
