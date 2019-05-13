package com.jdbc.connection;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail
{
public static void main(String [] args)
{  
	
	SendEmail A=new SendEmail();
	A.generateEmail("");
    // Sender's email ID needs to be mentioned
     String from = "deepakdm2016@gmail.com";
     String pass ="Winvini@2016";
    // Recipient's email ID needs to be mentioned.
   String to = "deepakdm2016@gmail.com";

   String host = "smtp.gmail.com";

   // Get system properties
   Properties properties = System.getProperties();
   // Setup mail server
   properties.put("mail.smtp.starttls.enable", "true");
   properties.put("mail.smtp.host", host);
   properties.put("mail.smtp.user", from);
   properties.put("mail.smtp.password", pass);
   properties.put("mail.smtp.port", "587");
   properties.put("mail.smtp.auth", "true");
   
   // Get the default Session object.
   Session session = Session.getDefaultInstance(properties);

   try{
      // Create a default MimeMessage object.
      MimeMessage message = new MimeMessage(session);

      // Set From: header field of the header.
      message.setFrom(new InternetAddress(from));

      // Set To: header field of the header.
      message.addRecipient(Message.RecipientType.TO,
                               new InternetAddress(to));

      // Set Subject: header field
      message.setSubject("LegendsHub - Work on your way- check out the new activities for these legends");

      // Now set the actual message
      message.setText("This is actual message");

      // Send message
      Transport transport = session.getTransport("smtp");
      transport.connect(host, from, pass);
      transport.sendMessage(message, message.getAllRecipients());
      transport.close();
      System.out.println("Sent message successfully....");
   }catch (MessagingException mex) {
      mex.printStackTrace();
   }
}

public  void generateEmail(String Email) {
	// TODO Auto-generated method stub

    // Sender's email ID needs to be mentioned
    String from = "deepakdm2016@gmail.com";
    String pass ="Winvini@2016";
   // Recipient's email ID needs to be mentioned.
    String to = "deepakdm2016@gmail.com";

  String host = "smtp.gmail.com";

  // Get system properties
  Properties properties = System.getProperties();
  // Setup mail server
  properties.put("mail.smtp.starttls.enable", "true");
  properties.put("mail.smtp.host", host);
  properties.put("mail.smtp.user", from);
  properties.put("mail.smtp.password", pass);
  properties.put("mail.smtp.port", "587");
  properties.put("mail.smtp.auth", "true");

  // Get the default Session object.
  Session session = Session.getDefaultInstance(properties);

  try{
     // Create a default MimeMessage object.
     MimeMessage message = new MimeMessage(session);

     // Set From: header field of the header.
     message.setFrom(new InternetAddress(from));

     // Set To: header field of the header.
     message.addRecipient(Message.RecipientType.TO,
                              new InternetAddress(to));
     
    // message.addRecipients(Message.RecipientType.CC, 
          //   InternetAddress.parse("amrit_3327@yahoo.com,suchitray13@gmail.com"));

     // Set Subject: header field
     message.setSubject("LegendsHub - Work on your way- check out the new activities for these legends");

     // Now set the actual message
     message.setText(Email);

     // Send message
     Transport transport = session.getTransport("smtp");
     transport.connect(host, from, pass);
     transport.sendMessage(message, message.getAllRecipients());
     transport.close();
     System.out.println("Sent message successfully....");
  }catch (MessagingException mex) {
     mex.printStackTrace();
  }
	
}
}