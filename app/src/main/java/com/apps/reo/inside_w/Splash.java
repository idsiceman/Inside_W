package com.apps.reo.inside_w;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;


public class Splash extends Activity {
    private static final int SPLASH_DURATION = 4000;
    private Handler startMain;
    private boolean isBackButtonPressed;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();

        startMain = new Handler();

        startMain.postDelayed(new Runnable() {
            @Override
            public void run()  {
                finish();

                if (!isBackButtonPressed) {
                    Intent intent =
                            new Intent(Splash.this, MainActivity.class);
                    Splash.this.startActivity(intent);
                }
            }
        }, SPLASH_DURATION);
    }

    @Override
    public void onBackPressed() {
        isBackButtonPressed = true;
        super.onBackPressed();
    }

}