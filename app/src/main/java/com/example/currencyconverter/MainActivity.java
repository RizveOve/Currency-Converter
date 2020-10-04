package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ConvertCurrency(View view) {
        Log.i("info", "button pressed");
        EditText et = (EditText) findViewById(R.id.editText);
        String taka = et.getText().toString();
        double t = Double.parseDouble(taka);
        double d = t*85;
        String Dollar = Double.toString(d);
        Toast.makeText(this, "$"+Dollar, Toast.LENGTH_LONG).show();
//        Log.i("Amount", Dollar);
    }
}
