
package org.example.stack74979278;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "KeyServiceImplService", targetNamespace = "http://stack74979278.example.org/", wsdlLocation = "http://localhost/test?wsdl")
public class KeyServiceImplService
    extends Service
{

    private final static URL KEYSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException KEYSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName KEYSERVICEIMPLSERVICE_QNAME = new QName("http://stack74979278.example.org/", "KeyServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/test?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        KEYSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        KEYSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public KeyServiceImplService() {
        super(__getWsdlLocation(), KEYSERVICEIMPLSERVICE_QNAME);
    }

    public KeyServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), KEYSERVICEIMPLSERVICE_QNAME, features);
    }

    public KeyServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, KEYSERVICEIMPLSERVICE_QNAME);
    }

    public KeyServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, KEYSERVICEIMPLSERVICE_QNAME, features);
    }

    public KeyServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public KeyServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns KeyService
     */
    @WebEndpoint(name = "KeyServiceImplPort")
    public KeyService getKeyServiceImplPort() {
        return super.getPort(new QName("http://stack74979278.example.org/", "KeyServiceImplPort"), KeyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns KeyService
     */
    @WebEndpoint(name = "KeyServiceImplPort")
    public KeyService getKeyServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://stack74979278.example.org/", "KeyServiceImplPort"), KeyService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (KEYSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw KEYSERVICEIMPLSERVICE_EXCEPTION;
        }
        return KEYSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
