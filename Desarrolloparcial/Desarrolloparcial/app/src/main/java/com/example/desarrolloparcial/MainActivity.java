package com.example.desarrolloparcial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText usuario, contras;

    Button botoningresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.usuario);
        contras = findViewById(R.id.contras);
        botoningresar = findViewById(R.id.botoningresar);

        botoningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingreso();
            }
        });


    }

    private void ingreso(){
        String user = String.valueOf(usuario.getText());
        String contrase = String.valueOf(contras.getText());


        if(user.isEmpty() || contrase.isEmpty()){
            Toast.makeText(MainActivity.this,"Por favor llenar los campos",Toast.LENGTH_LONG).show();
        }else{
            if(usuario.equals("uac123") && contrase.equals("12345678")){
                Intent intent = new Intent(MainActivity.this,Pantalla2.class);
                startActivity(intent);
            }
        }



    }

}