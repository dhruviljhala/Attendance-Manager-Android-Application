package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        logolauncher lh = new logolauncher();
        lh.start();
    }

    private class logolauncher extends Thread
    {
        public void run()
        {
            try{
                sleep(3000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

            Intent a = new Intent(splash.this,MainActivity.class);
            startActivity(a);
            splash.this.finish();
        }
    }
}

