package com.example.win10.waterrescue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class tangki_baku extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    Switch switch1;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tangki_baku);

        textView = (TextView) findViewById(R.id.textView);
        switch1 = (Switch) findViewById(R.id.switch1);

        switch1.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (switch1.isChecked()){
            textView.setText("Switch on");
        }else{
            textView.setText("Switch off");
        }

    }
}
