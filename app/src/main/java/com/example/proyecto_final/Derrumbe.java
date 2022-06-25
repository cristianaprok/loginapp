package com.example.proyecto_final;

public class Derrumbe {

    private String latitud;
    private String longitud;
    //private String direccionMaps;
    private String nombreDerrumbeHueco;
    private String fechaReporte;
    private String severidad;
    private String estado;
    private String id;

    public Derrumbe(String latitud, String longitud, String nombreDerrumbeHueco, String fechaReporte, String severidad, String estado) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.nombreDerrumbeHueco = nombreDerrumbeHueco;
        this.fechaReporte = fechaReporte;
        this.severidad = severidad;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String  latitud) {
        this.latitud = latitud;
    }

    public String  getLongitud() {
        return longitud;
    }

    public void setLongitud(String  longitud) {
        this.longitud = longitud;
    }

    public String getNombreDerrumbeHueco() {
        return nombreDerrumbeHueco;
    }

    public void setNombreDerrumbeHueco(String nombreDerrumbeHueco) {
        this.nombreDerrumbeHueco = nombreDerrumbeHueco;
    }

    public String getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(String fechaReporte) {
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
