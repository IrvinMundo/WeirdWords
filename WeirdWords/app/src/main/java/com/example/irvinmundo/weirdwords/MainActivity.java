package com.example.irvinmundo.weirdwords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String onDetectLanguage(){
        String yourYesResponse = "Hello";

        if (Locale.getDefault().getLanguage().equals("en")) {
            yourYesResponse = "Name of the app";
        } else if (Locale.getDefault().getLanguage().equals("es")) {
            yourYesResponse = "Nombre de la app";
        }

        return yourYesResponse;
    }

}
