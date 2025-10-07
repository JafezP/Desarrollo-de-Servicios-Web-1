/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.company.vo;

public class VentaPlanoVo {
    private int id_venta;
    private String codigo_bici;
    private String nombre_bici;
    private int stock;
    private int dni;
    private String nombre;

    public VentaPlanoVo() {
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
