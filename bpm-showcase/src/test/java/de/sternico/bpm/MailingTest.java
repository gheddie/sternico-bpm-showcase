package de.sternico.bpm;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.naming.NamingException;

import org.junit.Test;

import de.sternico.bpm.util.MailUtils;
import de.sternico.bpm.util.MessagingPriority;

public class MailingTest
{
    @Test
    public void sendMail()
    {
        String subject = "Test";
        String body = "123";
        try
        {
            MailUtils.sendEmail("noreply@somehwere.com", "stefan.schulz.1976@googlemail.com", null, null, subject, body,
                    MessagingPriority.NORMAL);
        }
        catch (AddressException e)
        {
            e.printStackTrace();
        }
        catch (NamingException e)
        {
            e.printStackTrace();
        }
        catch (MessagingException e)
        {
            e.printStackTrace();
        }
    }
}