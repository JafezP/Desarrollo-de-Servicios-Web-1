
package pe.company.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscarPorStock complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscarPorStock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stockIngresado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarPorStock", propOrder = {
    "stockIngresado"
})
public class BuscarPorStock {

    protected int stockIngresado;

    /**
     * Obtiene el valor de la propiedad stockIngresado.
     * 
     */
    public int getStockIngresado() {
        return stockIngresado;
    }

    /**
     * Define el valor de la propiedad stockIngresado.
     * 
     */
    public void setStockIngresado(int value) {
        this.stockIngresado = value;
    }

}
