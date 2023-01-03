package org.example.stack74979278;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

  @WebService
  @SOAPBinding(style = SOAPBinding.Style.RPC)
  public interface KeyService {
    @WebMethod
    @WebResult(name = "get")
    byte[] getPublicKey();

    @WebMethod
    @WebResult(name = "get")
    String getDecodeByPrivateKey(String base64) throws Exception;

  }