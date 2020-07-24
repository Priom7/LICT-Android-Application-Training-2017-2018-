package com.example.sapriom.tutorfinder;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TableLayout;

import com.example.sapriom.tutorfinder.ViewPagerAdapter.ViewpgrAdapter;
import com.example.sapriom.tutorfinder.fragment.fragment1;
import com.example.sapriom.tutorfinder.fragment.fragment2;
import com.example.sapriom.tutorfinder.fragment.fragment3;

public class TutorsProfileMain2Activity extends AppCompatActivity {

    TabLayout tabLayout;
    Toolbar toolbar;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutors_profile_main2);

        toolbar = findViewById(R.id.tutorsprofiletoolbar);
        tabLayout = findViewById(R.id.tutorsprofiletablayout);
        viewPager = findViewById(R.id.tutorsProfileVIewpager);

        setSupportActionBar(toolbar);
        setDataToViewPager();
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setDataToViewPager() {

        ViewpgrAdapter adapter = new ViewpgrAdapter(getSupportFragmentManager());
        adapter.addFragment(new fragment1(), " Profile ");
        adapter.addFragment(new fragment2(), " Available ");
        adapter.addFragment(new fragment3(), " Reviews ");
        viewPager.setAdapter(adapter);


    }
}
