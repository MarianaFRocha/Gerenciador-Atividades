
package gerenciadoratividades;

import javax.mail.*;

public class Auth extends Authenticator {
    
        private String username;  
        private String password; 
        
        public Auth(String user, String pwd) {
            username = user;  
            password = pwd;  
    } 
    @Override
    protected PasswordAuthentication getPasswordAuthentication() {  
        return new PasswordAuthentication(username, password);  
    }  
}
