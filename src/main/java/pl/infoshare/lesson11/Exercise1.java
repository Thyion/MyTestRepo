package pl.infoshare.lesson11;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Exercise1 {

    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("krzbeszczynski@gmail.com", ""));
        email.setSSLOnConnect(true);
        email.setFrom("krzbeszczynski@gmail.com");
        email.setSubject("TestMail from Krzychu... :-)");
        email.addTo("aleksandra.gorak@gmail.com");
        email.send();
    }
}
