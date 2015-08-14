package com.aquarids.pinlocker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.aquarids.library.Indicator;
import com.aquarids.library.Keyboard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Keyboard keyboard = (Keyboard) findViewById(R.id.keyboard);
        final Indicator indicator = (Indicator) findViewById(R.id.indicator);

        indicator.setKeyboard(keyboard);
        indicator.setInteractEnable(true);
        keyboard.setVibratorEnable(true);

        indicator.setOnPasswordInputCompleted(new Indicator.OnPasswordInputCompleted() {
            @Override
            public void onPasswordInputCompleted(String password) {
                Log.e("password", password);
                indicator.restore();
            }
        });
    }


}
