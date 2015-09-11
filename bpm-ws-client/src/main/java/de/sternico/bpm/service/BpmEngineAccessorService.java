
package de.sternico.bpm.service;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BpmEngineAccessorService", targetNamespace = "http://service.bpm.sternico.de/", wsdlLocation = "http://localhost:8080/bpm-showcase-0.0.1-SNAPSHOT/BpmEngineAccessorWs?wsdl")
public class BpmEngineAccessorService
    extends Service
{

    private final static URL BPMENGINEACCESSORSERVICE_WSDL_LOCATION;
    private final static WebServiceException BPMENGINEACCESSORSERVICE_EXCEPTION;
    private final static QName BPMENGINEACCESSORSERVICE_QNAME = new QName("http://service.bpm.sternico.de/", "BpmEngineAccessorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/bpm-showcase-0.0.1-SNAPSHOT/BpmEngineAccessorWs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BPMENGINEACCESSORSERVICE_WSDL_LOCATION = url;
        BPMENGINEACCESSORSERVICE_EXCEPTION = e;
    }

    public BpmEngineAccessorService() {
        super(__getWsdlLocation(), BPMENGINEACCESSORSERVICE_QNAME);
    }

    public BpmEngineAccessorService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BPMENGINEACCESSORSERVICE_QNAME, features);
    }

    public BpmEngineAccessorService(URL wsdlLocation) {
        super(wsdlLocation, BPMENGINEACCESSORSERVICE_QNAME);
    }

    public BpmEngineAccessorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BPMENGINEACCESSORSERVICE_QNAME, features);
    }

    public BpmEngineAccessorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BpmEngineAccessorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BpmEngineAccessor
     */
    @WebEndpoint(name = "BpmEngineAccessorPort")
    public BpmEngineAccessor getBpmEngineAccessorPort() {
        return super.getPort(new QName("http://service.bpm.sternico.de/", "BpmEngineAccessorPort"), BpmEngineAccessor.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BpmEngineAccessor
     */
    @WebEndpoint(name = "BpmEngineAccessorPort")
    public BpmEngineAccessor getBpmEngineAccessorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.bpm.sternico.de/", "BpmEngineAccessorPort"), BpmEngineAccessor.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BPMENGINEACCESSORSERVICE_EXCEPTION!= null) {
            throw BPMENGINEACCESSORSERVICE_EXCEPTION;
        }
        return BPMENGINEACCESSORSERVICE_WSDL_LOCATION;
    }

}
