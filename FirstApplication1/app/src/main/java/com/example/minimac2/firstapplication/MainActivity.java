package com.example.minimac2.firstapplication;

import android.app.DatePickerDialog;
import android.app.Dialog;
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
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity  {

    static Button from_date_text,to_date_text,button,done_date_filter, today_button, tomorrow_button, this_weekend_button, this_week_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        from_date_text =(Button) findViewById(R.id.from_date_text);
        to_date_text = (Button) findViewById(R.id.to_date_text);
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


     from_date_text.setOnClickListener(new View.OnClickListener()
     {
         @Override
         public void onClick(View v){
             showTruitonTimePickerDialog(v);
             showTruitonDatePickerDialog(v);
         }
     });
        to_date_text.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                showTruitonTimePickerDialog(v);
                showTruitonDatePickerDialog(v);
            }
        });

    }

    public void showTruitonDatePickerDialog(View v){
        DialogFragment fragment= new DatePickerFragment();
        fragment.show(getSupportFragmentManager(), "datePicker");
    }
    public static class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener
    {
     @Override
     public Dialog onCreateDialog(Bundle savedInstanceState) {
         // Use the current date as the default date in the picker
         final Calendar c = Calendar.getInstance();
         int year = c.get(Calendar.YEAR);
         int month = c.get(Calendar.MONTH);
         int day = c.get(Calendar.DAY_OF_MONTH);

         // Create a new instance of DatePickerDialog and return it
         return new DatePickerDialog(getActivity(), this, year, month, day);
     }
        public void onDateSet(DatePicker view, int year, int month, int day) {



//            if (view.equals(from_date_text)) {
//                from_date_text.setText(day + "/" + (month + 1) + "/" + year);
//            } else {
//                to_date_text.setText(day + "/" + (month + 1) + "/" + year);
//            }
// Do something with the time chosen by the user
            from_date_text.setText(day + "/" + (month + 1) + "/" + year);
            to_date_text.setText(day + "/" + (month + 1) + "/" + year);
        }
    }

    public void showTruitonTimePickerDialog(View v){
        DialogFragment fragment=new TimePickerFragment();
        fragment.show(getSupportFragmentManager(), "timePicker");


    }
     public static class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener
     {

         @Override
         public Dialog onCreateDialog(Bundle savedInstanceState) {
             final Calendar c = Calendar.getInstance();
             int hour = c.get(Calendar.HOUR);
             int minute = c.get(Calendar.MINUTE);

             // Create a new instance of TimePickerDialog and return it
             return new TimePickerDialog(getActivity(), this, hour, minute,
                     DateFormat.is24HourFormat(getActivity()));
         }
         public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
             String AM_PM;
             if(hourOfDay < 12) {
                 AM_PM = "AM";

             } else {
                 AM_PM = "PM";

             }

//             if (view.equals(from_date_text)) {
//                 from_date_text.setText(from_date_text.getText() + " -" + hourOfDay + ":" + minute + ":" + AM_PM);
//             } else {
//                 to_date_text.setText(to_date_text.getText() + " -" + hourOfDay + ":" + minute + ":" + AM_PM);
//             }

             // Do something with the time chosen by the user
             from_date_text.setText(from_date_text.getText() + " -" + hourOfDay + ":" + minute + ":" + AM_PM);
             to_date_text.setText(to_date_text.getText() + " -" + hourOfDay + ":" + minute + ":" + AM_PM);
         }
     }


}
