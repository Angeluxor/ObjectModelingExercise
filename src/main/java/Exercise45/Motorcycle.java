package Exercise45;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Exercise45.Ferry.getVehicles;

/**
 * Representa una motocicleta y sus comportamientos
 */

public class Motorcycle extends Vehicle {

    /**
     * Cilindrada de una motocicleta
     */

    private static int engineCapacity;

    /**
     * Solicita al usuario que determine la cilindrada de una motocicleta en CC
     *
     * @param vehicle La instancia de la clase Motorcycle que está siendo modificada
     */

    public static void kindRequest(Motorcycle vehicle) {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        int option;

        while (!exit) {
            System.out.println("""                                                            
                    Type the engine capacity on CC:
                                            
                    0. Exit
                                                        
                    """);
            try {
                option = scanner.nextInt();
                if (option == 0) {
                    System.exit(0);
                } else {
                    engineCapacity = option;
                    exit = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scanner.next();
            }
        }
    }

    /**
     * Transforma en un String los valores de los atributos de una instancia de la clase Motorcycle
     *
     * @return Un String con los valores de los atributos
     */

    @Override
    public String toString() {
        return "Vehicle " + (getVehicles().indexOf(this) + 1) + '\n' +
                "Type: " + super.getType() + '\n' +
                "Subtype: Motorcycle" + '\n' +
                "Engine capacity: " + engineCapacity + " CC" + '\n' +
                "Manned: " + super.isManned() + '\n' +
                "Registration year: " + super.getRegistrationYear() + '\n' +
                "Passengers: " + super.getPassengers() + '\n' +
                "Wheels: " + super.getWheels() + '\n';
    }

}

