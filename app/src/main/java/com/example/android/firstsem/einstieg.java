package com.example.android.firstsem;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class einstieg extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_einstieg);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_einstieg, menu);
        return true;
    }

    public void switchToChecklist(View view){
        startActivity(new Intent(einstieg.this, checklist.class));
    }

    public void switchToLinklist(View view){
        startActivity(new Intent(einstieg.this, Linklist.class));
    }

    public void switchToPlan(View view){
        startActivity(new Intent(einstieg.this, plan.class));
    }

    public void return_back(View view){
        startActivity(new Intent(einstieg.this, MainActivity.class));
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
}
