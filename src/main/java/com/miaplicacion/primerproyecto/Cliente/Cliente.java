package com.miaplicacion.primerproyecto.Cliente;

public class Cliente {
    private Long id;
    private String nombre;
    private String apellido;

    public Cliente(Long id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getId() {
        return id;
    }
}
