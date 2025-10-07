package pe.company.dao;

import java.sql.*;
import java.util.*;
import pe.company.dbase.ConexionDb;
import pe.company.vo.BicicletaPlanoVo;

public class BicicletaDao {
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public BicicletaDao() {
    }

    public List<BicicletaPlanoVo> buscarPorStock(int stockIngresado) {
        
        List<BicicletaPlanoVo> list = new ArrayList<>();

        try {
            conn = ConexionDb.getConnection();

            String sql = "SELECT idBici, codigoBici, nombreBici, stock FROM tb_bicicleta WHERE stock <= ?";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                BicicletaPlanoVo bicicletaPlanoVo = new BicicletaPlanoVo();
                rs.getInt("idBici");
                rs.getString("codigoBici");
                rs.getString("nombreBici");
                rs.getInt("stock");
                list.add(bicicletaPlanoVo);
            }

        } catch (Exception e) {
            System.out.println("Error al listar ventas: " + e.getMessage());
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
