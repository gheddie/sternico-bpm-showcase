package de.sternico.bpm.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.engine.repository.ProcessDefinition;

/**
 * + http://maksim.sorokin.dk/it/2011/01/20/jax-ws-web-services-maven-tomcat/
 * 
 * @author Stefan.Schulz
 *
 */
@SuppressWarnings("restriction")
@WebService
@SOAPBinding(style = Style.RPC)
public class BpmEngineAccessor
{
    public void correlateMessage(String messageName, String businessKey)
    {
        BpmPlatform.getDefaultProcessEngine().getRuntimeService().correlateMessage(messageName, businessKey);
    }
    
    public void startProcessInstanceByKey(String processDefinitionKey)
    {
        BpmPlatform.getDefaultProcessEngine().getRuntimeService().startProcessInstanceByKey(processDefinitionKey);
    }
    
    public void debugProcessDefinitionKeys()
    {
        for (ProcessDefinition processDefinition : BpmPlatform.getDefaultProcessEngine().getRepositoryService().createProcessDefinitionQuery().list())
        {
            System.out.println("deployed key : " + processDefinition.getKey());
        }
    }
}