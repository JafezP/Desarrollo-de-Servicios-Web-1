/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package pe.company.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.company.dao.CategoryDao;
import pe.company.vo.CategoryVo;

/**
 *
 * @author IDAT
 */
@WebService(serviceName = "CategoriaWs")
public class CategoriaWs {
    private CategoryDao categoryDao = new CategoryDao();
    
    @WebMethod(operationName = "listarCategoriaById")
    public CategoryVo listarCategoriaById(@WebParam(name = "id") int id) {
        return categoryDao.findById(id);
    }
    
    @WebMethod(operationName = "listarTodasCategorias")
    public List<CategoryVo> listarTodasCategorias() {
        return categoryDao.findAll();
    }
}
