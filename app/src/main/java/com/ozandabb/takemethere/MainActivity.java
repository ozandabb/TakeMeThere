package com.ozandabb.takemethere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ozandabb.takemethere.utils.BottonNavigationViewHelper;

public class MainActivity extends AppCompatActivity {

    private Context mContext = MainActivity.this;

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void setupBottomNavigationView(){
        BottomNavigationView bottomNavigationViewEx = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        //BottonNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottonNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        Intent homeintent = new Intent(this, MainActivity.class);
        startActivity(homeintent);
    }
}
