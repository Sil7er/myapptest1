package com.example.myapptest1;

import android.app.Activity;
import android.os.Bundle;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void start(){
        int s = 10;
        s++;
        s++;
        s--;
    }

    public void starter(){
        int x = 12;
        x++;
        
    }
}
