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

public class login extends AppCompatActivity {

    Button b1;
    EditText login_name,login_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_name=findViewById(R.id.editTextemail);
        login_password=findViewById(R.id.editTextpassword);
        b1=findViewById(R.id.loginn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = login_name.getText().toString();
                String pass = login_password.getText().toString();
                if (name.equals("avi") && pass.equals("123456")) {
                    Intent avi = new Intent(login.this, welcome.class);
                    avi.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(avi);
                } else
                    Toast.makeText(login.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();

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

            Intent avi=new Intent(login.this,login.class);
            avi.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(avi);
        }
        if (id == R.id.Register) {
            Intent avi = new Intent(login.this, register.class);
            avi.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(avi);
        }
        if (id == R.id.Exit) {
            finishAffinity();
        }

        return super.onOptionsItemSelected(item);
    }
}
