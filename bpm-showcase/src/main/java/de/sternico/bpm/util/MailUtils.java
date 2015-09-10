package de.sternico.bpm.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.NamingException;

import org.apache.commons.lang3.StringUtils;

public class MailUtils
{

// static Logger logger = Logger.getLogger(MailUtils.class);

    /**
     * Sends a mail.
     * 
     * @param ctxt
     * @param from
     *            may be null
     * @param to
     * @param subject
     * @param body
     * @throws NamingException
     * @throws AddressException
     * @throws MessagingException
     */
    public static void sendEmail(String from, String to, String cc, String bcc, String subject, String body,
            MessagingPriority priority) throws NamingException, AddressException, MessagingException
    {
        sendEmail(from, to, cc, bcc, subject, body, priority, null);
    }

    /**
     * Sends a mail.
     * 
     * @param ctxt
     * @param from
     *            may be null
     * @param to
     * @param subject
     * @param body
     * @throws NamingException
     * @throws AddressException
     * @throws MessagingException
     */
    public static void sendEmail(String from, String to, String cc, String bcc, String subject, String body,
            MessagingPriority priority, String smtp) throws NamingException, AddressException, MessagingException
    {
        // toAddress = toAddress.replace(";", ",");
        if (StringUtils.isBlank(smtp))
        {
            //smtp = "bcc-sv005.bcc.intern";
            smtp = "mail.smtp.host";
        }

        // (1) Get a mail session.
        Properties props = new Properties();
        props.setProperty("mail.mime.charset", "utf-8");
        Session mx = Session.getInstance(props);

        // (2) Prepare message.
        MimeMessage msg = new MimeMessage(mx);

        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(clean(to), false));

        /* !Talking about this construct with tkz */
        if (StringUtils.isBlank(from))
        {
            from = "noreply@icyteas.de";
        }
        msg.setFrom(new InternetAddress(from));

        if (StringUtils.isNotBlank(cc))
        {
            msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(clean(cc), false));
        }
        if (StringUtils.isNotBlank(bcc))
        {
            msg.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(clean(bcc), false));
        }

        msg.setSubject(subject, "UTF-8");
        msg.setText(body, "UTF-8");

        switch (priority)
        {
            case HIGH:
                // ---------------------------
                msg.addHeader("X-Priority", "1");
                msg.addHeader("Priority", "Urgent");
                msg.addHeader("Importance", "high");
                // ---------------------------
                break;
            case NORMAL:
                // ---------------------------
                // nothing to do
                // ---------------------------
                break;
            case LOW:
                // ---------------------------
                msg.addHeader("X-Priority", "5");
                msg.addHeader("Priority", "Non-Urgent");
                msg.addHeader("Importance", "low");
                // ---------------------------
                break;
        }

        // (3) Send message.
        Transport t = mx.getTransport("smtp");
        t.connect(smtp, null, null);
        t.sendMessage(msg, msg.getAllRecipients());
        t.close();

    }

    private static String clean(String adress)
    {
        if (StringUtils.contains(adress, ";"))
        {
            adress = StringUtils.replace(adress, ";", ",");
        }
        return adress;
    }
}