package com.lcwd;

import  javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;

import java.io.File;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String message="Hello,This is message for check";
        String subject="Confirmation Alert";
        String to="faizan.ahmed9175@gmail.com";
        String from="ansari.furquan07@gmail.com";
        
        //sendEmail(message,subject,to,from);
        sendAttach(message,subject,to,from);
        
    }
//this is responsible to send msg with attachment
    private static void sendAttach(String message, String subject, String to, String from) {
    	//variable for gmail host
    			String host="smtp.gmail.com";
    			
    			//get the system properties
    			Properties properties = System.getProperties();
    			
    			System.out.println("PROPERTIES"+ properties);
    			
    			//setting important information to properties object

    	        //host set
    			properties.put("mail.smtp.host",host);
    	        properties.put("mail.smtp.port","465");
    	        properties.put("mail.smtp.ssl.enable","true");
    	        properties.put("mail.smtp.auth","true");
    	        
    	        //Step 1:To get the session object
    	       Session session= Session.getInstance(properties,new Authenticator() {

    				@Override
    				protected PasswordAuthentication getPasswordAuthentication() {
    					return new PasswordAuthentication("ansari.furquan07@gmail.com","Furquan@07");
    				}	
    	        	
    	        });
    	       session.setDebug(true);
    	       //Step 2:Compose the message[text,multi media]
    	       MimeMessage m = new MimeMessage(session);
    	      try {
    	    	  //from mail
    	    	  m.setFrom(from);
    	    	  
    	    	  //adding Recipient to message
    	    	  m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
    	    	  
    	    	  //adding subject to msg
    	    	  m.setSubject(subject);
    	    	  
    	    	  //set attachment
    	    	  //file path
    	    	  String path="Documents\\banner.png";
    	    	  MimeMultipart mimeMultipart = new MimeMultipart();
    	    	  MimeBodyPart textMime = new MimeBodyPart();//adding text
    	    	  MimeBodyPart fileMime = new MimeBodyPart();//adding file
    	    	  
    	    	  try {
					textMime.setText(message);
					File file = new File(path);
					fileMime.attachFile(file);
					mimeMultipart.addBodyPart(textMime);
					mimeMultipart.addBodyPart(fileMime);
				} catch (Exception e) {
					e.printStackTrace();
				}
    	    	  
    	    	  m.setContent(mimeMultipart);
    	    	  
    	    	  //adding text to msg
    	    	  m.setText(message);
    	    	  
    	    	  //Step 3:send msg using transport class
    	    	  Transport.send(m);
    	    	  System.out.println("Send sucessfully...");
    	    	  
    		} catch (Exception e) {
    			e.printStackTrace();
    		}

		
	}

	//this method is responsilble for send email
	private static void sendEmail(String message, String subject, String to, String from) {
		//variable for gmail host
		String host="smtp.gmail.com";
		
		//get the system properties
		Properties properties = System.getProperties();
		
		System.out.println("PROPERTIES"+ properties);
		
		//setting important information to properties object

        //host set
		properties.put("mail.smtp.host",host);
        properties.put("mail.smtp.port","465");
        properties.put("mail.smtp.ssl.enable","true");
        properties.put("mail.smtp.auth","true");
        
        //Step 1:To get the session object
       Session session= Session.getInstance(properties,new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("ansari.furquan07@gmail.com","Furquan@07");
			}	
        	
        });
       session.setDebug(true);
       //Step 2:Compose the message[text,multi media]
       MimeMessage m = new MimeMessage(session);
      try {
    	  //from mail
    	  m.setFrom(from);
    	  
    	  //adding Recipient to message
    	  m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
    	  
    	  //adding subject to msg
    	  m.setSubject(subject);
    	  
    	  //adding text to msg
    	  m.setText(message);
    	  
    	  //Step 3:send msg using transport class
    	  Transport.send(m);
    	  System.out.println("Send sucessfully...");
    	  
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}
}
