package com.goldducks.a8crack;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout linearLayout = (FrameLayout) findViewById(R.id.ll);
        linearLayout.addView(new GuidlineView(this).getView());
    }

}
