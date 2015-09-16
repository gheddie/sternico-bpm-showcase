package de.sternico.bpm;

import java.util.List;

import de.sternico.bpm.service.BpmEngineAccessor;
import de.sternico.bpm.service.BpmEngineAccessorService;
import de.sternico.bpm.service.HashMap;
import de.sternico.bpm.service.HashMapContainer;
import de.sternico.bpm.service.HashMapContainer.Values;
import de.sternico.bpm.service.HashMapContainer.Values.Entry;
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
        System.out.println(taskList.size() + " tasks....");
        for (TaskDTO dto : taskList)
        {
            System.out.println(dto.getName() + " :: [task id="+dto.getTaskId()+"]");
        }
        
//        java.util.HashMap<String, Object> values = new java.util.HashMap<String, Object>();
//        values.put("licensesSuitable", true);
//        HashMapContainer variables = createVariables(values);
//        accessor.finishTask("cc5bba61-5ca9-11e5-b0a3-e0187702fffa", variables);
        
//        accessor.startProcessInstanceByKey("LibraryRequestUserProcess");
        
//        accessor.correlateMessage("MSG_LIC_AVAIL");
        
//        accessor.debugProcessDefinitionKeys();
    }

    private static HashMapContainer createVariables(java.util.HashMap<String, Object> variables)
    {
        HashMapContainer container = new HashMapContainer();
        Values values = new Values();
        Entry entry = null;
        for (String key : variables.keySet())
        {
            entry = new Entry();
            entry.setKey(key);
            entry.setValue(variables.get(key));
            values.getEntry().add(entry);
        }
        container.setValues(values);
        return container;
    }
}