import java.util.Scanner;

public class Operaciones {
    public String[] cifrar(Scanner scanner) {
        String palabra;
        String modificada = "";//Creo una cadena vacia donde almacenare la palabra modificada
        char letra;//Aqui almacenare temporalmente las letras que extraiga de la cadena

        System.out.println("Ingresa una palabra para cifrar/decifrar: ");
        palabra = scanner.next();

        for (int i = 0; i < palabra.length(); i++) {
            letra = palabra.charAt(i);//Separo la cadena que se ingreso por letras, primer posicion, primer letra
            if(letra>='a' && letra<='m' || letra>='A' && letra<='M'){/*Comparo si el caracter en el que estoy
            esta en el rango de A a M*/
                letra += 13;//Si esta en el rango le debo sumar 13
            }else {
                letra -= 13;//Si no esta en el rango se le resta 13
            }
            modificada += letra;//Agrego los caracteres a mi cadena vacia
        }
        return new String[]{modificada};//Retorno mi cadena donde modifique la palabra que se ingreso
    }
}

/*
 * Restar o sumar el numero 13 es porque el abecedario tiene 26 letras (sin contar la ñ), lo que significa
 * que si estoy en las primeras 13 letras, si aumento 13, estare en el siguiente rango, de 14 a 26,
 * pero si estoy en el rango de 14 a 26, debo restar 13 posiciones y asi llegare al rango de 1 a 13, y asi puedo
 * cifrar las letras
 *
 * Se le suma 13 numeros porque en la tabla del codigo ASCII, cada caracter tiene una representacion en numeros, si a una letra
 * le sumo un numero, obtendre el caracter que el codigo ASCII tenga en la posicion que obtuve al sumar el valor de la letra
 * mas el numero agregado
 * */
