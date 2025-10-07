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
import pe.company.dbase.ConexionDb;
import pe.company.vo.VentaPlanoVo;

public class VentaDao {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public VentaDao() {
    }

    public Collection<VentaPlanoVo> findAll() {
        Collection<VentaPlanoVo> list = new ArrayList<>();

        try {
            conn = ConexionDb.getConnection();

            String sql =
                "SELECT " +
                "v.IdVenta, " +
                "a.Nombre AS nombreAsesor, " +
                "a.Dni AS dniAsesor, " +
                "b.CodigoBici, " +
                "b.NombreBici, " +
                "b.Stock " +
                "FROM tb_venta v " +
                "INNER JOIN tb_asesor a ON v.IdAsesor = a.IdAsesor " +
                "INNER JOIN tb_bicicleta b ON v.IdBici = b.IdBici";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                VentaPlanoVo venta = new VentaPlanoVo();
                venta.setId_venta(rs.getInt("IdVenta"));
                venta.setCodigo_bici(rs.getString("CodigoBici"));
                venta.setNombre_bici(rs.getString("NombreBici"));
                venta.setStock(rs.getInt("Stock"));
                venta.setDni(rs.getInt("dniAsesor"));
                venta.setNombre(rs.getString("nombreAsesor"));

                list.add(venta);
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

