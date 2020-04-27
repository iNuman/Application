package com.abdullah.books.ui.home.activity_;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.abdullah.books.R;

//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;

public class SplashActivity extends AppCompatActivity {

//    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        firebaseAuth = FirebaseAuth.getInstance();

//        SystemClock.sleep(3000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        },4000);


    }

    @Override
    protected void onStart() {
        super.onStart();


//        FirebaseUser currentUser = firebaseAuth.getCurrentUser();

//        if(currentUser==null){
//
//            Intent loginIntent = new Intent(SplashActivity.this, RegisterActivity.class);
//            startActivity(loginIntent);
//            finish();
//
//        }else{

//        }

    }
}
