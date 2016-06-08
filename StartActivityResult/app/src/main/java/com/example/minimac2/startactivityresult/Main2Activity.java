package com.example.minimac2.startactivityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RadioGroup radioGroup=(RadioGroup)findViewById(R.id.radio_group);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                RadioButton radioButton=(RadioButton)findViewById(checkedId);

                String actionbar =radioButton.getText().toString();
                Intent intent= new Intent();
                intent.putExtra("actionbar",actionbar);
                setResult(RESULT_OK,intent);
                finish();

            }
        });
    }
}
