package de.sternico.bpm;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.container.RuntimeContainerDelegate;
import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.engine.test.ProcessEngineRule;
import org.junit.Rule;
import org.junit.Test;

public class LibraryRequestTest
{

    @Rule
    public ProcessEngineRule rule = new ProcessEngineRule();

    @Test
    @Deployment(resources = "LibraryRequest.bpmn")
    public void testParsingAndDeployment()
    {

    }

    @Test
    @Deployment(resources = "LibraryRequest.bpmn")
    public void testHistoryService()
    {
        //start process instance
        //rule.getRuntimeService().startProcessInstanceByKey("LibraryRequestUserProcess");
        
        //query done tasks
        System.out.println(rule.getHistoryService().createHistoricTaskInstanceQuery().list().size());
    }
}