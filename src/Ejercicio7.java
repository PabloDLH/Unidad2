/* Escribe un programa que lea un número entero N mayor que 0 y calcule la suma 1+2+3+4+5+6+...+N */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        int num = sc.nextInt();
        int resultado = 0;

        for(int i= 0;i<=num;i++ ){
             resultado= resultado + i;
             if (i == num) System.out.println(resultado);
        }
    }
}
