package pe.model.ws;

import java.util.Collection;
import javax.jws.WebService;
import javax.jws.WebMethod;
import pe.company.dao.VentasDao;
import pe.company.vo.VentasVo;

@WebService(serviceName = "VentasWs")
public class VentasWs {
    
    private final VentasDao ventasDao = new VentasDao();

    @WebMethod(operationName = "listarVentas")
    public Collection<VentasVo> findAllVentas() {
        return ventasDao.findAll();
    }
}
