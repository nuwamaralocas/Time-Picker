package com.bonaparte.now;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TimePicker time;
    Button click;
    TextView Current_Time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showTime();
    }

        public void showTime() {
            time = (TimePicker) findViewById(R.id.time);
            click = (Button) findViewById(R.id.click);
            Current_Time=(TextView)findViewById(R.id.text);

            time.setIs24HourView(true);
            click.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(getBaseContext(), time.getCurrentHour() + " : " + time.getCurrentMinute(),
                                    Toast.LENGTH_SHORT).show();
                            Current_Time.setText( time.getCurrentHour() + " : " + time.getCurrentMinute());
                        }


                    }
            );
        }}
