package com.example.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TimePicker time_picker;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showTime();
    }
    public void showTime()
    {
        time_picker=(TimePicker)findViewById(R.id.timePicker);
        btn=(Button)findViewById(R.id.button);
        time_picker.setIs24HourView(true);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),time_picker.getCurrentHour()+":"+time_picker.getCurrentMinute(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
