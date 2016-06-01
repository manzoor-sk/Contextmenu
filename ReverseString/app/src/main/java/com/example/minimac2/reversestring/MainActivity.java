package com.example.minimac2.reversestring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

//    String strOriginal = "Welcome";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
//        strOriginal = new StringBuffer(strOriginal).reverse().toString();
//        text.setText(strOriginal.toString());

        StringBuffer buffer = new StringBuffer("Game Plan");
        buffer.reverse();

        text.setText(buffer.toString());
    }


    }


