/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapitulosExcepciones;

/**este metodo nos regresa el email que ya previamnete
 * se debio haber proporcionado por el metodo set correspondiente
 *
 * @author T-101
 */
public class Cliente {
    private String email;
    private int edad;
    /**
     * 
     * @param email
     * @param edad 
     */

    public Cliente(String email, int edad) {
        this.email = email;
        this.edad = edad;
    }

    public Cliente() {
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**este metodo necesita que proporciones un String
     * que va a ser el email que le va asignar al cliente
     * @param email Aqui debes de poner el string
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) throws ValorNoNegativoException,MenorDeEdadExcepcion {
        ValidarEdad.checarEdadNegativa(edad);
        ValidarEdad.checarMenorEdad(edad);
        this.edad = edad;
    }
}
