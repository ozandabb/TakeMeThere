package com.ozandabb.takemethere.utils;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ozandabb.takemethere.CategoryActivity;
import com.ozandabb.takemethere.MainActivity;
import com.ozandabb.takemethere.R;

public class BottonNavigationViewHelper {

//    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
//        bottomNavigationViewEx.enableAnimation(false);
//        bottomNavigationViewEx.enableItemShiftingMode(false);
//        bottomNavigationViewEx.enableShiftingMode(false);
//        bottomNavigationViewEx.setTextVisibility(false);
//    }

    public static void enableNavigation(final Context context, BottomNavigationView view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_house:
                        Intent homeintent = new Intent(context, MainActivity.class);
                        context.startActivity(homeintent);
                    break;

                    case R.id.ic_category:
                        Intent CategoryIntent = new Intent(context, CategoryActivity.class);
                        context.startActivity(CategoryIntent);
                        break;
                }
                return false;
            }
        });
    }
}
