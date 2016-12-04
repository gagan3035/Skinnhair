package com.satyahair.skinnhair.view.hair;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.satyahair.skinnhair.R;
import com.satyahair.skinnhair.view.PromotionalPagerAdapter;
import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.TitlePageIndicator;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by s.gagandeep on 11/18/2016.
 */
public class HairCareActivity extends AppCompatActivity {


    RecyclerView userOptions;
    ViewPager promtionalEvent;
    int currentPage = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hairnskin_layout);
        userOptions = (RecyclerView)findViewById(R.id.user_options);
        promtionalEvent = (ViewPager)findViewById(R.id.promtional_event);

        //promtionalEvent.setCurrentItem(2);


        promtionalEvent.setAdapter(new PromotionalPagerAdapter(this));
        CirclePageIndicator circleIndicator = (CirclePageIndicator)findViewById(R.id.circles);
        circleIndicator.setViewPager(promtionalEvent);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),3);
        userOptions.setLayoutManager(gridLayoutManager);
        userOptions.setAdapter(new HairCareAdapter(this));


        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == 3) {
                    currentPage = 0;
                }
                promtionalEvent.setCurrentItem(currentPage++, true);
            }
        };

        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {

            @Override
            public void run() {
                handler.post(Update);
            }
        }, 500, 3000);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
