/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collections;
import java.util.*;
import javax.swing.JRadioButton;
public class GeneradorPreguntas {
 
    public static ArrayList<Pregunta>obtenerTodasLasPreguntas(){
        //Vamos a crear una sola pregunta con tres opciones
        Opcion a1=new Opcion("Compasivo",false);
        Opcion a2=new Opcion("Reconfortante", true);
        Opcion a3=new Opcion("Explicativo", false);
        Opcion a4=new Opcion("Entrometido", false);
        
        Opcion b1=new Opcion("6",false);
        Opcion b2=new Opcion("17",false);
        Opcion b3=new Opcion("19",true);
        Opcion b4=new Opcion("21",false);
        
        Opcion c1=new Opcion(" Todos los coleccionistas de sellos son arquitectos.",false);
        Opcion c2=new Opcion("Los arquitectos no son personas aburridas.", true);
        Opcion c3=new Opcion("Ningún coleccionista de sellos es una persona aburrida", false);
        Opcion c4=new Opcion(" Algunas personas aburridas son arquitectos", false);
        
        Opcion d1=new Opcion("122 metros",false);
        Opcion d2=new Opcion("120 metros",true);
        Opcion d3=new Opcion("118 metros",false);
        Opcion d4=new Opcion("116 metros",false);
        
        Opcion e1=new Opcion("Estirado",false);
        Opcion e2=new Opcion("Fuerte", false);
        Opcion e3=new Opcion("Masculino", false);
        Opcion e4=new Opcion("Debil", true);
        
        Opcion f1=new Opcion("Alambre",false);
        Opcion f2=new Opcion("Electricidad",true);
        Opcion f3=new Opcion("Calor",false);
        Opcion f4=new Opcion("Gas",false);
        
        Opcion g1=new Opcion("Queja",true);
        Opcion g2=new Opcion("Injusticia", false);
        Opcion g3=new Opcion("Pecado", false);
        Opcion g4=new Opcion("Discordia", false);
        
        Opcion h1=new Opcion("100 km/hr",false);
        Opcion h2=new Opcion("640 km/hr",false);
        Opcion h3=new Opcion("80 km/hr",true);
        Opcion h4=new Opcion("No se puede saber",false);
        
        Opcion i1=new Opcion("Faltista",false);
        Opcion i2=new Opcion("Fantasear", false);
        Opcion i3=new Opcion("Familia", true);
        Opcion i4=new Opcion("Fastidio", false);
        
        Opcion j1=new Opcion("Tres",false);
        Opcion j2=new Opcion("Cuatro",true);
        Opcion j3=new Opcion("Seis",false);
        Opcion j4=new Opcion("Nueve",false);
        
        ArrayList<Opcion> opcionesa=new ArrayList<Opcion>();
        opcionesa.add(a1);
        opcionesa.add(a2);
        opcionesa.add(a3);
        opcionesa.add(a4);
        
        ArrayList<Opcion> opcionesb=new ArrayList<Opcion>();
        opcionesb.add(b1);
        opcionesb.add(b2);
        opcionesb.add(b3);
        opcionesb.add(b4);
        
        ArrayList<Opcion> opcionesc=new ArrayList<Opcion>();
        opcionesc.add(c1);
        opcionesc.add(c2);
        opcionesc.add(c3);
        opcionesc.add(c4);
        
        ArrayList<Opcion> opcionesd=new ArrayList<Opcion>();
        opcionesd.add(d1);
        opcionesd.add(d2);
        opcionesd.add(d3);
        opcionesd.add(d4);
        
        ArrayList<Opcion> opcionese=new ArrayList<Opcion>();
        opcionese.add(e1);
        opcionese.add(e2);
        opcionese.add(e3);
        opcionese.add(e4);
        
        ArrayList<Opcion> opcionesf=new ArrayList<Opcion>();
        opcionesf.add(f1);
        opcionesf.add(f2);
        opcionesf.add(f3);
        opcionesf.add(f4);
        
        ArrayList<Opcion> opcionesg=new ArrayList<Opcion>();
        opcionesg.add(g1);
        opcionesg.add(g2);
        opcionesg.add(g3);
        opcionesg.add(g4);
        
        ArrayList<Opcion> opcionesh=new ArrayList<Opcion>();
        opcionesh.add(h1);
        opcionesh.add(h2);
        opcionesh.add(h3);
        opcionesh.add(h4);
        
        ArrayList<Opcion> opcionesi=new ArrayList<Opcion>();
        opcionesi.add(g1);
        opcionesi.add(g2);
        opcionesi.add(g3);
        opcionesi.add(g4);
        
        ArrayList<Opcion> opcionesj=new ArrayList<Opcion>();
        opcionesj.add(h1);
        opcionesj.add(h2);
        opcionesj.add(h3);
        opcionesj.add(h4);
        
        Pregunta p1=new Pregunta("1.¿Cuál de las palabras mostradas a continuación es la más cercana en significado a la palabra tranquilizador?",opcionesa);
        Pregunta p2=new Pregunta("2.¿Qué número sigue por lógica a esta serie? 4,6,9,6,14,6...",opcionesb);
        Pregunta p3=new Pregunta("3.¿Cuál de las conclusiones a continuación se puede extraer con absoluta certeza en función de las siguientes dos proposiciones? "
                + "Ningún coleccionista de sellos es arquitecto"
                + " Todas las personas aburridas son coleccionistas de sellos",opcionesc);
        Pregunta p4=new Pregunta("4.Tomás tiene un juego nuevo de palos de golf. Con el palo 8,"
                + " la pelota recorre una distancia media de 100 metros. Con el palo 7, "
                + "la pelota recorre una distancia media de 108 metros. Con el palo 6, "
                + "la pelota recorre una distancia media de 114 metros. "
                + "¿Qué distancia recorrerá la pelota si Tomás usa el palo 5?",opcionesd);
        Pregunta p5=new Pregunta("5.¿Cuál de las palabras de más abajo expresa el significado opuesto a la palabra DURO?",opcionese);
        Pregunta p6=new Pregunta("6.Agua es a tubería lo que ... es a cable.",opcionesf);
        Pregunta p7=new Pregunta("7.¿Qué palabra significa expresión de disconformidad?",opcionesg);
        Pregunta p8=new Pregunta("8.Un camion ha tardado 8 hrs. en recorrer 640 km ¿A que velocidad a ido?",opcionesh);
        Pregunta p9=new Pregunta("9.Falseamiento es al n°123452675890 como el n°1267372 es a la palabra",opcionesi);
        Pregunta p10=new Pregunta("10.Cada uno de tres hermanos tiene una hermana ¿Cuantos son entre todos?",opcionesj);
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);
        preguntas.add(p6);
        preguntas.add(p7);
        preguntas.add(p8);
        preguntas.add(p9);
        preguntas.add(p10);
        
        return preguntas;
    }

/**
 * 
 * @param p Proporciona el numero de la pregunta, inicia en cero
 * @param radios proporciona el arreglos de las opciones
 * @return  regresa la respuesta true es correcta false es incorrecta
 */
public static boolean checarRespuesta(Pregunta p, JRadioButton[] radios){
    boolean respuesta=false;
     String seleccion="";
     for(JRadioButton radio:radios){
         if(radio.isSelected()){
           seleccion=  radio.getText();
         }
     }
     
    for(Opcion o:p.getOpciones()){
       if(o.isEstatus()){
           if(o.getTitulo().equals(seleccion))respuesta=true;
       }
    }
    return respuesta;
    
}
}
    

