import java.util.Scanner;
public class HabilitacaoMain {

    public static void main(String[] args) {
        
        String tipoCNH;
        String anoNascimento;
        String nome;
        Scanner cin = new Scanner(System.in);        
        System.out.println("Informe seu nome:");
        nome = cin.nextLine();
        System.out.println("Informe sua data de nascimento (4 dígitos):");
        anoNascimento = cin.nextLine();
        if(VerificarIdade(anoNascimento))
        {
            System.out.println("Escolhe o tipo de habilitação:\nA - Moto\nB - Carro\nZ - Moto e Carro");
            tipoCNH = cin.next();
            Motorista m1 = new Motorista(nome, anoNascimento);
            m1.setTipoCNH(tipoCNH);  
            System.err.println("!------> Informações do motorista<------!");
            System.out.println(m1.getNome());
            System.out.println(m1.getAnoNascimento());
            System.out.println(m1.getTipoCNH());
        }
    }
    public static boolean VerificarIdade(String ano) {
        int numero = Integer.parseInt(ano);
        System.out.println("Quantidade de dígitos: " + ano.length());
        if(ano.length() > 4 || ano.length()<4){
            System.out.println("A data de Nascimento deve ter 4 dígitos!");
        }        
        else{
            
            if(numero < 1800){//Estou sendo gerenoso para não dizer que não é possível kkkkk
                System.out.println("Digite uma idade válida");
                return false;
            }
            else if(numero > 2003){
                System.out.println("Idade insuficiente para dirigir!");
                return false;
  
            }     
            else{
            return true;
            }
        }
        return false;
        
    }
    public static boolean validador() {
              return true;
        
    
    }
    
}
