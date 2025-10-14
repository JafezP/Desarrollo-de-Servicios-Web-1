package pe.company.vo;

public class VentasVo {
    
    // Pueden ser nombres similares al de la BD
    
    private String id_venta;
    private String nombre;
    private String dni;
    private String codigo_bici;
    private String nombre_bici;
    private int stock;

    public VentasVo() {
    }

    public String getId_venta() {
        return id_venta;
    }

    public void setId_venta(String id_venta) {
        this.id_venta = id_venta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCodigo_bici() {
        return codigo_bici;
    }

    public void setCodigo_bici(String codigo_bici) {
        this.codigo_bici = codigo_bici;
    }

    public String getNombre_bici() {
        return nombre_bici;
    }

    public void setNombre_bici(String nombre_bici) {
        this.nombre_bici = nombre_bici;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
