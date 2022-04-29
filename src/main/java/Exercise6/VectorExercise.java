package Exercise6;

import java.util.Scanner;
import java.util.Vector;

/**
 * Representa un vector que recibe números introducidos por el usuario y sus comportamientos
 */

public class VectorExercise {

    /**
     * Vector de números de capacidad dinámica
     */
    private static final Vector<Integer> numVector = new Vector<>(10, 1);

    /**
     * Método principal que hace la llamada al método de introducción de números e imprime el vector al final
     *
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("Welcome" + '\n');
        numRequest();
        System.out.println(numVector);
    }

    /**
     * Solicita al usuario los números que se quieren introducir en el vector, finalizando si el usuario introduce el mismo número de manera consecutiva
     */

    public static void numRequest() {

        boolean control = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number" + '\n');
        int aux1 = scanner.nextInt();
        numVector.addElement(aux1);

        do {

            System.out.println("Please enter a number" + '\n');
            aux1 = scanner.nextInt();

            if (numVector.lastElement().equals(aux1)) {
                numVector.addElement(aux1);
                control = false;
            } else {
                numVector.addElement(aux1);
            }
        }

        while (control);

    }


}
