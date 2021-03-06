
package de.sternico.bpm.service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.sternico.bpm.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.sternico.bpm.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HashMapContainer }
     * 
     */
    public HashMapContainer createHashMapContainer() {
        return new HashMapContainer();
    }

    /**
     * Create an instance of {@link HashMapContainer.Values }
     * 
     */
    public HashMapContainer.Values createHashMapContainerValues() {
        return new HashMapContainer.Values();
    }

    /**
     * Create an instance of {@link TaskDTOArray }
     * 
     */
    public TaskDTOArray createTaskDTOArray() {
        return new TaskDTOArray();
    }

    /**
     * Create an instance of {@link TaskDTO }
     * 
     */
    public TaskDTO createTaskDTO() {
        return new TaskDTO();
    }

    /**
     * Create an instance of {@link HashMapContainer.Values.Entry }
     * 
     */
    public HashMapContainer.Values.Entry createHashMapContainerValuesEntry() {
        return new HashMapContainer.Values.Entry();
    }

}
