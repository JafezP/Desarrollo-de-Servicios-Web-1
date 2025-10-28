package pe.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import pe.company.dbase.ConexionDb;
import pe.company.vo.MascotaVo;

public class MascotaDao {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public MascotaDao() {
    }

    public Collection<MascotaVo> findAll() {
        
        Collection<MascotaVo> mascotas = new ArrayList<>();

        try {
            conn = ConexionDb.getConnection();

            String sql = "SELECT \n" +
                            "    m.idMascota,\n" +
                            "    m.nombreMascota AS nombreMascota,\n" +
                            "    CONCAT(d.nombre, ' ', d.apellido) AS nombreCompletoDueno,\n" +
                            "    tm.descripcionTipoMascota AS tipoMascota\n" +
                            "FROM \n" +
                            "    tb_mascota m\n" +
                            "INNER JOIN \n" +
                            "    tb_dueno d ON m.idDueno = d.idDueno\n" +
                            "INNER JOIN \n" +
                            "    tb_tipo_mascota tm ON m.idTipoMascota = tm.idTipoMascota;";
            
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                MascotaVo mascotaVo = new MascotaVo();
                mascotaVo.setId_mascota(rs.getInt("idMascota"));
                mascotaVo.setNombreMascota(rs.getString("nombreMascota"));
                mascotaVo.setNombre_apellido_dueno(rs.getString("nombreCompletoDueno"));
                mascotaVo.setDescripcionTipoMascota(rs.getString("tipoMascota"));
                mascotas.add(mascotaVo);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar las mascotas: " + e.getMessage());
        } finally {
            
        }
        
    return mascotas;
    }
    
    public Collection<MascotaVo> findByLetter(String letter) {

    Collection<MascotaVo> mascotas = new ArrayList<>();

    try {
        conn = ConexionDb.getConnection();

        String sql = "SELECT " +
                     "    m.idMascota, " +
                     "    m.nombreMascota AS nombreMascota, " +
                     "    CONCAT(d.nombre, ' ', d.apellido) AS nombreDueno, " +
                     "    tm.descripcionTipoMascota AS tipoMascota " +
                     "FROM tb_mascota m " +
                     "INNER JOIN tb_dueno d ON m.idDueno = d.idDueno " +
                     "INNER JOIN tb_tipo_mascota tm ON m.idTipoMascota = tm.idTipoMascota " +
                     "WHERE LOWER(m.nombreMascota) LIKE LOWER(?);";

        ps = conn.prepareStatement(sql);
        ps.setString(1, letter + "%");

        rs = ps.executeQuery();

        while (rs.next()) {
            MascotaVo mascotaVo = new MascotaVo();
            mascotaVo.setId_mascota(rs.getInt("idMascota"));
            mascotaVo.setNombreMascota(rs.getString("nombreMascota"));
            mascotaVo.setNombre_apellido_dueno(rs.getString("nombreDueno"));
            mascotaVo.setDescripcionTipoMascota(rs.getString("tipoMascota"));
            mascotas.add(mascotaVo);
        }

    } catch (SQLException e) {
            System.out.println("Error al buscar las mascotas: " + e.getMessage());
        } finally {
            
        }

    return mascotas;
    }

}
