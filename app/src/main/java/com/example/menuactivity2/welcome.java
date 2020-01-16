package com.example.menuactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
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
        if (id == R.id.LogIn) {

            Intent avi=new Intent(welcome.this,login.class);
            avi.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(avi);
        }
        if (id == R.id.Register) {
            Intent avi = new Intent(welcome.this, register.class);
            avi.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(avi);
        }
        if (id == R.id.Exit) {
            finishAffinity();
        }

        return super.onOptionsItemSelected(item);
    }
}
