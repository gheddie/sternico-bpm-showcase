package de.sternico.bpm;

import de.sternico.bpm.service.BpmEngineAccessor;
import de.sternico.bpm.service.BpmEngineAccessorService;

/**
 * wsimport -keep -verbose http://localhost:8080/bpm-showcase-0.0.1-SNAPSHOT/BpmEngineAccessorWs?wsdl
 * 
 * @author Stefan.Schulz
 *
 */
public class BpmEngineClient
{
    public static void main(String[] args)
    {
        BpmEngineAccessor accessor = new BpmEngineAccessorService().getBpmEngineAccessorPort();
        accessor.startProcessInstanceByKey("LibraryRequestUserProcess");
//        accessor.correlateMessage("MSG_LIC_AVAIL");
//        accessor.debugProcessDefinitionKeys();
    }
}