package com.therishka.androidlab;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * @author Rishad Mustafaev
 */

public class ColorActivity extends AppCompatActivity {

    RelativeLayout rootLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        rootLayout = (RelativeLayout) findViewById(R.id.root_layout);
    }

    private void changeRootColor(@NonNull String color) {
        int colorInt = Color.parseColor(color);
        rootLayout.setBackgroundColor(colorInt);
    }

    private void showError(@Nullable String errorMesage) {
        Toast.makeText(this, errorMesage, Toast.LENGTH_SHORT).show();
    }
}
