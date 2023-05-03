
import java.util.Scanner;

public class Menu {
    public int menu(Scanner scanner){
        System.out.println("1.- Cifrar\n2.- Descifrar\n3.- Salir\n");//Imprimo el menu
        return scanner.nextInt();
    }
}