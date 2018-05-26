package com.blyth.luke.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private void displayToast(String messageToShow) {
        Toast.makeText(MainActivity.this, messageToShow, Toast.LENGTH_SHORT).show();
    }



    public void Guess(View view) {
        EditText guessEditText  = findViewById(R.id.guessEditText);
        int guess = Integer.parseInt(guessEditText.getText().toString());
        int number = ((randomNumberGenerator) this.getApplication()).getRandomNumber();
        if (guess == number) {
            displayToast("Congratulations you guessed correctly");
            ((randomNumberGenerator) this.getApplication()).setRandomNumber();
            return;
        }
        if (guess < number) {
            displayToast("Higher!");
        } else if  (guess > number) {
            displayToast("Lower!");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomNumberGenerator rnd =  ((randomNumberGenerator)getApplication());
        rnd.setRandomNumber();

    }
}
