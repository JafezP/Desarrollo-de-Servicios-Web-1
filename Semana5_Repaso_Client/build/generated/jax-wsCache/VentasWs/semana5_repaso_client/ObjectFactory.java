
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

    private final static QName _ListarVentas_QNAME = new QName("http://ws.model.pe/", "listarVentas");
    private final static QName _ListarVentasResponse_QNAME = new QName("http://ws.model.pe/", "listarVentasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: semana5_repaso_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarVentas }
     * 
     */
    public ListarVentas createListarVentas() {
        return new ListarVentas();
    }

    /**
     * Create an instance of {@link ListarVentasResponse }
     * 
     */
    public ListarVentasResponse createListarVentasResponse() {
        return new ListarVentasResponse();
    }

    /**
     * Create an instance of {@link VentasVo }
     * 
     */
    public VentasVo createVentasVo() {
        return new VentasVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarVentas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarVentas }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.model.pe/", name = "listarVentas")
    public JAXBElement<ListarVentas> createListarVentas(ListarVentas value) {
        return new JAXBElement<ListarVentas>(_ListarVentas_QNAME, ListarVentas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarVentasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarVentasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.model.pe/", name = "listarVentasResponse")
    public JAXBElement<ListarVentasResponse> createListarVentasResponse(ListarVentasResponse value) {
        return new JAXBElement<ListarVentasResponse>(_ListarVentasResponse_QNAME, ListarVentasResponse.class, null, value);
    }

}
