
package org.example.stack74979278;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "KeyService", targetNamespace = "http://stack74979278.example.org/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface KeyService {


    /**
     * 
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(name = "get", partName = "get")
    @Action(input = "http://stack74979278.example.org/KeyService/getPublicKeyRequest", output = "http://stack74979278.example.org/KeyService/getPublicKeyResponse")
    public byte[] getPublicKey();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "get", partName = "get")
    @Action(input = "http://stack74979278.example.org/KeyService/getDecodeByPrivateKeyRequest", output = "http://stack74979278.example.org/KeyService/getDecodeByPrivateKeyResponse")
    public String getDecodeByPrivateKey(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}