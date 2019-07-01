

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesHelper;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;



/**
 *
 * @author John
 */
public abstract class  MailSender {
    public MailSender(){
    
    }
    
    public static void enviaEmailSimples(String texto, String assunto, String destinatario) throws EmailException, MessagingException{
	/*String meuEmail = "noreply-newschoolsoccer@gmail.com";
        String senha = "Newss2019";
	SimpleEmail email = new SimpleEmail();
	email.setHostName("smtp.gmail.com"); // o servidor SMTP para envio do e-mail do google
	email.setSmtpPort(465);
        email.setDebug(true);   
        email.setAuthentication(meuEmail,senha);
       
        email.setSSLOnConnect(false);
        //email.setSSL(true);



        
        
       
//        email.setDebug(true);
//        email.setCharset(HtmlEmail.ISO_8859_1);
//        Properties props = new Properties();
//        props.setProperty("smtp.gmail.com", "smtp");
//        props.setProperty("mail.smtp.host", "smtp.gmail.com");
//        props.setProperty("mail.smtp.auth", "true");
//        props.setProperty("mail.smtp.port", "" + 587);
//        props.setProperty("mail.smtp.starttls.enable", "true");
        email.setFrom(meuEmail);
        email.setSubject("Recuperar senha");
        email.setMsg(texto);
        email.addTo(meuEmail);
        email.send();	
        
        
        System.out.println("E-mail enviado com sucesso!");
                */
        texto = texto+"\n\nAtenciosamente,\n\nNew School Soccer\n\n\n\n"+
                "***Este e-mail é automático, favor não respondê-lo***";
        Properties props = new Properties();
        /** Parâmetros de conexão com servidor Gmail */
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", 
        "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
         new javax.mail.Authenticator() {
           protected PasswordAuthentication getPasswordAuthentication() 
           {
                 return new PasswordAuthentication("noreply.newschoolsoccer@gmail.com", 
                 "Newss2019");
           }
      });
 
          /** Ativa Debug para sessão */
        session.setDebug(true);

        try {
 
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("noreply.newschoolsoccer@gmail.com")); 
        //Remetente

        Address[] toUser = InternetAddress //Destinatário(s)
                   .parse(destinatario);  

        message.setRecipients(Message.RecipientType.TO, toUser);
        message.setSubject(assunto);//Assunto
        message.setText(texto);
        /**Método para enviar a mensagem criada*/
        Transport.send(message);

        System.out.println("Feito!!!");

       } catch (MessagingException e) {
          throw new RuntimeException(e);
      }
  }
}
   
    

