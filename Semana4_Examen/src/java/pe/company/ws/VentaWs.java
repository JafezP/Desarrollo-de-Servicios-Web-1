/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package pe.company.ws;

import java.util.Collection;
import javax.jws.WebService;
import javax.jws.WebMethod;
import pe.company.dao.VentaDao;
import pe.company.vo.VentaPlanoVo;

/**
 *
 * @author claud
 */
@WebService(serviceName = "VentaWs")
public class VentaWs {

    private static final VentaDao ventaDao = new VentaDao();

    @WebMethod(operationName = "listarTodasVentas")
    public Collection<VentaPlanoVo> findAllVentas() {
        return ventaDao.findAll();
    }
}
    