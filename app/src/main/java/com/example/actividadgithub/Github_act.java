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

        ArrayList<String> listaJugadores = (ArrayList<String>) getIntent().getSerializableExtra("listajugadores");

        ArrayAdapter<String> adapt = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listaJugadores);
        spin.setAdapter(adapt);

    }
    public void Mostrar(View v){

        String opcion = spin.getSelectedItem().toString();

        if (opcion.equals("Cristiano Ronaldo")){
            text1.setText("El valor de Cristiano ronaldo es de : $156.4 millones de dolares");
        }
        if (opcion.equals("Ronaldo")){
            text1.setText("El valor de Ronaldo es: $98.1 millones de dolares");
        }
        if(opcion.equals("Roberto Carlos")){
            text1.setText("El valor de Roberto Carlos es: $15.4 millones de dolares");
        }
        if(opcion.equals("Zamorano")){
            text1.setText("El valor de Zamorano es: $5.6 millones de dolares");
        }
        if(opcion.equals("Rivaldo")){
            text1.setText("El valor de Rivaldo es: $33.7 millones de dolares");
        }




    }
}