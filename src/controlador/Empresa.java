/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Categoria;
import modelo.Usuario;

/**
 *
 * @author dam
 */
public class Empresa {
    Usuario[]usuarios;
    private Categoria[] categorias;

    public Empresa() {
        usuarios=new Usuario[2];
    }
    public void crearUsuarios(){
        usuarios[0]= new Usuario("admin","123");
        usuarios[1]= new Usuario("pepe","456");
    }
    public boolean buscarUsuario(String l, String c){
        boolean encontrado=false;
        int pos=0;
        while (!encontrado && pos<usuarios.length ){
            if ( l.equals(usuarios[pos].getLogin()) &&
                    c.equals(usuarios[pos].getContrasena()))
                encontrado=true;
            else 
                pos++;
        }
        return encontrado;
    }
    public void crearCategorias(){
        categorias= new Categoria[3];
        categorias[0]=new Categoria(1,"informatica");
        
        categorias[0].anadirCurso("pr1", "Programación");
        categorias[0].anadirCurso("di", "Diseño");
        
        
        categorias[1]=new Categoria(2,"idiomas");
        
        categorias[1].anadirCurso("in1", "Ingles");
        categorias[1].anadirCurso("al1", "ALeman");
        categorias[1].anadirCurso("fr11", "Frances");
                
       categorias[2]=new Categoria(3,"Vacia");
    }

    public Categoria[] getCategorias() {
        return categorias;
    }
    
}
