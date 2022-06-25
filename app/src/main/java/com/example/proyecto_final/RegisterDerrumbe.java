package com.example.proyecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class RegisterDerrumbe extends AppCompatActivity {
    String severidad = "";
    EditText edit_canton ;
    EditText edit_distrito;
    EditText edit_nombre;
    EditText edit_fecha;
    EditText edit_estado;
    RadioButton rb1, rb2 , rb3 ;
    DerrumbeDAO dao;
    Time today;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_derrumbe);
        today = new Time(Time.getCurrentTimezone());
        today.setToNow();
        int dia= today.monthDay;
        int mes = today.month;
        mes=mes+1;
        int anio = today.year;
        String fecha = dia + "/" + mes + "/" +anio;

        edit_canton = findViewById(R.id.edit_canton);
        edit_distrito = findViewById(R.id.edit_distrito);
        edit_nombre = findViewById(R.id.edit_name);
        //edit_fecha = findViewById(R.id.edit_fecha);

        RadioButton rb1 = findViewById(R.id.radio_alta);
        RadioButton rb2 = findViewById(R.id.radio_media);
        RadioButton rb3 = findViewById(R.id.radio_baja);
        edit_estado = findViewById(R.id.edit_estado);
        Button btn = findViewById(R.id.btn_submit);
        Button btnSignOut = findViewById(R.id.btn_logout);
         dao = new DerrumbeDAO();

        btn.setOnClickListener(v -> {
            if(rb1.isChecked() == true){
                severidad=rb1.getText().toString();}
            else if(rb2.isChecked()==true){
                severidad=rb2.getText().toString();}
            else if(rb3.isChecked()==true){
                severidad=rb3.getText().toString();}

            Derrumbe derrumbe = new Derrumbe(
                    edit_canton.getText().toString(),
                    edit_distrito.getText().toString(),
                    edit_nombre.getText().toString(),
                    fecha,
                    severidad,
                    edit_estado.getText().toString()
            );
            dao.add(derrumbe).addOnSuccessListener(suc ->{
                Toast.makeText(this,"Derrumbe guardado",Toast.LENGTH_SHORT).show();
                goToMainActivity();
            }).addOnFailureListener(er ->
            {
                Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
            });

        });
    }
    private void goToMainActivity() {
        startActivity(new Intent(RegisterDerrumbe.this, HomeActivity.class));
    }

    public void Guardar(View view) {
        Derrumbe derrumbe = new Derrumbe(
                edit_canton.getText().toString(),
                edit_distrito.getText().toString(),
                edit_nombre.getText().toString(),
                edit_fecha.getText().toString(),
                severidad,
                edit_estado.getText().toString()
        );
        dao.add(derrumbe).addOnSuccessListener(suc ->{
            Toast.makeText(this,"Derrumbe guardado",Toast.LENGTH_SHORT).show();
            goToMainActivity();
        }).addOnFailureListener(er ->
        {
            Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
        });

    }
}