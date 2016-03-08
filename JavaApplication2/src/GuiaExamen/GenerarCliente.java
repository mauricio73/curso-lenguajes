/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiaExamen;

/**
 *
 * @author T-101
 */
public class GenerarCliente {
    
    public static Cliente[]obftenerClientes(){
        Cliente[] clientes=new Cliente[3];
        clientes[0]=new Cliente();
        clientes[1]=new Cliente();
        clientes[2]=new Cliente();
        //Ajustamos los nombres
       // clientes[0].setNombre("Ana");
       //clientes[1].setNombre("Pedro");
       // clientes[2].setNombre("Laura");
        
        //Direccion_1 d1=new Direccion_1();
        //        d1.setCalle("sur 11");
        //       d1.setNumero("sur 11");
        //     d1.setMunicipio("sur 11"); 
        //clientes[0].setDireccion(d1);
        
        return clientes;
    }
}
