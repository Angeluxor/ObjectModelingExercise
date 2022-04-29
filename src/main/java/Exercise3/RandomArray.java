package Exercise3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Representa un arreglo aleatorio de números y los comportamientos de este
 */

public class RandomArray {

    /**
     * Arreglo de números aleatorios
     */
    private static ArrayList<Integer> randomArray = new ArrayList<>();
    /**
     * Posición inicial del arreglo
     */
    private static int arrayBegin;
    /**
     * Posición final del arreglo
     */
    private static int arrayEnd;

    /**
     * Clase principal que llama a los métodos para generar el arreglo aleatorio y ordenarlo según el método elegido por el usuario
     *
     * @param args
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        setRandomArray(10);
        getArrayBeginFinal();
        System.out.println("""
                Select a sort type for the array:
                1.Bubble sort
                2.Quicksort
                3.Exit
                """);


        while (!exit) {

            try {

                int option = scanner.nextInt();

                switch (option) {

                    case 1 -> bubbleSort();
                    case 2 -> {
                        quickSort(randomArray, arrayBegin, arrayEnd);
                        System.out.println("Quick sorted array: " + randomArray);
                    }
                    case 3 -> exit = true;
                    default -> throw new IllegalStateException("Unexpected value: " + option);
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scanner.next();
            }
        }
    }

    /**
     * Genera un arreglo de números aleatorios de la longitud requerida por el usuario
     *
     * @param arrayLength Longitud deseada del arreglo
     */

    public static void setRandomArray(int arrayLength) {


        for (int i = 0; i < arrayLength; i++) {
            int e = (int) (Math.random() * 1000 + 1);
            randomArray.add(e);
        }

        System.out.println("Original random array: " + randomArray);

    }

    /**
     * Ordena el arreglo usando el método de burbuja
     */

    public static void bubbleSort() {

        int aux;


        for (int i = 2; i < randomArray.size(); i++) {
            for (int j = 0; j < randomArray.size() - 1; j++) {
                if (randomArray.get(j) > randomArray.get(j + 1)) {
                    aux = randomArray.get(j);
                    randomArray.set(j, randomArray.get(j + 1));
                    randomArray.set(j + 1, aux);
                }
            }
        }

        System.out.println("Bubble sorted array: " + randomArray);

    }

    /**
     * Obtiene la posición inicial y final del arreglo
     */

    public static void getArrayBeginFinal() {
        arrayBegin = 0;
        arrayEnd = randomArray.size() - 1;
    }

    /**
     * Ordena el arreglo usando el método quickSort
     *
     * @param array Arreglo a ordenar
     * @param left  Posición inicial
     * @param right Posición final
     */

    public static void quickSort(ArrayList<Integer> array, int left, int right) {

        int pivot = array.get(left);
        int i = left;
        int j = right;
        int aux;

        while (i < j) {
            while (array.get(i) <= pivot && i < j) {
                i++;
            }
            while (array.get(j) > pivot) {
                j--;
            }
            if (i < j) {
                aux = array.get(i);
                array.set(i, array.get(j));
                array.set(j, aux);
            }
        }

        array.set(left, array.get(j));
        array.set(j, pivot);

        if (left < j - 1) {
            quickSort(array, left, j - 1);
        }
        if (j + 1 < right) {
            quickSort(array, j + 1, right);
        }

        randomArray = array;


    }

}

