import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu Nome");
            String nome = scanner.next();

            System.out.println("Digite sua Idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua Altura");
            double altura = scanner.nextDouble();

            System.out.println("Meu nome È " + nome + "e tenho " + idade + "anos");
            System.out.println("E tenho" + altura + "de altura");

            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Os campos precisam ser numéricos");
        }

    }

}
