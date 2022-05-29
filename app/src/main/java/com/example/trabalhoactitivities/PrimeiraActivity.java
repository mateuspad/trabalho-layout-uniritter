package com.example.trabalhoactitivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrimeiraActivity extends AppCompatActivity {

    CardView cardHome;
    CardView cardInfo;
    CardView cardLanguage;
    CardView cardCalendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);
        cardHome = findViewById(R.id.cardHome);
        cardInfo = findViewById(R.id.cardInfo);
        cardLanguage = findViewById(R.id.cardLanguage);
        cardCalendar = findViewById(R.id.cardCalendar);

        cardHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        cardInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SegundaActivity.class);
                startActivity(i);
            }
        });

        cardLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), QuartaActivity.class);
                startActivity(i);
            }
        });

        cardCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), TerceiraActivity.class);
                startActivity(i);
            }
        });
    }
}