package com.example.dauntlessdev.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convertPesoListener(View view){

        EditText phText =  (EditText)findViewById(R.id.phEditText);
        EditText usdText = (EditText) findViewById(R.id.usdEditText);

        if (!phText.getText().toString().isEmpty()){
            try {
                double phVal = Double.parseDouble(phText.getText().toString());
                usdText.setText(String.valueOf(phVal * 0.020));
                Toast.makeText(this, "Conversion success!", Toast.LENGTH_SHORT).show();
            }catch(NumberFormatException nf){
                Toast.makeText(this, "Invalid Input!", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "Please enter the amount of the PESO!", Toast.LENGTH_SHORT).show();
        }
    }

    public void convertUSDListener(View view){

        EditText phText =  (EditText)findViewById(R.id.phEditText);
        EditText usdText = (EditText) findViewById(R.id.usdEditText);
        if (!usdText.getText().toString().isEmpty()){
            try{
                double usdVal = Double.parseDouble(usdText.getText().toString());
                phText.setText(String.valueOf(usdVal*50));
                Toast.makeText(this, "Conversion success!", Toast.LENGTH_SHORT).show();
            }catch(NumberFormatException nf){
                Toast.makeText(this, "Invalid Input!", Toast.LENGTH_SHORT).show();
            }
        }else{

            Toast.makeText(this, "Please enter the amount of the USD!", Toast.LENGTH_SHORT).show();
        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
