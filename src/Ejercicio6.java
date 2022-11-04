/*Debido a una pertinaz sequía se decidió poner en práctica un sistema de cobro de agua que penalice el consumo excesivo tal como indica la tabla siguiente:
Consumo ( en metros cúbicos)
€ por metro cúbico
Primeros 100
0.15
De 100 a 500
0.20
De 500 a 1000
0.35
Más de 1000
0.80
Escribe un programa que lea del teclado los metros cúbicos consumidos y muestre en la pantalla el coste de agua total.
 Ten en cuenta que en la tabla se indica lo que hay que cobrar por los metros cúbicos que se encuentran en el intervalo.
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los metros cubicos gastados: ");
        int metrosCubicos = sc.nextInt();

        final double PRIMEROS100 = 0.15;
        final double DE100A500 = 0.20;
        final double DE500A1000 = 0.35;
        final double MASDE1000 = 0.80;

        double hasta100 = 100 * PRIMEROS100;
        double hasta500 = (400 * DE100A500) + hasta100;
        double hasta1000 = (500 * DE500A1000) + hasta500;

        if(metrosCubicos >1 && metrosCubicos <=100) System.out.println("El precio a pagar es: "  + (metrosCubicos * PRIMEROS100)      + "€");
        else if (metrosCubicos <= 500) System.out.println("El precio a pagar es: "  + (hasta100  + (metrosCubicos-100)*DE100A500 )    + "€");
        else if (metrosCubicos <= 1000) System.out.println("El precio a pagar es: " + (hasta500  + (metrosCubicos-500)*DE500A1000)    + "€");
        else System.out.println("El precio a pagar es: "   + (hasta1000 + (metrosCubicos -1000) * MASDE1000) + "€");
    }
}