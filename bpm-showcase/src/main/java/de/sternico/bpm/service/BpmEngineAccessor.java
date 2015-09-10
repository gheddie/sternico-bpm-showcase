package de.sternico.bpm.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * + http://maksim.sorokin.dk/it/2011/01/20/jax-ws-web-services-maven-tomcat/ (!!!!!!!!!!!!!!!!!!!!!)
 * + http://memorynotfound.com/deploy-jaxws-application-tomcat-example/
 * + http://ics.upjs.sk/~novotnyr/blog/2068/deploying-jax-ws-services-on-java-7-and-tomcat-7
 * + http://www.java2blog.com/2013/03/jaxws-webservice-deployement-on-tomcat.html
 * + http://www.mkyong.com/webservices/jax-ws/jax-ws-hello-world-example-document-style/
 * + http://www.dineshonjava.com/2013/06/restful-web-services-with-jersey-jax-rs.html#.VfG9OVWqqko
 * + http://poor-developer.blogspot.de/2014/02/jersey-25-maven-easy-rest-web-services.html
 * 
 * @author Stefan.Schulz
 *
 */
@SuppressWarnings("restriction")
@WebService
@SOAPBinding(style = Style.RPC)
public class BpmEngineAccessor
{
    public String printMessage()
    {
        System.out.println("123");
        return "123";
    }
}