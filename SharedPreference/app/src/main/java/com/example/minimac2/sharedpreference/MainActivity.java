package com.example.minimac2.sharedpreference;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    EditText message;
    SeekBar seekBar;
    Float font_size;
    String font_color;
    String text_info;
    Button button,button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        message=(EditText)findViewById(R.id.message);
        seekBar=(SeekBar)findViewById(R.id.seek_bar);
        button=(Button)findViewById(R.id.button);
        button1=(Button)findViewById(R.id.button1);


        SharedPreferences sharedPreferences= MainActivity.this.getSharedPreferences(getString(R.string.app_file),MODE_PRIVATE);
        text_info= sharedPreferences.getString(getString(R.string.app_info),"");
        message.setText(text_info);
        font_size=sharedPreferences.getFloat(getString(R.string.app_size),20);
        font_color=sharedPreferences.getString(getString(R.string.app_color),"");
        message.setTextSize(TypedValue.COMPLEX_UNIT_PX,font_size);

        if (font_size==20){
            seekBar.setProgress(0);
        }
        else {
            seekBar.setProgress(8);
        }
        if (font_color.equals("RED")){
            message.setTextColor(Color.parseColor("#FF0000"));
        }
        else if(font_color.equals("BLUE")) {
            message.setTextColor(Color.parseColor("#0000FF"));

        }
        else if (font_color.equals("GREEN")){
            message.setTextColor(Color.parseColor("#008000"));
        }


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                message.setTextSize(TypedValue.COMPLEX_UNIT_DIP,seekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                font_size=message.getTextSize();

            }
        });
    }

    public void changeColor(View view){
        switch (view.getId()){

            case R.id.radio:
                message.setTextColor(Color.parseColor("#FF0000"));
                font_color="RED";
                break;
            case R.id.radio1:
                message.setTextColor(Color.parseColor("#0000FF"));
                font_color="BLUE";
                break;
            case R.id.radio2:
                message.setTextColor(Color.parseColor("#008000"));
                font_color="GREEN";
                break;

        }

    }

    public void saveString(View view){

        SharedPreferences sharedPreferences= MainActivity.this.getSharedPreferences(getString(R.string.app_file),MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putFloat(getString(R.string.app_size),font_size);
        editor.putString(getString(R.string.app_color),font_color);
        editor.putString(getString(R.string.app_info),message.getText().toString());
        editor.commit();

    }
    public void stopString(View view){
        SharedPreferences sharedPreferences= MainActivity.this.getSharedPreferences(getString(R.string.app_file),MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.clear();
        editor.commit();


    }
}
