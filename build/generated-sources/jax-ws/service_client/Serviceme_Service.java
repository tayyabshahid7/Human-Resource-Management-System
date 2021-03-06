
package service_client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "serviceme", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8080/cats/serviceme?wsdl")
public class Serviceme_Service
    extends Service
{

    private final static URL SERVICEME_WSDL_LOCATION;
    private final static WebServiceException SERVICEME_EXCEPTION;
    private final static QName SERVICEME_QNAME = new QName("http://services/", "serviceme");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/cats/serviceme?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEME_WSDL_LOCATION = url;
        SERVICEME_EXCEPTION = e;
    }

    public Serviceme_Service() {
        super(__getWsdlLocation(), SERVICEME_QNAME);
    }

    public Serviceme_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEME_QNAME, features);
    }

    public Serviceme_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICEME_QNAME);
    }

    public Serviceme_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEME_QNAME, features);
    }

    public Serviceme_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Serviceme_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Serviceme
     */
    @WebEndpoint(name = "servicemePort")
    public Serviceme getServicemePort() {
        return super.getPort(new QName("http://services/", "servicemePort"), Serviceme.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Serviceme
     */
    @WebEndpoint(name = "servicemePort")
    public Serviceme getServicemePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "servicemePort"), Serviceme.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEME_EXCEPTION!= null) {
            throw SERVICEME_EXCEPTION;
        }
        return SERVICEME_WSDL_LOCATION;
    }

}
