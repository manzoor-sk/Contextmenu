package com.example.minimac2.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView text_view;

    int[] data = {1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_view = (TextView) findViewById(R.id.text_view);
        text_view.setText(getMaxFromData() + "");


    }

    private int getMaxFromData() {
        int max = 0;
        for (int i = 0; i < data.length; i++) {
            if (max < data[i])
                max = data[i];
        }
        return max;
    }
}
