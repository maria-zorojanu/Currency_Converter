package com.example.curencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ConvertCurrency(View view)
    {
        Log.i("Info", "Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal);

        String amountInPounds = editText.getText().toString();

        double amountInPoundsDouble=Double.parseDouble(amountInPounds);

        double amountInDollarsDouble = amountInPoundsDouble * 1.42;

        String amountInDollarsString = String.format("%.2f", amountInDollarsDouble);

        Toast.makeText(this, "£"+amountInPounds+"is $"+amountInDollarsString, Toast.LENGTH_LONG).show();
        Log.i("Amount in dollars", amountInDollarsString);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}