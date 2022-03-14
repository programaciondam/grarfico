/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author dam
 */
public class Curso {
    private String codigoCurso;
    private String denominacionCurso;

    public Curso(String codigo, String denominacion) {
        this.codigoCurso = codigo;
        this.denominacionCurso = denominacion;
    }

    public String getCodigo() {
        return codigoCurso;
    }

    public String getDenominacion() {
        return denominacionCurso;
    }
    
    
}
