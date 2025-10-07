/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import pe.company.dbase.ConexionDb;
import pe.company.vo.CategoryVo;
import pe.company.vo.ProductVo;

/**
 *
 * @author claud
 */
public class ProductDao {
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    private final CategoryDao categoryDao = new CategoryDao();
    
    public ProductDao() {
    }
    
     public Collection<ProductVo> findAll() {
         List<ProductVo> list = new ArrayList<>();

        try {
            conn = ConexionDb.getConnection();
            ps = conn.prepareStatement("select * from productos");
            rs = ps.executeQuery();

            while (rs.next()) {
                ProductVo productVo = new ProductVo();
                productVo.setId_producto(rs.getInt("id_producto"));
                productVo.setNombre(rs.getString("nombre"));
                productVo.setMarca(rs.getString("marca"));
                productVo.setPrecio(rs.getDouble("precio"));
                productVo.setStock(rs.getInt("stock"));
                
                CategoryVo categoria = categoryDao.findById(rs.getInt("id_categoria"));
                productVo.setCategoryVo(categoria);
                list.add(productVo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return list;
    }
}
