package com.example.minimac2.minimumvalue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    int[] data = {10,20,30,40,200,345,55,34,77};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      text =(TextView) findViewById(R.id.text);

        text.setText(getMiniFromData() + "");
    }

    private int getMiniFromData() {
        int mini = 0;
        for (int i = 0; i < data.length; i++) {
            if (mini < data[i])
                mini = data[i];
        }
        return mini;
    }
}
