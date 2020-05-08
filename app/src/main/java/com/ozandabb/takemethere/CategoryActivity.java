package com.ozandabb.takemethere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ozandabb.takemethere.utils.BottonNavigationViewHelper;

public class CategoryActivity extends AppCompatActivity {

    private Context mContext = CategoryActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }

    private void setupBottomNavigationView(){
        BottomNavigationView bottomNavigationViewEx = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        BottonNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        Intent CategoryIntent = new Intent(this, CategoryActivity.class);
        startActivity(CategoryIntent);
    }
}
