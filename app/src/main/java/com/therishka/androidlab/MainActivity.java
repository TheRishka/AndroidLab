package com.therishka.androidlab;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toRelative = (Button) findViewById(R.id.to_relative);
        Button toLinear = (Button) findViewById(R.id.to_linear);

        toRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleClicks(view.getId());
            }
        });

        toLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleClicks(view.getId());
            }
        });


    }

    private void handleClicks(@IdRes int buttonId) {
        switch (buttonId) {
            case R.id.to_linear:
                ScreenDelegate.startScreen(ScreenDelegate.Screens.LINEAR_LAYOUT_SCREEN, this);
                break;
            case R.id.to_relative:
                ScreenDelegate.startScreen(ScreenDelegate.Screens.RELATIVE_LAYOUT_SCREEN, this);
                break;
        }
    }
}
