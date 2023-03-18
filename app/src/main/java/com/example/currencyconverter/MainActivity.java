package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

import com.example.currencyconverter.R;


public class MainActivity extends AppCompatActivity {

    private Button pTod, dTop;
    private TextView result;
    private EditText enterAmount;
    double result0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dTop = findViewById(R.id.dTop);
        pTod = findViewById(R.id.pTod);
        result = findViewById(R.id.result);
        enterAmount = findViewById(R.id.enterAmount);

        dTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double amount = Double.parseDouble(enterAmount.getText(). toString());
                result0 = (amount * 57.70);
                result.setText(String.valueOf(result0));



            }
        });
        pTod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double amount = Double.parseDouble(enterAmount.getText(). toString());
                result0 = (amount * 0.017);
                result.setText(String.valueOf(result0));
            }
        });
    }
}
