
package pe.company.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.company.ws package. 
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

    private final static QName _ListarTodasVentas_QNAME = new QName("http://ws.company.pe/", "listarTodasVentas");
    private final static QName _ListarTodasVentasResponse_QNAME = new QName("http://ws.company.pe/", "listarTodasVentasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.company.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarTodasVentas }
     * 
     */
    public ListarTodasVentas createListarTodasVentas() {
        return new ListarTodasVentas();
    }

    /**
     * Create an instance of {@link ListarTodasVentasResponse }
     * 
     */
    public ListarTodasVentasResponse createListarTodasVentasResponse() {
        return new ListarTodasVentasResponse();
    }

    /**
     * Create an instance of {@link VentaPlanoVo }
     * 
     */
    public VentaPlanoVo createVentaPlanoVo() {
        return new VentaPlanoVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasVentas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarTodasVentas }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "listarTodasVentas")
    public JAXBElement<ListarTodasVentas> createListarTodasVentas(ListarTodasVentas value) {
        return new JAXBElement<ListarTodasVentas>(_ListarTodasVentas_QNAME, ListarTodasVentas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasVentasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarTodasVentasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "listarTodasVentasResponse")
    public JAXBElement<ListarTodasVentasResponse> createListarTodasVentasResponse(ListarTodasVentasResponse value) {
        return new JAXBElement<ListarTodasVentasResponse>(_ListarTodasVentasResponse_QNAME, ListarTodasVentasResponse.class, null, value);
    }

}
