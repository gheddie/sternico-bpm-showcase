package de.sternico.bpm;

import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.engine.test.ProcessEngineRule;
import org.junit.Rule;
import org.junit.Test;

public class LibraryRequestTest {

	@Rule
	public ProcessEngineRule rule = new ProcessEngineRule();
	
	@Test
	@Deployment(resources = "LibraryRequest.bpmn")
	public void testParsingAndDeployment()
	{

	}	
}