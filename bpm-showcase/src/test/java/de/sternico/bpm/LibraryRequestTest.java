package de.sternico.bpm;

import java.util.List;

import org.camunda.bpm.engine.history.HistoricTaskInstance;
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
        rule.getRuntimeService().startProcessInstanceByKey("LibraryRequestUserProcess");
        
        //query done tasks
        moo();
    }

    private void moo()
    {
        List<HistoricTaskInstance> historicTaskInstanceList = rule.getHistoryService().createHistoricTaskInstanceQuery().list();
        System.out.println(historicTaskInstanceList.size());
        for (HistoricTaskInstance task : historicTaskInstanceList)
        {
            System.out.println(task.getTaskDefinitionKey());
        }
    }
}