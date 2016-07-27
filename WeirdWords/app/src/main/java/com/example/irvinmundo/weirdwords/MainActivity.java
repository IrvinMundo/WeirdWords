package com.example.irvinmundo.weirdwords;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set the title of the Main Menu

        textView = (TextView) findViewById(R.id.textView3);
        String yourYesResponse = "Hello";

        if (Locale.getDefault().getLanguage().equals("en")) {
            yourYesResponse = "Name of the app";
        } else if (Locale.getDefault().getLanguage().equals("es")) {
            yourYesResponse = "Nombre de la app";
        }
        textView.setText(yourYesResponse);

        //hacer que los botones funcionen y redirijan
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, palabraDelDia.class);
                startActivity(intent);
            }
        });

    }
}
