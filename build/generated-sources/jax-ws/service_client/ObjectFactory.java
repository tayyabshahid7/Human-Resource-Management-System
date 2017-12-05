
package service_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service_client package. 
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

    private final static QName _ID_QNAME = new QName("http://services/", "ID");
    private final static QName _IDResponse_QNAME = new QName("http://services/", "IDResponse");
    private final static QName _UserName_QNAME = new QName("http://services/", "UserName");
    private final static QName _UserNameResponse_QNAME = new QName("http://services/", "UserNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ID }
     * 
     */
    public ID createID() {
        return new ID();
    }

    /**
     * Create an instance of {@link IDResponse }
     * 
     */
    public IDResponse createIDResponse() {
        return new IDResponse();
    }

    /**
     * Create an instance of {@link UserName }
     * 
     */
    public UserName createUserName() {
        return new UserName();
    }

    /**
     * Create an instance of {@link UserNameResponse }
     * 
     */
    public UserNameResponse createUserNameResponse() {
        return new UserNameResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ID")
    public JAXBElement<ID> createID(ID value) {
        return new JAXBElement<ID>(_ID_QNAME, ID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "IDResponse")
    public JAXBElement<IDResponse> createIDResponse(IDResponse value) {
        return new JAXBElement<IDResponse>(_IDResponse_QNAME, IDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "UserName")
    public JAXBElement<UserName> createUserName(UserName value) {
        return new JAXBElement<UserName>(_UserName_QNAME, UserName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "UserNameResponse")
    public JAXBElement<UserNameResponse> createUserNameResponse(UserNameResponse value) {
        return new JAXBElement<UserNameResponse>(_UserNameResponse_QNAME, UserNameResponse.class, null, value);
    }

}
