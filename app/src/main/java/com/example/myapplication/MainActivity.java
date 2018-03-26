package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //View del layout

    private TextView vMessaggio;
    private Button vAumenta;
    private Button vDiminuisci;
    private Button vAzzeramento;
    private CheckBox vCasella;
    private int contatore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Importa riferimenti Layout

        vMessaggio = findViewById(R.id.Conteggio);
        vAumenta = findViewById(R.id.Aggiungi);
        vDiminuisci = findViewById(R.id.Diminuisci);
        vAzzeramento = findViewById(R.id.Azzeramento);
        vCasella = findViewById(R.id.Casella);

        //Impostazioni pulsanti

        vAumenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++contatore;
                if(vCasella.isChecked())
                {++contatore;}

                    visualizzaMessaggio();
            }

        });

        vDiminuisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --contatore;
                if(vCasella.isChecked())
                {--contatore;}

                    visualizzaMessaggio();
            }
        });

        vAzzeramento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                contatore = 0;
                visualizzaMessaggio();
            }
        });

    }

    private void visualizzaMessaggio()
    {
        vMessaggio.setText(getString(R.string.Valore) + contatore);
    }

}
