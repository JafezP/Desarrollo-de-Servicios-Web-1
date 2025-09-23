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

   /* private static java.util.List<pe.company.ws.Empleado> coleccion(java.lang.String cod) {
        pe.company.ws.WS02_Service service = new pe.company.ws.WS02_Service();
        pe.company.ws.WS02 port = service.getWS02Port();
        return port.coleccion(cod);
    }*/

    private static pe.company.ws2.Empleado buscarID(java.lang.String cod) {
        pe.company.ws2.WS02_Service service = new pe.company.ws2.WS02_Service();
        pe.company.ws2.WS02 port = service.getWS02Port();
        return port.buscarID(cod);
    }

}
