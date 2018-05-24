package com.blyth.luke.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void currencyConvert(View view) {
        EditText currency = findViewById(R.id.currencyEditText);
        double currencyToConvert = Double.valueOf(currency.getText().toString());
        double conversionRate = 0.75;
        double convertedCurrency = currencyToConvert * conversionRate;
        Toast.makeText(MainActivity.this, "£".concat(Double.toString(convertedCurrency)), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
