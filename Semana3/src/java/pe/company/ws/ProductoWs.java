/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package pe.company.ws;

import java.util.Collection;
import javax.jws.WebService;
import javax.jws.WebMethod;
import pe.company.dao.ProductDao;
import pe.company.vo.ProductVo;

/**
 *
 * @author claud
 */
@WebService(serviceName = "ProductoWs")
public class ProductoWs {

    private ProductDao productDao = new ProductDao();

    @WebMethod(operationName = "listarTodosProductos")
    public Collection<ProductVo> findAllProducts() {
        return productDao.findAll();
    }
}
