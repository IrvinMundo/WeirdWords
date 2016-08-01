package com.example.irvinmundo.weirdwords;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
<<<<<<< HEAD
//Hola
=======

    private TextView textView;

    private Button button;

    private Button button2;

>>>>>>> master
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView3);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        
        String yourYesResponse = "Hello";
        String nameButton = "Button";
        String nameButton2 = "Button2";

        //Set the title of the Main Menu
        //Set the names of the buttons
        if (Locale.getDefault().getLanguage().equals("en")) {
            yourYesResponse = "Name of the app";
            nameButton = "Word of the day!";
            nameButton2 = "Diccionary";
        } else if (Locale.getDefault().getLanguage().equals("es")) {
            yourYesResponse = "Nombre de la app";
            nameButton = "¡Palabra del día!";
            nameButton2 = "Diccionario";
        }
        textView.setText(yourYesResponse);
        button.setText(nameButton);
        button2.setText(nameButton2);

        //hacer que los botones funcionen y redirijan

        //FIRST BUTTON

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, palabraDelDia.class);
                startActivity(intent);
            }
        });

        //SECOND BUTTON

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, diccionario.class);
                startActivity(intent);
            }
        });

    }
}
