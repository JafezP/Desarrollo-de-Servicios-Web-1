package pe.company.vo;

public class MascotaVo {
    private int id_mascota;
    private String nombreMascota;
    private String nombre_apellido_dueno;
    private String descripcionTipoMascota;

    public MascotaVo() {
    }

    public MascotaVo(int id_mascota, String nombreMascota, String nombre_apellido_dueno, String descripcionTipoMascota) {
        this.id_mascota = id_mascota;
        this.nombreMascota = nombreMascota;
        this.nombre_apellido_dueno = nombre_apellido_dueno;
        this.descripcionTipoMascota = descripcionTipoMascota;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getNombre_apellido_dueno() {
        return nombre_apellido_dueno;
    }

    public void setNombre_apellido_dueno(String nombre_apellido_dueno) {
        this.nombre_apellido_dueno = nombre_apellido_dueno;
    }

    public String getDescripcionTipoMascota() {
        return descripcionTipoMascota;
    }

    public void setDescripcionTipoMascota(String descripcionTipoMascota) {
        this.descripcionTipoMascota = descripcionTipoMascota;
    }
    
}
