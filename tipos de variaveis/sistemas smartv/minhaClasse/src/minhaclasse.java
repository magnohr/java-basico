import java.util.Locale;
import java.util.Scanner;

import javax.xml.transform.SourceLocator;

public class minhaclasse {

    public static void main(String[] args) {
        System.out.println("oi magno");
        System.out.println("qual sua idade ?");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int idade = scanner.nextInt();
        System.out.println("qual seu nome ? ");
        String nome = scanner.next();
        System.out.println("qual a sua altura ?");
        int altura = scanner.nextInt();
    }
}
