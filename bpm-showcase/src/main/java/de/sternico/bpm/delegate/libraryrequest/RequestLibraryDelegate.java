package de.sternico.bpm.delegate.libraryrequest;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import de.sternico.bpm.messages.ProcessMessages;

public class RequestLibraryDelegate implements JavaDelegate
{
    public void execute(DelegateExecution execution) throws Exception
    {
        BpmPlatform.getDefaultProcessEngine().getRuntimeService().correlateMessage(ProcessMessages.LibraryRequestMessages.MSG_START_CHECK);
    }
}