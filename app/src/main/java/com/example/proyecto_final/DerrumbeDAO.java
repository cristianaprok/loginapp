package com.example.proyecto_final;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DerrumbeDAO {
    private DatabaseReference databaseReference;

    public DerrumbeDAO() {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Derrumbe.class.getSimpleName());
    }

    public Task<Void> add (Derrumbe der){return databaseReference.push().setValue(der);}
}
