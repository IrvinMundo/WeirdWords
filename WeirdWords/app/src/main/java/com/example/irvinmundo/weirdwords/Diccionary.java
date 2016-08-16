package com.example.irvinmundo.weirdwords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class Diccionary extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diccionario);

        textView = (TextView)findViewById(R.id.textView4);
        String textDic = "Hello";

        if (Locale.getDefault().getLanguage().equals("en")) {
            textDic = "Diccionary";
        } else if (Locale.getDefault().getLanguage().equals("es")) {
            textDic = "Diccionario";
        }
        textView.setText(textDic);
    }
}
