/*Escribe un programa que solicite un carácter por teclado e informe de si es alfanumérico (letra o dígito) o no.
En caso de ser alfanumérico deberá indicar si es una letra o un dígito.
En caso de ser una letra deberá informar de si es minúscula o mayúscula.*/
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un carácter");
        String recogida = sc.next();
        char caracter =recogida.charAt(0);


        if (caracter >= 65 && caracter <= 90)System.out.println("Es alfanumerico\nEs una letra mayuscula");
        else if (caracter >= 97 && caracter <= 122)System.out.println("Es alfanumerico\nEs una letra minuscula");
        else if (caracter >= 48 && caracter <= 57)System.out.println("Es alfanumerico\nEs un Digito");
        else System.out.println("No es alfanumerico");

    }
}
