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
        Button btnSignOut = findViewById(R.id.btn_logout);
        Button btnNuevo = findViewById(R.id.btn_submit);

        btnSignOut.setOnClickListener(view -> {
            FirebaseAuth.getInstance().signOut();
            goToMainActivity();
        });

        btnNuevo.setOnClickListener(view ->{
            startActivity(new Intent(HomeActivity.this, RegisterDerrumbe.class));
        });
        }

    private void goToMainActivity() {
        startActivity(new Intent(HomeActivity.this, LoginActivity.class));
        finish();
    }
}