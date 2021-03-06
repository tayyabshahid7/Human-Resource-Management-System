
package service_client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "serviceme", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Serviceme {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UserName")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UserName", targetNamespace = "http://services/", className = "service_client.UserName")
    @ResponseWrapper(localName = "UserNameResponse", targetNamespace = "http://services/", className = "service_client.UserNameResponse")
    @Action(input = "http://services/serviceme/UserNameRequest", output = "http://services/serviceme/UserNameResponse")
    public String userName(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ID")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ID", targetNamespace = "http://services/", className = "service_client.ID")
    @ResponseWrapper(localName = "IDResponse", targetNamespace = "http://services/", className = "service_client.IDResponse")
    @Action(input = "http://services/serviceme/IDRequest", output = "http://services/serviceme/IDResponse")
    public String id(
        @WebParam(name = "name", targetNamespace = "")
        int name);

}
