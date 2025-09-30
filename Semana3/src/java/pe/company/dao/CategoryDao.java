/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.company.dbase.ConexionDb;
import pe.company.vo.CategoryVo;

/**
 *
 * @author IDAT
 */
public class CategoryDao {
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public CategoryDao() {
    }
    
    public CategoryVo findById(int id_categoria) {
      CategoryVo categoryVo = null;
      
        try {
            conn = ConexionDb.getConnection();
            ps = conn.prepareStatement("select * from categorias where id_categoria = ?");
            
            ps.setInt(1, id_categoria);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                categoryVo = new CategoryVo();
                categoryVo.setId_categoria(rs.getInt("id_categoria"));
                categoryVo.setDescripcion(rs.getString("descripcion"));
            }
                    
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
      
      return categoryVo;
    };
    
    public List<CategoryVo> findAll() {
        List<CategoryVo> categories = new ArrayList<>();

        try {
            conn = ConexionDb.getConnection();
            ps = conn.prepareStatement("select * from categorias");

            rs = ps.executeQuery();

            while (rs.next()) {
                CategoryVo categoryVo = new CategoryVo();
                categoryVo.setId_categoria(rs.getInt("id_categoria"));
                categoryVo.setDescripcion(rs.getString("descripcion"));
                categories.add(categoryVo);
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

        return categories;
    }
}
