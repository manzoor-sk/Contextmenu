package com.example.minimac2.sumofnum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
      int a=5,b=5;
       int sum=(a+b)*(a+b);
        text.setText(text.getText().toString()+String.valueOf(sum));

    }

}