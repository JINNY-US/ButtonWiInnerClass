package com.example.buttonwiinnerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton1;
    TextView mtextview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.button);
        mtextview1 = findViewById(R.id.textView);

        mButton1.setOnClickListener(new MyOnclickListener(this));
    }

    private class MyOnclickListener implements View.OnClickListener {
        MainActivity mainActivity;
        public MyOnclickListener(MainActivity mainActivity) {
            this.mainActivity = mainActivity;
        }

        @Override
        public  void onClick(View v) {
            mainActivity.mtextview1.setText("YOu clicked 김경진's button!");
        }
    }
}