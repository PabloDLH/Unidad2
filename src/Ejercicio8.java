/* Escribe un programa que solicite al usuario un número N y luego muestre por pantalla la siguiente ejecución:
1
1 2
1 2 3
1 2 3 4
…………
1 2 3 4 …..N */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        int num = sc.nextInt();

        String  resultado= "";

        for(int i= 1;i<=num;i++ ){

                String a = i + "\t" ;
                resultado =  resultado + a;
                System.out.println(resultado);
        }
    }
}