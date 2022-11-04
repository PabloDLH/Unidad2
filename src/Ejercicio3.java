
/*Escribe un programa que lea del teclado dos números e indique si uno de ellos es múltiplo de otro.*/
import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        if (num1 % num2 == 0){
            System.out.println(num1 + " es multiplo de " + num2);
        }else if (num2 % num1 == 0){
            System.out.println(num2 + " es multiplo de " + num1);
        }else{
            System.out.println("no son multiplos entre ellos :(");
        }
    }
}