package pe.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import pe.company.dbase.ConexionDb;
import pe.company.vo.BicicletaVo;

public class BicicletaDao {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public BicicletaDao() {
    }

    public Collection<BicicletaVo> findByStock(int stock) {
        
        Collection<BicicletaVo> bicicletas = new ArrayList<>();

        try {
            conn = ConexionDb.getConnection();

            String sql = "SELECT b.IdBici AS IdBicicleta, b.CodigoBici, b.NombreBici, b.Stock " +
                         "FROM tb_bicicleta b WHERE b.Stock <= ?";
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, stock);

            rs = ps.executeQuery();

            while (rs.next()) {
                BicicletaVo bicicletaVo = new BicicletaVo();
                bicicletaVo.setCodigo(rs.getString("CodigoBici"));
                bicicletaVo.setId_bicicleta(rs.getInt("IdBicicleta"));
                bicicletaVo.setBici_nombre(rs.getString("NombreBici"));
                bicicletaVo.setStock(rs.getInt("Stock"));
                bicicletas.add(bicicletaVo);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar bicicletas: " + e.getMessage());
        } finally {
            
        }
        
    return bicicletas;
    }
}
