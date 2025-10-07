
package pe.company.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bicicletaPlanoVo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bicicletaPlanoVo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoBici" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idBici" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombreBici" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "bicicletaPlanoVo", propOrder = {
    "codigoBici",
    "idBici",
    "nombreBici",
    "stock"
})
public class BicicletaPlanoVo {

    protected String codigoBici;
    protected int idBici;
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
     * Obtiene el valor de la propiedad idBici.
     * 
     */
    public int getIdBici() {
        return idBici;
    }

    /**
     * Define el valor de la propiedad idBici.
     * 
     */
    public void setIdBici(int value) {
        this.idBici = value;
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
