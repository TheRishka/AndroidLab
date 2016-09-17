package com.therishka.androidlab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KittenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitten);
        Button btn = (Button) findViewById(R.id.button);
        final TextView tv = (TextView) findViewById(R.id.cat_name);
        final EditText et = (EditText) findViewById(R.id.cat_name_input);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(et.getText().toString())) {
                    tv.setText("Hello");
                } else {
                    tv.setText(et.getText());
                }
            }
        });


    }
}
