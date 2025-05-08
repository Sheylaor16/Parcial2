package com.example.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment.adaptadores.NoticiaAdaptador;
import com.example.fragment.noticias.Noticia;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText edt_usuario, edt_contrasena;
    Button btn_guardar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edt_usuario = findViewById(R.id.edt_usuario);
        edt_contrasena = findViewById(R.id.edt_contrasena);

        btn_guardar = findViewById(R.id.btn_guardar);

        btn_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarDatos();
            }

            private void guardarDatos() {
                String usuario = edt_usuario.getText().toString();
                String contrasena = edt_contrasena.getText().toString();

                if (usuario.equalsIgnoreCase("") || contrasena.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor llenar todos los campos", Toast.LENGTH_LONG).show();
                    return;
                }

                SharedPreferences sharedPreferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("usuario", usuario);
                editor.putInt("contrasena", Integer.parseInt(contrasena));
                editor.apply();

                redirigirInicio(usuario);
            }

            private void redirigirInicio(String usuario) {
                Intent intent = null;
                intent = new Intent(MainActivity.this, InicioActivity.class);
                startActivity(intent);
            }
        });
    }
}