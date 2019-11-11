package com.example.architecturemvc.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.architecturemvc.R;
import com.example.architecturemvc.pojo.MoiveModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView getdata;
Button butGetData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getdata = findViewById(R.id.textview);
        butGetData = findViewById(R.id.button);
        butGetData.setOnClickListener(this);
    }


///////////////////////////    controller       //////////////////////////////////
    public MoiveModel moiveModeldatabase(){
    return new MoiveModel("alaa" , "meaad" , "zamalek" , 1);
    }


    public void getdatamoive() {
        getdata.setText(moiveModeldatabase().getName());
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button){
getdatamoive();
        }
    }
}
