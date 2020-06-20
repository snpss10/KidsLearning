package com.desarrollo.kidslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    //Metodo para mostrar los botones de accion
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.inicio_alumno, menu);
        return true;
    }
    //Metodo de las acciones de los botones del menu
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        if(id== R.id.action_homework){
            Toast.makeText(this, "tareas", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id== R.id.action_settings){

            Toast.makeText(this, "opciones", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id== R.id.action_logout){
            Toast.makeText(this, "salir", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}