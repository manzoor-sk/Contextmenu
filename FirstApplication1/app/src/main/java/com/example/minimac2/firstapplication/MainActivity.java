package com.example.minimac2.firstapplication;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int Year, Month, Day, mHour, mMinute;

    private DatePickerDialog fromDateDialog, toDateDialog;
    private TimePickerDialog fromTimeDialog, toTimeDialog;

    private Button done_date_filter, today_button, tomorrow_button, this_weekend_button, this_week_button,df_from_date_text, df_to_date_text,button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        df_from_date_text = (Button) findViewById(R.id.df_from_date_text);
        df_to_date_text = (Button) findViewById(R.id.df_to_date_text);

        df_from_date_text.setOnClickListener(this);
        df_to_date_text.setOnClickListener(this);

        button = (Button) findViewById(R.id.button);
        today_button = (Button) findViewById(R.id.today_button);
        tomorrow_button = (Button) findViewById(R.id.tomorrow_button);
        this_weekend_button = (Button) findViewById(R.id.this_weekend_button);
        this_week_button = (Button) findViewById(R.id.this_week_button);
        done_date_filter = (Button) findViewById(R.id.done_date_filter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });
        today_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });
        tomorrow_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });
        this_weekend_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });
        this_week_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });
        done_date_filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onClick(View v) {

        if (v == df_from_date_text) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            Year = c.get(Calendar.YEAR);
            Month = c.get(Calendar.MONTH);
            Day = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            df_from_date_text.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, Year, Month, Day);
            datePickerDialog.show();
        }

        if (v == df_to_date_text) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            Year = c.get(Calendar.YEAR);
            Month = c.get(Calendar.MONTH);
            Day = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            df_to_date_text.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, Year, Month, Day);
            datePickerDialog.show();

        }

    }

}
