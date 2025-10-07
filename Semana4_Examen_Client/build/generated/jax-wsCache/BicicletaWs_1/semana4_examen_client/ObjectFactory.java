
package semana4_examen_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the semana4_examen_client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarPorStock_QNAME = new QName("http://ws.company.pe/", "buscarPorStock");
    private final static QName _BuscarPorStockResponse_QNAME = new QName("http://ws.company.pe/", "buscarPorStockResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: semana4_examen_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarPorStock }
     * 
     */
    public BuscarPorStock createBuscarPorStock() {
        return new BuscarPorStock();
    }

    /**
     * Create an instance of {@link BuscarPorStockResponse }
     * 
     */
    public BuscarPorStockResponse createBuscarPorStockResponse() {
        return new BuscarPorStockResponse();
    }

    /**
     * Create an instance of {@link BicicletaPlanoVo }
     * 
     */
    public BicicletaPlanoVo createBicicletaPlanoVo() {
        return new BicicletaPlanoVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPorStock }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarPorStock }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "buscarPorStock")
    public JAXBElement<BuscarPorStock> createBuscarPorStock(BuscarPorStock value) {
        return new JAXBElement<BuscarPorStock>(_BuscarPorStock_QNAME, BuscarPorStock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPorStockResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarPorStockResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "buscarPorStockResponse")
    public JAXBElement<BuscarPorStockResponse> createBuscarPorStockResponse(BuscarPorStockResponse value) {
        return new JAXBElement<BuscarPorStockResponse>(_BuscarPorStockResponse_QNAME, BuscarPorStockResponse.class, null, value);
    }

}
