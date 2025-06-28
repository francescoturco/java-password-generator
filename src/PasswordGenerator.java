
import java.util.Scanner;



public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String nome = scanner.nextLine();
        System.out.println("Inserisci il tuo nome:");

        String cognome = scanner.nextLine();
        System.out.println("Inserisci il tuo cognome:");

        String colorePreferito = scanner.nextLine();
        System.out.println("Inserisci il tuo colore preferito:");

        int giorno = scanner.nextInt();
        System.out.println("Inserisci giorno di nascita (numero)");

        int mese = scanner.nextInt();
        System.out.println("Inserisci mese di nascita (numero)");
        
        int anno = scanner.nextInt();
        System.out.println("Inserisci anno di nascita (numero)");
    }

}
