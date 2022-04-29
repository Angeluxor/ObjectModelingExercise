package Exercise45;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Exercise45.Ferry.getVehicles;

/**
 * Representa un camión y sus comportamientos
 */

public class Truck extends Vehicle {

    /**
     * Altura de un camión
     */

    private static double height;

    /**
     * Solicita al usuario que determine la altura de un camión en metros
     *
     * @param vehicle La instancia de la clase Truck que está siendo modificada
     */


    public static void kindRequest(Truck vehicle) {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        double option;

        while (!exit) {
            System.out.println("""                                                            
                    Type the height of the truck on meters:
                                            
                    0. Exit
                                                        
                    """);
            try {
                option = scanner.nextDouble();
                if (option == 0.0) {
                    System.exit(0);
                } else {
                    height = option;
                    exit = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scanner.next();
            }
        }
    }

    /**
     * Transforma en un String los valores de los atributos de una instancia de la clase Truck
     *
     * @return Un String con los valores de los atributos
     */

    @Override
    public String toString() {
        return "Vehicle " + (getVehicles().indexOf(this) + 1) + '\n' +
                "Type: " + super.getType() + '\n' +
                "Subtype: Truck" + '\n' +
                "Height: " + height + " m" + '\n' +
                "Manned: " + super.isManned() + '\n' +
                "Registration year: " + super.getRegistrationYear() + '\n' +
                "Passengers: " + super.getPassengers() + '\n' +
                "Wheels: " + super.getWheels() + '\n';
    }

}

