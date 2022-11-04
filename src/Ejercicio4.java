/*Escribe un programa que indique si un número entero leído por teclado se puede expresar como el cuadrado de un número enteros.
Por ejemplo, el número 9 se puede expresar como el cuadrado de 3, mientras que el 8 no.
(Pista, no hace falta utilizar repetición, utilizar librería matemática).*/

import java.util.Scanner;
public class Ejercicio4{
    public static void main (String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        if(Math.sqrt(num) - (int)Math.sqrt(num) == 0){
            System.out.printf("%d Es el cuadrado de %.0f", num, Math.sqrt(num) );
        }else System.out.println("No hay cuadrado :c");
    }
}
/*
// Otra forma
public class Ejercicio4 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduzca un número entero: ");
       int num = sc.nextInt();
       boolean hayCuadrado = false  ;

        for (int i = 0;i<=num;i++){
           if (i * i == num){
               System.out.println(num + " es el cuadrado de "+ i);
               hayCuadrado = true;
           }
       }
        if (hayCuadrado == false) {
            System.out.println("No hay cuadrado :c");
        }
    }
}*/




















