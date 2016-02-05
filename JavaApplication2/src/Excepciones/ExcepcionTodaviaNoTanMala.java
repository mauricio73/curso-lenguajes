/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author T-101
 */
public class ExcepcionTodaviaNoTanMala {
    public static void main(String[] args) {
        
        //declaramos un arreglo de enteros
        int x[]={1,34,6,8};
        float[]y=new float[4];
        float z;
        //todos los arreglos son tratados como objetos por el compilador
       A objeto=new A();
        System.out.println(objeto.m); 
       System.out.println(y[2]);
        //System.out.println(z);
        //El arreglo x lo interaremos
       for(int i=0;i<x.length;i++){
           System.out.println(x[i]);
       }
       //El ciclo for para x pero mejorado
       for(int w:x){
           System.out.println(w);
    }
    }
}
class A{
float m;
}