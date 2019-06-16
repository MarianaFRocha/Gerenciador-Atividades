
package gerenciadoratividades;

import java.util.Properties;
import java.util.Scanner;
import javax.mail.*;
import javax.mail.internet.*;

public class EnviarEmail {
    
      
    public void EnviarEmail(Usuario usuario, String destinatario){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o assunto do lembrete: ");
        String assunto = in.next();
        
        System.out.println("Digite a mensagem do lembrete: ");
        String mensagem = in.next();

        
        
        //Codigo de envio de email
        
        Properties props = new Properties();
            
            /** Parâmetros de conexão com servidor Gmail */

            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            
              Auth auth = new Auth(usuario.getEmail(), usuario.getSenha());//Email e senha do remetente
            
            Session session = Session.getDefaultInstance(props,auth);

            /** Ativa Debug para sessão */
            session.setDebug(true);

            try {

                  Message message = new MimeMessage(session);
                  message.setFrom(new InternetAddress("gerenciadoraPoo@gmail.com")); //Remetente
                
                  Address[] toUser = InternetAddress.parse(destinatario); //Destinatário(s) 
                  message.setRecipients(Message.RecipientType.TO, toUser);
                  
                  message.setSubject(assunto);//Assunto
                  message.setText(mensagem);
                  
                  /**Método para enviar a mensagem criada*/
                  Transport.send(message);

                  System.out.println("Feito!!!");

             } catch (MessagingException e) {
                  throw new RuntimeException(e);
            }
        
        
    }
    
}
