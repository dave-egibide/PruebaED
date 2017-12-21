/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 * @author josti
 */
public class PruebaED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Departamento rrhh =new Departamento();
//        rrhh.setCodigo(197);
//        System.out.println(rrhh.getCodigo());
        Empresa initec = new Empresa();
        initec.setCodigo(12);
        initec.setDireccion("Avda los Huetos 16");
        initec.setNombre("Initec");
        initec.setTelefono("654223433");
        System.out.println("Empresa: " + initec.getNombre());

        Departamento[] departamentos = new Departamento[3];

        departamentos[0] = new Departamento(43, "rrhh", initec);
        departamentos[1] = new Departamento(66, "produccion", initec);
        departamentos[2] = new Departamento(14, "gerencia", initec);

        initec.setDepartamento(departamentos);
        System.out.println("Telefono empresa" + initec.getNombre() + " : " + initec.getTelefono());

        Departamento[] dp = initec.getDepartamento();

        for (int i = 0; i < dp.length; i++) {
            System.out.println("Departamento " + i + " de la empresa: " + dp[i].getNombre());
        }

    }

}
