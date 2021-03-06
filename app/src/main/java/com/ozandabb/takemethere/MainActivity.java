package com.ozandabb.takemethere;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
//    private Toolbar mainToolBar;
    private FirebaseAuth mAuth;
    private ImageView logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        logout = findViewById(R.id.home_logout_btn);

//        mainToolBar = (Toolbar) findViewById(R.id.maintoolbar);
//        setSupportActionBar(mainToolBar);
//        getSupportActionBar().setLogo(R.drawable.logo);
//        getSupportActionBar().setDisplayUseLogoEnabled(true);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                sendToLogin();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser CurrentUser = FirebaseAuth.getInstance().getCurrentUser();
        if (CurrentUser == null) {
            sendToLogin();
        } else {
            // No user is signed in
        }
    }

    private void logout(){
        mAuth.signOut();
        sendToLogin();
    }

    private void sendToLogin() {
        Intent goLogin = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(goLogin);
        finish();
    }
}
