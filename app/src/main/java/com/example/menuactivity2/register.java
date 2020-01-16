package com.example.menuactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.System.exit;

public class register extends AppCompatActivity {

    Button b1;
    EditText regis_name,regis_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        regis_name=findViewById(R.id.emailll);
        regis_password=findViewById(R.id.pasworddd);
        b1=findViewById(R.id.regisss);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent avi = new Intent(register.this, welcome.class);
                avi.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(avi);
            }
        });
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

            Intent avi=new Intent(register.this,login.class);
            avi.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(avi);
        }
        if (id == R.id.Register) {
            Intent avi = new Intent(register.this, register.class);
            avi.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(avi);
        }
        if (id == R.id.Exit) {
            finishAffinity();
        }

        return super.onOptionsItemSelected(item);
    }

}
