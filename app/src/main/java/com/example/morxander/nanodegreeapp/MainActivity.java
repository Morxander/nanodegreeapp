package com.example.morxander.nanodegreeapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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

    public void sendMessage(View view){
        String message = "";
        switch (view.getId())
        {
            case R.id.bt_spotify:
                message = getResources().getString(R.string.bt_spotify_toast);
                break;
            case R.id.bt_scores:
                message = getResources().getString(R.string.bt_scores_toast);
                break;
            case R.id.bt_library:
                message = getResources().getString(R.string.bt_library_toast);
                break;
            case R.id.bt_build:
                message = getResources().getString(R.string.bt_library_toast);
                break;
            case R.id.bt_reader:
                message = getResources().getString(R.string.bt_reader_toast);
                break;
            case R.id.bt_capstone:
                message = getResources().getString(R.string.bt_capstone_toast);
                break;

        }
        Toast.makeText(getApplicationContext(),message, Toast.LENGTH_SHORT).show();
    }
}
