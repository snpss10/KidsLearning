package com.desarrollo.kidslearning;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnnuevo,btnlogin;
    TextView txtolvida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnnuevo= findViewById(R.id.btn_nuevo);
        btnnuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Registrarse.class);
                startActivityForResult(intent, 0);
            }
        });

        txtolvida=findViewById(R.id.txt_olvida);
        txtolvida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), CambioClave.class);
                startActivityForResult(intent, 0);
            }
        });

        btnlogin=findViewById((R.id.btn_login));
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),Principal.class);
                startActivityForResult(intent,0);

            }
        });


    }




}