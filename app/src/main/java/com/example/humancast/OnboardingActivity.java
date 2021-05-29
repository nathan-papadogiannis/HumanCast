package com.example.humancast;

import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.cuberto.liquid_swipe.LiquidPager;

public class OnboardingActivity extends AppCompatActivity implements Frag1.OnFragmentInteractionListener,
                                                            Frag2.OnFragmentInteractionListener,
                                                            Frag3.OnFragmentInteractionListener{

    private LiquidPager pager;
    private Intro viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
        pager = findViewById(R.id.pager);
        viewPager = new Intro(getSupportFragmentManager(), 1);
        pager.setAdapter(viewPager);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
