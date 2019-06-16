
package gerenciadoratividades;

import java.util.Scanner;

public class Lembrete {

	private String assunto;
	private String mensagem;
	private String horario;
	private String data;
	private String horaDeAntecedencia;

	public void criarLembrete(){
            
            Scanner in = new Scanner(System.in);
                   
            System.out.println("Digite a data do lembrete: ");
            data = in.next();
            
            System.out.println("Digite o dia do lembrete: ");
            horario = in.next();
            
            System.out.println("Quanto tempo antes você quer ser lembrado: ");
            horaDeAntecedencia = in.next();
            
            System.out.println("Digite o assunto do lembrete: ");
            assunto = in.next();
            
            System.out.println("Digite a mensagem do lembrete: ");
            mensagem = in.next(); //------------------------------------Dando Error!!!! Pega so a primeira string
           
	}   

	public void lerLembrete(){
            
            System.out.println("Lembrete:");
            System.out.println("    Assunto: " + assunto);
            System.out.println("    Data: " + data);
            System.out.println("    Horario: " + horario);
            System.out.println("    Mensagem: " + mensagem);
            System.out.println("    Tempo De Antecedencia: " + horaDeAntecedencia);

	}
        
        public void modificarLembrete(){
            
            Scanner in = new Scanner(System.in);
            
            System.out.println("Para Modificar:\n1-Assunto\n2-Mensagem\n3-Data\n4-Horario\n5-Tempo De Antecedencia");
            int opcao = in.nextInt();
            
            if(opcao==1){
                System.out.println("Assunto Atual: " + assunto);
                System.out.println("Digite o novo assunto: ");
                assunto = in.next();
                
                System.out.println("Atualizacao Feita com Sucesso!");
            }
            if(opcao==2){
                System.out.println("Mensagem Atual: " + assunto);
                System.out.println("Digite a nova mensagem: ");
                mensagem = in.next();
                
                System.out.println("Atualizacao Feita com Sucesso!");
            }
            if(opcao==3){
                System.out.println("Data Atual: " + assunto);
                System.out.println("Digite a nova data: ");
                data = in.next();
                
                System.out.println("Atualizacao Feita com Sucesso!");
            }
            if(opcao==4){
                System.out.println("Horario Atual: " + assunto);
                System.out.println("Digite o novo horario: ");
                horario = in.next();
                
                System.out.println("Atualizacao Feita com Sucesso!");
            }
            if(opcao==5){
                System.out.println("Tempo De Antecedencia Atual: " + assunto);
                System.out.println("Digite o novo Tempo De Antecedencia: ");
                horaDeAntecedencia = in.next();
                
                System.out.println("Atualizacao Feita com Sucesso!");
            }
            
        }
        

	


}
