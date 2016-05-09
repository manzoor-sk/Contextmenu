package com.example.minimac2.addstrings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

    String string = "ABCD";
    String string1 = "XYZ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);

//the StringBuffer class is used to manipulate character strings

        StringBuffer stringBuffer = new StringBuffer();


        for (int i = 0; i < string.length(); i++) {
            if (i < string.length())
                stringBuffer.append(string.charAt(i));
            if (i < string1.length())
                stringBuffer.append(string1.charAt(i));
        }
        text.setText(stringBuffer.toString());

    }


}
