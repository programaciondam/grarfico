/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author dam
 */
public class Categoria {
   private int codigoCategoria;
   private String denominacionCategoria;
   ArrayList<Curso> cursos;

    public Categoria(int codigo, String denominacion) {
        this.codigoCategoria = codigo;
        this.denominacionCategoria = denominacion;
        cursos=new ArrayList<>();
    }

    public int getCodigo() {
        return codigoCategoria;
    }

    public String getDenominacion() {
        return denominacionCategoria;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        return denominacionCategoria;
    }

   public void anadirCurso(String codigoCurso, String denominacionCurso){
       cursos.add(new Curso(codigoCurso,denominacionCurso));
   }
   
}
