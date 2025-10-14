
package semana5_repaso_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the semana5_repaso_client package. 
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

    private final static QName _GetBicicletasByStock_QNAME = new QName("http://ws.model.pe/", "getBicicletasByStock");
    private final static QName _GetBicicletasByStockResponse_QNAME = new QName("http://ws.model.pe/", "getBicicletasByStockResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: semana5_repaso_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBicicletasByStock }
     * 
     */
    public GetBicicletasByStock createGetBicicletasByStock() {
        return new GetBicicletasByStock();
    }

    /**
     * Create an instance of {@link GetBicicletasByStockResponse }
     * 
     */
    public GetBicicletasByStockResponse createGetBicicletasByStockResponse() {
        return new GetBicicletasByStockResponse();
    }

    /**
     * Create an instance of {@link BicicletaVo }
     * 
     */
    public BicicletaVo createBicicletaVo() {
        return new BicicletaVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBicicletasByStock }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBicicletasByStock }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.model.pe/", name = "getBicicletasByStock")
    public JAXBElement<GetBicicletasByStock> createGetBicicletasByStock(GetBicicletasByStock value) {
        return new JAXBElement<GetBicicletasByStock>(_GetBicicletasByStock_QNAME, GetBicicletasByStock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBicicletasByStockResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBicicletasByStockResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.model.pe/", name = "getBicicletasByStockResponse")
    public JAXBElement<GetBicicletasByStockResponse> createGetBicicletasByStockResponse(GetBicicletasByStockResponse value) {
        return new JAXBElement<GetBicicletasByStockResponse>(_GetBicicletasByStockResponse_QNAME, GetBicicletasByStockResponse.class, null, value);
    }

}
