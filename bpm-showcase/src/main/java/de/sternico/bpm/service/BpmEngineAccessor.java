package de.sternico.bpm.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.engine.task.Task;

import de.sternico.bpm.dto.HashMapContainer;
import de.sternico.bpm.dto.TaskDTO;

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
    public void correlateMessage(String messageName)
    {
        correlateMessageWithBusinessKey(messageName, null);
    }
    
    public void correlateMessageWithBusinessKey(String messageName, String businessKey)
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
    
    public void finishTask(String taskId, HashMapContainer variables)
    {
        BpmPlatform.getDefaultProcessEngine().getTaskService().complete(taskId, variables.getValues());
    }
   
    public TaskDTO[] queryAllTasks()
    {
        List<TaskDTO> taskList = new ArrayList<TaskDTO>();
        TaskDTO dto = null;
        for (Task task : BpmPlatform.getDefaultProcessEngine().getTaskService().createTaskQuery().list())
        {
            dto = new TaskDTO();
            dto.setName(task.getName());
            dto.setTaskId(task.getId());
            taskList.add(dto);
        }
        return taskList.toArray(new TaskDTO[taskList.size()]);
    }
}