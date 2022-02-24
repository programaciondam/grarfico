/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author dam
 */
public class Usuario {
    private String login;
    private String contrasena;

    public Usuario(String login, String contrasena) {
        this.login = login;
        this.contrasena = contrasena;
    }

    public String getLogin() {
        return login;
    }

    public String getContrasena() {
        return contrasena;
    }
           
    
}
