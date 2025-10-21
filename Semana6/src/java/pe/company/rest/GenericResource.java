package pe.company.rest;

import java.util.Collection;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pe.company.dao.BicicletaDao;
import pe.company.dao.VentasDao;
import pe.company.vo.BicicletaVo;
import pe.company.vo.VentasVo;

@Path("version1")
public class GenericResource {

    @Context
    private UriInfo context;

    public GenericResource() {
    }

    @Path("mensaje")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        String response = "Adios mundo terremoto";
        return response;
    }
    
    @Path("mensaje/{username}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage(@PathParam("username") String username) {
        String response = "Holitas " + username + "!";
        return response;
    }
    
    // http://localhost:8080/Semana6/rest/version1/mensajeTwo?username=Joel
    @Path("mensajeTwo")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getMessageTwo(@QueryParam("username") String username) {
        String response = "<h1>Bienvenido " + username + "!</h1>";
        return response;
    }
    
    
    // http://localhost:8080/Semana6/rest/version1/mensajeThree/Joel
    @Path("mensajeThree/{username}")
    @GET
    @Produces(MediaType.TEXT_XML)
    public String getMessageThree(@PathParam("username") String username) {
        String response = "<msg>Bienvenido " + username + "!</msg>";
        return response;
    }
    
    @Path("byStock")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<BicicletaVo> getBicicletasByStock(@QueryParam("stock") int stock) {
        
        BicicletaDao dao = new BicicletaDao();
        
        return dao.findByStock(stock);
    }
    
    @Path("venta")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<VentasVo> getVenta() {
        
        VentasDao dao = new VentasDao();
        
        return dao.findAll();
    }
    
}
