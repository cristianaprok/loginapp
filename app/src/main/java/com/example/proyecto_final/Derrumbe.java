package com.example.proyecto_final;

public class Derrumbe {

    private String canton;
    private String distrito;
    private String direccionMaps;
    private String nombreDerrumbeHueco;
    private String fechaReporte;
    private String severidad;
    private String estado;
    private String id;

    public Derrumbe(String canton, String distrito, String direccionMaps, String nombreDerrumbeHueco, String fechaReporte, String severidad, String estado, String id) {
        this.canton = canton;
        this.distrito = distrito;
        this.direccionMaps = direccionMaps;
        this.nombreDerrumbeHueco = nombreDerrumbeHueco;
        this.fechaReporte = fechaReporte;
        this.severidad = severidad;
        this.estado = estado;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDireccionMaps() {
        return direccionMaps;
    }

    public void setDireccionMaps(String direccionMaps) {
        this.direccionMaps = direccionMaps;
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
