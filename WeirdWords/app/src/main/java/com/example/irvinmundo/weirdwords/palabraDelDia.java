package com.example.irvinmundo.weirdwords;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by ovman on 26/07/2016.
 */
public class palabraDelDia extends AppCompatActivity{

    //aquí trabajaremos con las fusion tables
    String palabraDia;

    //button to send word of the day to Diccionary
    private ImageButton imageButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.palabra_del_dia_layout);

        imageButton = (ImageButton)findViewById(R.id.imageButton);
        
    }
}