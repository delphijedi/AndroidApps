package com.blyth.luke.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public void clickMeOnClick(View view) {
        EditText yourNameText = findViewById(R.id.enterYournameText);
        String intro = "Hi There! ";
        Toast.makeText(MainActivity.this, intro.concat(yourNameText.getText().toString()), Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
