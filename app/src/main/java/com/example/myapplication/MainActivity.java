package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TEXT_STATE = "currentText";
    private int count=0;
    TextView textView;
    ProgressBar mprogressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button  btn_start=findViewById(R.id.start);
        Button  btn_end=findViewById(R.id.end);
        textView=findViewById(R.id.textView);
        mprogressBar=findViewById(R.id.progressBar);


        btn_start.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                //todo:點擊事件
            }
        });

        btn_end.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                count=0;
                textView.setText(Integer.toString(count));
            }
        });

        if(savedInstanceState!=null)
            textView.setText(savedInstanceState.getString(TEXT_STATE));

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(TEXT_STATE,textView.getText().toString());
    }
}