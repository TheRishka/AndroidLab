package com.therishka.androidlab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author Rishad Mustafaev.
 */
public class ViewsShowcase extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showcase);

        final TextView textView = (TextView) findViewById(R.id.showcase_text);

        final EditText textInput = (EditText) findViewById(R.id.showcase_edit_text);
        final EditText textInputBig = (EditText) findViewById(R.id.showcase_edit_text_big);

        Button btn = (Button) findViewById(R.id.btn);
        Button btnBig = (Button) findViewById(R.id.btn_big);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textInput.getText());
            }
        });

        btnBig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textInputBig.getText());
            }
        });
    }

}
