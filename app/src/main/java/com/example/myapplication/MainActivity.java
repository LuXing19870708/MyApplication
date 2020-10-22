package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dave.androidlibrary.DaveTool;
import com.dave.androidlibrary.Me;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.demoMsg);
        button = findViewById(R.id.demoBtn);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        // {"name":"mkddd","age":"23"}
        Me m = DaveTool.parseMeObjectWithJsonString("{\"name\":\"kingxxxxx\",\"age\":\"23\"}");
        Log.e("kssg",m.getName());
    }


    /**
     * @param
     * @return
     */
    private int add(int x,int y){
        return x + y;
    }

    //minus method is added by david
    private int minus(int x,int y){
        return x - y;
    }

    private void log(String s){
        Log.e("kssg",s);
    }

}