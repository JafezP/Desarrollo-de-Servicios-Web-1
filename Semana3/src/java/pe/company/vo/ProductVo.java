/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.company.vo;

import pe.company.dao.CategoryDao;

/**
 *
 * @author claud
 */
public class ProductVo {
    private int id_producto;
    private String nombre;
    private String marca;
    private double precio;
    private int stock;
    private CategoryVo categoryVo;

    public ProductVo() {
    }

    public ProductVo(int id_producto, String nombre, String marca, double precio, int stock, CategoryVo categoryVo) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        this.categoryVo = categoryVo;
    }

    

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public CategoryVo getCategoryVo() {
        return categoryVo;
    }

    public void setCategoryVo(CategoryVo categoryVo) {
        this.categoryVo = categoryVo;
    }
    
    
}
