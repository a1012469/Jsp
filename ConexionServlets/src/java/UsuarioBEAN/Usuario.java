/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsuarioBEAN;

/**
 *
 * @author Leiva
 */
public class Usuario {
    //la ley de encapsulamientos tiene que ser provados
    private String cod,nom;
    private int edad;
    private String sexo,pas;
    //constructor

    public Usuario(String cod, String nom, int edad, String sexo, String pas) {
        this.cod = cod;
        this.nom = nom;
        this.edad = edad;
        this.sexo = sexo;
        this.pas = pas;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPas() {
        return pas;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }
    
    
    
}
