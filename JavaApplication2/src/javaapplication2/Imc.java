/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
/*
Clase modelo Imc encapsulada
y con dos constructores
1. Agregar a los atributos modificador de acceso private
2. Por cada atributo implementar un metodo get (getters)
3. Por cada atributo implementar un metofo set(setters)
*/

public class Imc {
    private float peso;
    private float altura;
    
   
    String calcular(){
        float imc=peso/(altura*altura);
        return "Tu imc es:"+imc;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
