package com.example.proyecto_final;

import java.util.Date;

public class DerrumbeDAO {

    //Atributos de la clase Derrumbe.
    private String canton;
    private String distrito;
    private String direccion;
    private String nombreDerrumbeHueco;
    private Date fechaReporte;
    private String severidad;
    private String estado;

    public DerrumbeDAO(String nombre, String d, String direccion, String canton, Date fecha, String serveridad, String estado){
       this.canton = canton;
       this.nombreDerrumbeHueco = nombre;
       this.direccion = direccion;
       this.distrito = d;
       this.fechaReporte = fecha;
       this.severidad = serveridad;
       this.estado = estado;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreDerrumbeHueco() {
        return nombreDerrumbeHueco;
    }

    public void setNombreDerrumbeHueco(String nombreDerrumbeHueco) {
        this.nombreDerrumbeHueco = nombreDerrumbeHueco;
    }

    public Date getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(Date fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public String getSeveridad() {
        return severidad;
    }

    public void setSeveridad(String severidad) {
        this.severidad = severidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
