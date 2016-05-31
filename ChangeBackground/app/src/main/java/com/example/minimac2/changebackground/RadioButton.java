package com.example.minimac2.changebackground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RadioButton extends AppCompatActivity {

    private RadioGroup radioGroup;
//    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.silent) {

                    Toast.makeText(getApplicationContext(), "Silent",

                            Toast.LENGTH_SHORT).show();

                } else if(checkedId == R.id.sound) {

                    Toast.makeText(getApplicationContext(), "Sound",

                            Toast.LENGTH_SHORT).show();

                } else {

                    Toast.makeText(getApplicationContext(), "Vibration",

                            Toast.LENGTH_SHORT).show();

                }

            }

        });

    }

}
