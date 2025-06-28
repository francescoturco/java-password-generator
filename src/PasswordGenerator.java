
import java.util.Scanner;



public class PasswordGenerator {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = scan.nextLine();

        System.out.print("Inserisci il tuo cognome: ");
        String cognome = scan.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        String colorePreferito = scan.nextLine();

        System.out.print("Inserisci il giorno di nascita (numero): ");
        int giorno = scan.nextInt();

        System.out.print("Inserisci il mese di nascita (numero): ");
        int mese = scan.nextInt();

        System.out.print("Inserisci l'anno di nascita: ");
        int anno = scan.nextInt();

        // Calcolo somma
        int sommaData = giorno + mese + anno;

       

    }

}
