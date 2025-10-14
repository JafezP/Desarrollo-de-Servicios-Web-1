/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2client;

import java.util.Collection;
import pe.company.ws2.Empleado;

/**
 *
 * @author IDAT
 */
public class Semana2Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado item =  buscarID("1021");
        
        System.out.println("ID Empleado:" + item.getIdEmpleado());
        System.out.println("Nombre:" + item.getNombre());
        System.out.println("Fecha de contrato:" + item.getFechaContrato());
        System.out.println("Profesion:" + item.getProfesion());
        System.out.println("Sueldo:" + item.getSueldo());  
    }

    

}
