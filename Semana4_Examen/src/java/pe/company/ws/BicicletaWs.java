/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package pe.company.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.company.dao.BicicletaDao;
import pe.company.vo.BicicletaPlanoVo;

@WebService(serviceName = "BicicletaWs")
public class BicicletaWs {

    private static final BicicletaDao bicicletaDao = new BicicletaDao();

    @WebMethod(operationName = "buscarPorStock")
    public List<BicicletaPlanoVo> buscarPorStock(@WebParam(name = "stockIngresado") int stockIngresado) {
        BicicletaDao dao = new BicicletaDao();
        return bicicletaDao.buscarPorStock(stockIngresado);
    }
}
