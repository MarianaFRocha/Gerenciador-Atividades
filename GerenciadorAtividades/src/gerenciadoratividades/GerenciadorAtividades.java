
package gerenciadoratividades;

import java.util.*;

public class GerenciadorAtividades {

    public static List<Usuario> usuarios = new ArrayList<>();
        

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int opcaoInicial=0;
        
        while(opcaoInicial!=3){
            
            Usuario usuario = new Usuario();
            
            System.out.println("Digite:\n1-Para fazer Login\n2-Para se Cadastrar\n3-Sair");
            opcaoInicial = in.nextInt();

            if(opcaoInicial==1){

                int flagLogin=0;    // 1-logou com sucesso 0-nao logou

                System.out.println("Digite seu email:");
                String email = in.next();
                
                System.out.println("Email:" + email);  

                System.out.println("Digite sua senha:");
                String senha = in.next();

                for(int i=0;i<usuarios.size();i++){
                    if(email.equals(usuarios.get(i).getEmail())){
                        if(senha.equals(usuarios.get(i).getSenha())){
                            usuario=usuarios.get(i);
                            flagLogin=1;
                            System.out.println("Login Realizado com Sucesso!");
                        }

                    }
                }
                while(flagLogin==1){ 
                    
                    System.out.println("O que você deseja fazer agora:\n1-Criar Um Novo Lembrete\n2-Coferir Seus Lembretes\n"
                                        + "3-Adicionar Amigos\n4-Excluir Lembrete");
                    
                    int opcaoLogin = in.nextInt();
                    
                    if(opcaoLogin == 1){
                        Lembrete lembrete = new Lembrete();
                        lembrete.criarLembrete();
                        usuario.lembretes.add(lembrete);
                        
                    }
                    if(opcaoLogin == 2){
                        usuario.lembretes.get(0).lerLembrete(); 
                        
                    }


                                        
                    opcaoInicial=3;
                }
                if(flagLogin == 0){
                    System.out.println("Erro no Login. Tente Outra Vez!");
                }
   
            }else if(opcaoInicial==2){

                Usuario novoUsuario = new Usuario();
                novoUsuario.cadastrar();
                usuarios.add(novoUsuario);

            }else if(opcaoInicial>3){
                System.out.println("Opcao Invalida");
            }
        }

    }
    
}
