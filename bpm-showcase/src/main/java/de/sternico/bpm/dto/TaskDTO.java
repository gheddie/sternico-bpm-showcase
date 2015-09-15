package de.sternico.bpm.dto;

import java.io.Serializable;

public class TaskDTO implements Serializable
{
    private static final long serialVersionUID = 311378113469534360L;
    
    private String name;
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}