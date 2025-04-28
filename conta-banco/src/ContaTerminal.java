import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{

    Scanner scanner = new Scanner(System.in);
      System.out.println("Por favor, digite seu numero !");
         int numero = scanner.nextInt();
             scanner.nextLine();
                System.out.println("digite o número da Agência ");
                 String numeroAgencia = scanner.nextLine();
                 System.out.println("qual o seu nome?");
                 String nome = scanner.nextLine();
                 System.out.println("Qual será o saldo?");
                 Double saldo = scanner.nextDouble();
                
                 System.out.println("Olá, " + nome +  ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
                 
                 scanner.close();
    }
}
