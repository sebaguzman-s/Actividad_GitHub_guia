package com.example.actividadgithub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import java.util.ArrayList;

import javax.microedition.khronos.egl.EGLDisplay;

public class MainActivity extends AppCompatActivity {
    private EditText edit1, edit2;
    private ProgressBar progres;
    private Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText)findViewById(R.id.edit1);
        edit2 = (EditText)findViewById(R.id.edit2);

        progres = (ProgressBar)findViewById(R.id.pb);
        progres.setVisibility(View.INVISIBLE);

        boton = (Button)findViewById(R.id.btn1);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task().execute();
            }
        });

    }

    class Task extends AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {
            progres.setVisibility(View.VISIBLE);
        }

        @Override
        protected String doInBackground(String... strings) {
            for (int i = 1; i <= 10; i++){
                try {
                    Thread.sleep(1000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {

            progres.setVisibility(View.INVISIBLE);
            Intent i = new Intent(getBaseContext(),Home_act.class);
            startActivity(i);
        }
    }

    public void Github(View v){
        ArrayList<String> jugadores =  new ArrayList<String>();

        jugadores.add("Cristiano Ronaldo");
        jugadores.add("Ronaldo");
        jugadores.add("Roberto Carlos");
        jugadores.add("Zamorano");
        jugadores.add("Rivaldo");




        Intent i = new Intent(this, Github_act.class);
        i.putExtra("listajugadores", jugadores);
        startActivity(i);
    }
}