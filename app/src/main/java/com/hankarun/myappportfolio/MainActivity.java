package com.hankarun.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements Button.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        String name = "";
        switch (v.getId()){
            case R.id.button:
                name = "Spotify Streamer";
                break;
            case R.id.button2:
                name = "Scores App";
                break;
            case R.id.button3:
                name = "Library App";
                break;
            case R.id.button4:
                name = "Build It Bigger";
                break;
            case R.id.button5:
                name = "XYZ Reader";
                break;
            case R.id.button6:
                name = "Capstone";
                break;
        }
        Toast.makeText(getApplicationContext(), "This button will launch my "+ name + " app!", Toast.LENGTH_SHORT).show();

    }
}
