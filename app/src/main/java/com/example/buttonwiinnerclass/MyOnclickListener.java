package com.example.buttonwiinnerclass;

import android.view.View;

public class MyOnclickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnclickListener(MainActivity mainActivity) {
    }

    @Override
    public void onClick(View v){
        mainActivity.mtextview1.setText("You Clicked 김경진's button!");
    }

}
