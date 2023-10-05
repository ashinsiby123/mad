package com.example.q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    EditText ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.et1);
        ed2 = findViewById(R.id.et2);
    }

    public void login(View view) {
        String u = ed1.getText().toString();
        String p = ed2.getText().toString();
        if(isValidCredentials(u,p)){
            Toast.makeText(this,"login successfull",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"invalid",Toast.LENGTH_SHORT).show();
        }
    }
    private boolean isValidCredentials(String u,String p){
        return u.equals("ashin")&&p.equals("1234");
    }
}