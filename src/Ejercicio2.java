/*Escribe un programa que lea del teclado tres números e indique el mayor de ellos.*/
import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.println("Introdduce el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Introdduce el tercer número: ");
        double num3 = sc.nextDouble();

        if (num1 > num2 && num1 >num3){
            System.out.println("El número mayor es " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayor es " + num2);

        }else{
            System.out.println("El número mayor es " + num3);
        }
    }
}
