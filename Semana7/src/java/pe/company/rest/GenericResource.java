
package pe.company.rest;

import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import pe.company.dao.MascotaDao;
import pe.company.vo.MascotaVo;

@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    public GenericResource() {
    }

    
    @Path("byLetter")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<MascotaVo> getMascotaByLetter(@QueryParam("letter") String letter) {
        
        MascotaDao dao = new MascotaDao();
        
        return dao.findByLetter(letter);
    }
}
