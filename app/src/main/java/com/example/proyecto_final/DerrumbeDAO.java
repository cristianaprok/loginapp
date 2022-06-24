package com.example.proyecto_final;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.HashMap;

public class DerrumbeDAO {
    private DatabaseReference databaseReference;

    public DerrumbeDAO() {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Derrumbe.class.getSimpleName());
    }

    public Query get(){
        return databaseReference;
    }

    public Task<Void> add (Derrumbe der){
        return databaseReference.push().setValue(der);
    }

    public Task<Void> update(String key, HashMap<String,Object> hashMap){
        return databaseReference.child(key).updateChildren(hashMap);
    }

    public Task<Void> delete(String key){
        return databaseReference.child(key).removeValue();
    }
}
