
package gerenciadoratividades;

import java.util.*;

public class Usuario {
    
    private String nome;
    private String email;
    private String senha;
    public List<String> amigos = new ArrayList<>();
    public List<Lembrete> lembretes = new ArrayList<>();
   
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getSenha(){
        return this.senha;
    }
    
    public void cadastrar(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o sue nome: ");
        nome = in.next();
        
        System.out.println("Digite o sue email: ");
        email = in.next();
        
        System.out.println("Digite a sua senha(email): ");
        senha = in.next();
        
        System.out.println("Cadastro Realizado Com Sucesso!");
        
    }
    
    public void adicionarAmigos(String amigo){
        
        amigos.add(amigo);
        
    }
    
    
    
}
