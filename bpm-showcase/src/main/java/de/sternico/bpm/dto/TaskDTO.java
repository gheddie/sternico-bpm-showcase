package de.sternico.bpm.dto;

import java.io.Serializable;

public class TaskDTO implements Serializable
{
    private static final long serialVersionUID = 311378113469534360L;
    
    private String name;
    
    private String taskId;
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getTaskId()
    {
        return taskId;
    }
    
    public void setTaskId(String taskId)
    {
        this.taskId = taskId;
    }
}