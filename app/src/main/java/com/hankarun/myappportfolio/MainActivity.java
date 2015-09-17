package com.hankarun.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements Button.OnClickListener{
    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        if(mAppToast!=null)
            mAppToast.cancel();
        mAppToast = Toast.makeText(getApplicationContext(), "This button will launch my "+ ((Button)v).getText() + " app!", Toast.LENGTH_SHORT);
        mAppToast.show();

    }
}
