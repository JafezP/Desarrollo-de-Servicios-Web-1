package pe.company.vo;

public class BicicletaPlanoVo {
    private int idBici;
    private String codigoBici;
    private String nombreBici;
    private int stock;

    public BicicletaPlanoVo() {}

    public BicicletaPlanoVo(int idBici, String codigoBici, String nombreBici, int stock) {
        this.idBici = idBici;
        this.codigoBici = codigoBici;
        this.nombreBici = nombreBici;
        this.stock = stock;
    }

    public int getIdBici() {
        return idBici;
    }

    public void setIdBici(int idBici) {
        this.idBici = idBici;
    }

    public String getCodigoBici() {
        return codigoBici;
    }

    public void setCodigoBici(String codigoBici) {
        this.codigoBici = codigoBici;
    }

    public String getNombreBici() {
        return nombreBici;
    }

    public void setNombreBici(String nombreBici) {
        this.nombreBici = nombreBici;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
}
