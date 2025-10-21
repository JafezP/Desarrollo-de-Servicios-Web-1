package pe.company.vo;

public class BicicletaVo {
    
    private int id_bicicleta;
    private String codigo;
    private String bici_nombre;
    private int Stock;

    public BicicletaVo() {
    }

    public int getId_bicicleta() {
        return id_bicicleta;
    }

    public void setId_bicicleta(int id_bicicleta) {
        this.id_bicicleta = id_bicicleta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getBici_nombre() {
        return bici_nombre;
    }

    public void setBici_nombre(String bici_nombre) {
        this.bici_nombre = bici_nombre;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

}
