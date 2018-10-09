package com.example.hp15.juparentportal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_);
        Thread th = new Thread(){
            public void run(){
                try{
                    sleep(6000);

                }
                catch(Exception e){

                }
                finally{
                    Intent i = new Intent(Splash_Activity.this, LoginActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        th.start();


    }
}
