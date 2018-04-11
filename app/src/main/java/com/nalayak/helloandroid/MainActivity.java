package com.nalayak.helloandroid;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.callText);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "Nilland.ttf");
        textView.setTypeface(typeface);

        TextView textView1 = findViewById(R.id.websiteText);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "Nilland.ttf");
        textView1.setTypeface(typeface1);

        TextView textView2 = findViewById(R.id.addressText);
        Typeface typeface2 = Typeface.createFromAsset(getAssets(), "Nilland.ttf");
        textView2.setTypeface(typeface2);
    }
}
