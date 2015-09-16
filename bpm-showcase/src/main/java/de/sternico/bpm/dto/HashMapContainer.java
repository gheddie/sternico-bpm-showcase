package de.sternico.bpm.dto;

import java.util.HashMap;

public class HashMapContainer
{
    private HashMap<String, Object> values; 
    
    public HashMapContainer()
    {
        super();
    }
    
    public HashMap<String, Object> getValues()
    {
        return values;
    }
    
    public void setValues(HashMap<String, Object> values)
    {
        this.values = values;
    }
}