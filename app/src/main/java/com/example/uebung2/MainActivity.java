package com.example.uebung2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    static int zaehler = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Titel der Activity setzen
        setTitle(this.getClass().getSimpleName());

        // Button im Code erzeugen
        button = findViewById(R.id.btn);

        // Text setzen
        button.setText("Der Zaehler lautet: " + zaehler);

        // Click-Listener aktivieren
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == button) {
            // Intent für neue Instanz von MainActivity erzeugen
            Intent intent = new Intent(this, MainActivity.class);

            // Zähler erhöhen
            zaehler += 1;

            // Neue Instanz starten
            startActivity(intent);
        }
    }
}
