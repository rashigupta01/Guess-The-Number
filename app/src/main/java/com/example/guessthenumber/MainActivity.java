package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int number;
    public void btnClick (View view) {
        EditText numberGuessed = findViewById(R.id.guessed);
        int guess = Integer.parseInt(numberGuessed.getText().toString());
        if(guess == number) {
            Toast.makeText(this, "You got it! Try again.", Toast.LENGTH_SHORT).show();
            number = (int)(Math.random()*18) + 2;
        } else if(guess > number) {
            Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = (int)(Math.random()*18) + 2;
    }
}