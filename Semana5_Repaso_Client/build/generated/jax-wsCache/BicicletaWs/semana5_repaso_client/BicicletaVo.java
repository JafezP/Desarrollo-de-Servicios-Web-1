
package semana5_repaso_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bicicletaVo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bicicletaVo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bici_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_bicicleta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "bicicletaVo", propOrder = {
    "biciNombre",
    "codigo",
    "idBicicleta",
    "stock"
})
public class BicicletaVo {

    @XmlElement(name = "bici_nombre")
    protected String biciNombre;
    protected String codigo;
    @XmlElement(name = "id_bicicleta")
    protected int idBicicleta;
    protected int stock;

    /**
     * Obtiene el valor de la propiedad biciNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiciNombre() {
        return biciNombre;
    }

    /**
     * Define el valor de la propiedad biciNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiciNombre(String value) {
        this.biciNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad idBicicleta.
     * 
     */
    public int getIdBicicleta() {
        return idBicicleta;
    }

    /**
     * Define el valor de la propiedad idBicicleta.
     * 
     */
    public void setIdBicicleta(int value) {
        this.idBicicleta = value;
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
