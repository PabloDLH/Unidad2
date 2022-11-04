// Utilización de la clase Math para hacer una calculadora que haga raices cuadradas
// y divisiones y si una operación no es posible lo comunique. Nos permitirá introducir
// las operaciones mediante un menú, y no terminará hasta que le digamos que lo haga.
public class Ejercicio10 {
    public static void main(String[] args) {
        int numero = -4;
        try {
            double raiz = Math.sqrt(numero);
            System.out.println("La raiz cuadrada es " + raiz);
        } catch (Exception e) {
            System.out.println("No puede hacerse la raiz");
        }
    }
}