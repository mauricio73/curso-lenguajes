/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collections;
import java.util.*;
public class GeneradorPreguntas {
 
    public static ArrayList<Pregunta>obtenerTodasLasPreguntas(){
        //Vamos a crear una sola pregunta con tres opciones
        Opcion o1=new Opcion("Moscu",true);
        Opcion o2=new Opcion("Florencia", false);
        Opcion o3=new Opcion("Paris", false);
        Opcion o4=new Opcion("Londres", false);
        
        Opcion a1=new Opcion("Tokio",false);
        Opcion a2=new Opcion("Beijing",true);
        Opcion a3=new Opcion("Seul",false);
        Opcion a4=new Opcion("Pyonjiang",false);
        ArrayList<Opcion> opciones=new ArrayList<Opcion>();
        opciones.add(o1);
        opciones.add(o2);
        opciones.add(o3);
        opciones.add(o4);
        
        ArrayList<Opcion> opcionesa=new ArrayList<Opcion>();
        opciones.add(a1);
        opciones.add(a2);
        opciones.add(a3);
        opciones.add(a4);
        
        Pregunta p1=new Pregunta("Capital de rusia",opciones);
        Pregunta p2=new Pregunta("Capital de china",opcionesa);
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        preguntas.add(p1);
        preguntas.add(p2);
        
        return preguntas;
    }
}
