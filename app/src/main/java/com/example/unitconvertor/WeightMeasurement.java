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

public class WeightMeasurement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weight_measure_ment);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnGk = findViewById(R.id.gToK);
        Button btnMg = findViewById(R.id.mToG);
        Button btnMk = findViewById(R.id.mToK);

        btnGk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGk = new Intent(WeightMeasurement.this, GramToKilogramOrVv.class);
                startActivity(intentGk);
                finish();
            }
        });

        btnMg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMg = new Intent(WeightMeasurement.this, MilligramToGramOrVv.class);
                startActivity(intentMg);
                finish();
            }
        });

        btnMk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMk = new Intent(WeightMeasurement.this, MilligramToKilogramOrVv.class);
                startActivity(intentMk);
                finish();
            }
        });
    }
}