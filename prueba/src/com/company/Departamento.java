//VAMONOS MAÑANA, POR FAVOR 
//XDXDDXDDXDD
// COMO SE DICE, DAME UN BESO EN MORO. MOHAME LA CARA(ES MALISIMO)
package com.company;

/**
 *
 * @author josti
 */
public class Departamento {

    private int codigo;
    private String nombre;
    private Empresa empresa;

    public int getCodigo() {
        return this.codigo;
    }
    //prueba 1

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
        //gasuagda
    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento(int codigo, String nombre, Empresa empresa) {
//		throw new UnsupportedOperationException();
        this.codigo=codigo;
        this.nombre=nombre;
        this.empresa= empresa;
        sout.out.println("fin");
    }
}
//VIVAN LOS PORGS
//#YoTeVoté
