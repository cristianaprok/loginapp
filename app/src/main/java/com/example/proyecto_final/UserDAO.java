package com.example.proyecto_final;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UserDAO {
    private DatabaseReference databaseReference;

    public UserDAO() {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(User.class.getSimpleName());
    }

    public Task<Void> add (Derrumbe der){

        return databaseReference.push().setValue(der);
    }

    public Task<DataSnapshot> get(String key)
    {
            return databaseReference.child(key).get();
    }
}
