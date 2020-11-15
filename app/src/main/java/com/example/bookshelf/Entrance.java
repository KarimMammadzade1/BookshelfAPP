package com.example.bookshelf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Entrance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrance);

        final ViewPager viewPager;
        final Adapter adapter;
        Button changebtn;
        List<Model> models;
        Integer[] colors = null;
        final ArgbEvaluator argbEvaluator = new ArgbEvaluator();

        models = new ArrayList<>();
        models.add(new Model(R.drawable.atomiclove, "Atomic Love", " "));
        models.add(new Model(R.drawable.beyondthehorizon, "Beyond The Horizon", " "));
        models.add(new Model(R.drawable.deadlyalliance, "Poster", " "));
        models.add(new Model(R.drawable.myfunnyvalentine,"My Funny Valentine", " "));
        models.add(new Model(R.drawable.theflightgirls,"The Flight Girls" ," "));
        models.add(new Model(R.drawable.thefortunateones,"The Fortunate Ones" ," "));
        //models.add(new Model(R.drawable.thegermanheiress,"Namecard" ," "));
        models.add(new Model(R.drawable.thelastyearofthewar,"The Last Year Of The War" ," "));
        models.add(new Model(R.drawable.theverdunaffair,"The Verdun Affair" ," "));
        models.add(new Model(R.drawable.atomiclove, "Atomic Love", " "));
        models.add(new Model(R.drawable.beyondthehorizon, "Beyond The Horizon", " "));
        models.add(new Model(R.drawable.deadlyalliance, "Poster", " "));
        models.add(new Model(R.drawable.myfunnyvalentine,"My Funny Valentine", " "));
changebtn=findViewById(R.id.changebtn);
changebtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
});


        adapter = new Adapter(models, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130, 0, 130, 0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4)
        };

        colors = colors_temp;

        final Integer[] finalColors = colors;
        final Integer[] finalColors1 = colors;
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                if (position < (adapter.getCount() -1) && position < (finalColors.length - 1)) {
                    viewPager.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    finalColors[position],
                                    finalColors[position + 1]
                            )
                    );
                }

                else {
                    viewPager.setBackgroundColor(finalColors[finalColors1.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}

