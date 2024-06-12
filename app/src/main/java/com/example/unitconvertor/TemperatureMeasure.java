package com.example.unitconvertor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TemperatureMeasure extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_temprature_measure);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button buttonKToC = findViewById(R.id.kToc);
        Button buttonCToF = findViewById(R.id.cTof);
        Button buttonKtoF = findViewById(R.id.kTof);


        buttonKToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(TemperatureMeasure.this, KelvinToCelsiusOrVv.class);
                startActivity(intent1);
                finish();
            }
        });

        buttonCToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(TemperatureMeasure.this, CelsiusToFahrenheitOrVv.class);
                startActivity(intent2);
                finish();
            }
        });

        buttonKtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(TemperatureMeasure.this, FahrenheitToKelvinOrVv.class);
                startActivity(intent3);
                finish();
            }
        });
    }
}