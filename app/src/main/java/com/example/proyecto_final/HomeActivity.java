package com.example.proyecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        EditText edit_canton = findViewById(R.id.edit_canton);
        EditText edit_distrito = findViewById(R.id.edit_distrito);
        EditText edit_nombre = findViewById(R.id.edit_name);
        EditText edit_fecha = findViewById(R.id.edit_fecha);
        EditText edit_severidad = findViewById(R.id.edit_severidad);
        EditText edit_estado = findViewById(R.id.edit_estado);
        Button btn = findViewById(R.id.btn_submit);
        Button btnSignOut = findViewById(R.id.btn_logout);
        DerrumbeDAO dao = new DerrumbeDAO();

        btn.setOnClickListener(v -> {
            Derrumbe derrumbe = new Derrumbe(
                    edit_canton.getText().toString(),
                    edit_distrito.getText().toString(),
                    edit_nombre.getText().toString(),
                    edit_fecha.getText().toString(),
                    edit_severidad.getText().toString(),
                    edit_estado.getText().toString()
                    );
            dao.add(derrumbe).addOnSuccessListener(suc ->{
                Toast.makeText(this,"Derrumbe guardado",Toast.LENGTH_SHORT);
            }).addOnFailureListener(er ->
            {
                Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
            });
            btnSignOut.setOnClickListener(view -> {
                FirebaseAuth.getInstance().signOut();
                goToMainActivity();
            });
        });
        }

    private void goToMainActivity() {
        startActivity(new Intent(HomeActivity.this, LoginActivity.class));
    }
}