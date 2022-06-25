package com.example.proyecto_final;

public class User {

    private String nombreUsuario;
    private String email;
    private String password;
    private String role;

    public User(String email, String password, String role) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() { return role;}

    public void setRole(String role) {this.role = role;}
}
