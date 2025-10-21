package pe.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import pe.company.dbase.ConexionDb;
import pe.company.vo.VentasVo;

public class VentasDao {
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public VentasDao() {
    }
    
    public Collection<VentasVo> findAll() {
        
        Collection<VentasVo> ventas = new ArrayList<>();

        try {
            conn = ConexionDb.getConnection();

            // La consulta siempre de esta manera
            
            String sql =
                "SELECT " +
                "v.IdVenta, " +
                "a.Nombre, " +
                "a.Dni, " +
                "b.CodigoBici, " +
                "b.NombreBici, " +
                "b.Stock " +
                "FROM tb_venta v " +
                "INNER JOIN tb_asesor a ON v.IdAsesor = a.IdAsesor " +
                "INNER JOIN tb_bicicleta b ON v.IdBici = b.IdBici";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                VentasVo ventaVo = new VentasVo();
                ventaVo.setId_venta(rs.getString("idVenta")); // Los nombres deben ser los de la base de datos (si usas AS se usa el nuevo nombre )
                ventaVo.setNombre(rs.getString("nombre"));
                ventaVo.setDni(rs.getString("dni"));
                ventaVo.setCodigo_bici(rs.getString("codigoBici"));
                ventaVo.setNombre_bici(rs.getString("nombreBici"));
                ventaVo.setStock(rs.getInt("stock"));
                ventas.add(ventaVo);
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

        return ventas;
    }
}
