
package pe.model.ws;

import java.util.Collection;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.company.dao.BicicletaDao;
import pe.company.vo.BicicletaVo;


@WebService(serviceName = "BicicletaWs")
public class BicicletaWs {

    private final BicicletaDao bicicletaDao = new BicicletaDao(); 
    
    @WebMethod(operationName = "getBicicletasByStock")
    public Collection<BicicletaVo> getBicicletasByStock(@WebParam(name = "stock") int stock) {
        return bicicletaDao.findByStock(stock);
    }
}
