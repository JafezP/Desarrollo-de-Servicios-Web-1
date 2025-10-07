
package pe.company.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ventaPlanoVo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ventaPlanoVo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo_bici" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_venta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre_bici" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ventaPlanoVo", propOrder = {
    "codigoBici",
    "dni",
    "idVenta",
    "nombre",
    "nombreBici",
    "stock"
})
public class VentaPlanoVo {

    @XmlElement(name = "codigo_bici")
    protected String codigoBici;
    protected int dni;
    @XmlElement(name = "id_venta")
    protected int idVenta;
    protected String nombre;
    @XmlElement(name = "nombre_bici")
    protected String nombreBici;
    protected int stock;

    /**
     * Obtiene el valor de la propiedad codigoBici.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBici() {
        return codigoBici;
    }

    /**
     * Define el valor de la propiedad codigoBici.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBici(String value) {
        this.codigoBici = value;
    }

    /**
     * Obtiene el valor de la propiedad dni.
     * 
     */
    public int getDni() {
        return dni;
    }

    /**
     * Define el valor de la propiedad dni.
     * 
     */
    public void setDni(int value) {
        this.dni = value;
    }

    /**
     * Obtiene el valor de la propiedad idVenta.
     * 
     */
    public int getIdVenta() {
        return idVenta;
    }

    /**
     * Define el valor de la propiedad idVenta.
     * 
     */
    public void setIdVenta(int value) {
        this.idVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreBici.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreBici() {
        return nombreBici;
    }

    /**
     * Define el valor de la propiedad nombreBici.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreBici(String value) {
        this.nombreBici = value;
    }

    /**
     * Obtiene el valor de la propiedad stock.
     * 
     */
    public int getStock() {
        return stock;
    }

    /**
     * Define el valor de la propiedad stock.
     * 
     */
    public void setStock(int value) {
        this.stock = value;
    }

}
