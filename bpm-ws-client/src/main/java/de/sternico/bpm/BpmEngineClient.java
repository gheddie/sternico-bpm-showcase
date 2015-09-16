package de.sternico.bpm;

import java.util.List;

import de.sternico.bpm.service.BpmEngineAccessor;
import de.sternico.bpm.service.BpmEngineAccessorService;
import de.sternico.bpm.service.TaskDTO;

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
        
        List<TaskDTO> taskList = accessor.queryAllTasks().getItem();
        System.out.println(taskList.size() + " tasks...");
        for (TaskDTO dto : taskList)
        {
            System.out.println(dto.getName());
        }
        
//        accessor.startProcessInstanceByKey("LibraryRequestUserProcess");
        
//        accessor.correlateMessage("MSG_LIC_AVAIL");
        
//        accessor.debugProcessDefinitionKeys();
    }
}