/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author josti
 */
import java.util.*;

public class Empresa {

    //	private Collection<Departamento> departamento;
    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private Departamento[] departamentos;

    public Departamento[] getDepartamento() {
        return this.departamentos;
    }

    public void setDepartamento(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    public int getCodigo() {
        return this.codigo;
    }

    /**
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empresa()
    {
//            this.codigo=codigo;
//            this.nombre= nombre;
//            this.direccion= direccion;
//            this.telefono= telefono;
//            this.departamentos= departamentos;
    }

    public String getDireccion() {
        return this.direccion;
    }

    /**
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}