import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal
 {
    public static void main(String[] args){
        // Criar o Objeto
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite o numero da sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo da sua conta");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco");
        System.out.println("sua agência é " + agencia + " conta " + numero);
        System.out.println("e seu saldo " + saldo + " já está disponivel para saque");



    }
}
