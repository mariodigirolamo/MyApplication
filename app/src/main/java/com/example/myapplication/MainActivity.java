package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //View del layout

    private TextView vMessaggio;
    private Button vAumenta;
    private Button vDiminuisci;

    private int contatore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Importa riferimenti Layout

        vMessaggio = findViewById(R.id.textConteggio);
        vAumenta = findViewById(R.id.btnAggiungi);
        vDiminuisci = findViewById(R.id.btnDiminuisci);

        //Impostazioni pulsanti

        vAumenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ++contatore;
                visualizzaMessaggio();
            }

        });

        vDiminuisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                --contatore;
                visualizzaMessaggio();
            }
        });

    }

    private void visualizzaMessaggio()
    {
        vMessaggio.setText(getString(R.string.Valore) + contatore);
    }

}
