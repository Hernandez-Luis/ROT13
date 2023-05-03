import java.util.Scanner;

public class OpMain {
    public void op(){
        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        Mostrar mostrar = new Mostrar();
        Menu menu = new Menu();
        String  [] mensaje;

        int x = 0;
        while (x!=3){
            x = menu.menu(scanner);
            switch (x){
                case 1, 2:
                    mensaje = operaciones.cifrar(scanner);//Cifro el mensaje
                    mostrar.muestra(mensaje);//Lo envio para mostrar en pantalla
                    break;
                    /*Junte los dos casos porque es el mismo codigo para cifrar o decifrar un mensaje*/
                case 3:
                    System.out.println("Saliste del programa");
                    break;
                default: System.out.println("Ingresa una opcion valida");
            }
        }
    }
}
