package com.example.actividadgithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Github_act extends AppCompatActivity {
    private Spinner spin;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spin = (Spinner)findViewById(R.id.spin);
        text1 = (TextView)findViewById(R.id.tv);

        ArrayList<String> listaJugadores = (ArrayList<String>) getIntent().getSerializableExtra("listajugadoress");

        ArrayAdapter<String> adapt = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listaJugadores);
        spin.setAdapter(adapt);


    }
    public void Mostrar(View v){

        String opcion = spin.getSelectedItem().toString();

        if (opcion.equals("Cristiano Ronaldo")){
            text1.setText("El valor de Cristiano ronaldo es de : $7.9 millones de dolares");
        }
        if (opcion.equals("Ronaldo")){
            text1.setText("El valor de Ronaldo es: $29.5 millones de dolares");
        }
        if(opcion.equals("Roberto Carlos")){
            text1.setText("El valor de Roberto Carlos es: $15.7 millones de dolares");


        }

    }
}