package com.example.proyecto_final;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DerrumbeDAO {
    private DatabaseReference databaseReference;

    public DerrumbeDAO() {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference()
    }
}
