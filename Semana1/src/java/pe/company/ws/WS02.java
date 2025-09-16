/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package pe.company.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WS02")
public class WS02 {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "getCursoInfo")
    public String getCursoInfo(@WebParam(name = "name") String cod) {
        
        if (cod.equals("001")) {
            String nombre = "Programación Web";
            String profesor = "Ing. Juan Pérez";
            String ciclo = "Ciclo V";
            
            return "Nombre: " + nombre + "\nProfesor: " + profesor + "\nCiclo: " + ciclo;
        } else {
            return "Código no encontrado";
        }
    }
}
    