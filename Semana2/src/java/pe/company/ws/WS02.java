/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package pe.company.ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.company.model.Empleado;

/**
 *
 * @author IDAT
 */
@WebService(serviceName = "WS02")
public class WS02 {
    
    private static final Collection<Empleado> itemsEmpleado = new ArrayList<>();
            
    static {
    Empleado empleado1 = new Empleado("1021", "Joel", new GregorianCalendar(2014, 03, 10).getTime(),"Desarrollador", 4000.0);
    Empleado empleado2 = new Empleado("1022", "Joel", new GregorianCalendar(2014, 03, 10).getTime(),"Desarrollador", 4000.0);
    Empleado empleado3 = new Empleado("1023", "Joel", new GregorianCalendar(2014, 03, 10).getTime(),"Desarrollador", 4000.0);
    Empleado empleado4 = new Empleado("1024", "Joel", new GregorianCalendar(2014, 03, 10).getTime(),"Desarrollador", 4000.0);

    itemsEmpleado.add(empleado1);
    itemsEmpleado.add(empleado2);
    itemsEmpleado.add(empleado3);
    itemsEmpleado.add(empleado4);
    }

    @WebMethod(operationName = "coleccion")
    public Collection<Empleado> coleccion(@WebParam(name = "cod") String cod) {
        return itemsEmpleado;
    }
    
    @WebMethod(operationName = "buscarID")
    public Empleado buscarID(@WebParam(name = "cod") String cod) {
        for (Empleado e : itemsEmpleado) {
            if (e.getId_empleado().equals(cod)) {
                return e;
            }
        }
        return null;
    }
}