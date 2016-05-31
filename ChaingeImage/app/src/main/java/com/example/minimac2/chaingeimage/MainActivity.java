package com.example.minimac2.chaingeimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup group1, group2;
    Button gen;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        group1 = (RadioGroup) findViewById(R.id.rg1);
        group1.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) this);

        group2 = (RadioGroup) findViewById(R.id.rg2);
        group2.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) this);

        img = (ImageView) findViewById(R.id.imageView1);
        // oncheckedChanged function
        gen = (Button) findViewById(R.id.button1);
        gen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

            }
        });

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        // TODO Auto-generated method stub
        switch (checkedId) {
            case R.id.radioButton1:
                img.setImageResource(R.drawable.ic_image);
                break;

            case R.id.radioButton2:
                img.setImageResource(R.drawable.ic_image1);
                break;

            case R.id.radioButton3:
                img.setImageResource(R.drawable.ic_image2);
                break;

            case R.id.radioButton4:
                img.setImageResource(R.drawable.ic_image3);
                break;

            default:
                break;
        }
    }
    }


