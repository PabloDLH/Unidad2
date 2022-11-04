/*
Escribe un programa que solicite al usuario un número N y luego muestre por pantalla la siguiente ejecución:
        1
        1 2
        1 2 3
        ……
        1 2 3 ….N
        ….
        1 2 3
        1 2
        1
*/
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        int num = sc.nextInt();

        String resultado = "";
        String resultado2 = "";

        for (int i = 1; i <= num; i++) {
            String a = i + "\t";
            resultado = resultado + a;
            System.out.println(resultado);
        }
        for (int j = 1; j <= num; j++) {
            for (int i = 1; i <= num; i++) {
                String b = i + "\t";
                resultado2= resultado2 + b;
                if(i== num - j){

                        System.out.println(resultado2);


                }
            }
        }
    }
}