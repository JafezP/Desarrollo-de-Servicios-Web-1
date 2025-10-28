package pe.model.ws;

import java.util.Collection;
import javax.jws.WebService;
import javax.jws.WebMethod;
import pe.company.dao.MascotaDao;
import pe.company.vo.MascotaVo;

@WebService(serviceName = "MascotaWs")
public class MascotaWs {

    private final MascotaDao dao = new MascotaDao();

    @WebMethod(operationName = "listarMascotas")
    public Collection<MascotaVo> findAllMascotas() {
        return dao.findAll();
    }
}
