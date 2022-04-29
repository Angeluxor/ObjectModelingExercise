package Exercise45;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Exercise45.Ferry.getVehicles;

/**
 * Representa un auto y sus comportamientos
 */

public class Car extends Vehicle {

    /**
     * Número de puertas de un auto
     */

    private static int doors;

    /**
     * Tipo o clase específica de un auto
     */
    private String kind;

    /**
     * Solicita al usuario que determine el tipo de auto que desea crear y establece el número de puertas según el caso
     *
     * @param vehicle La instancia de la clase Car que está siendo modificada
     */

    public static void kindRequest(Car vehicle) {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        int option;

        while (!exit) {
            System.out.println("""                                                            
                    Select a kind of car:
                                    
                    1. Sedan
                    2. Coupe
                    3. Exit
                                                        
                    """);
            try {
                option = scanner.nextInt();
                switch (option) {

                    case 1 -> {
                        vehicle.setKind("Sedan");
                        doors = 5;
                        exit = true;
                    }
                    case 2 -> {
                        vehicle.setKind("Coupe");
                        doors = 3;
                        exit = true;
                    }
                    case 3 -> System.exit(0);
                    default -> System.out.println("Sorry at the moment only the options between 1 and 4 are available");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scanner.next();
            }
        }
    }

    /**
     * Obtiene el tipo de auto
     *
     * @return El tipo auto en un objeto de clase String
     */

    public String getKind() {
        return kind;
    }

    /**
     * Asigna el tipo de auto
     *
     * @param kind String que contiene el tipo de auto
     */

    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Transforma en un String los valores de los atributos de una instancia de la clase Car
     *
     * @return Un String con los valores de los atributos
     */

    @Override
    public String toString() {
        return "Vehicle " + (getVehicles().indexOf(this) + 1) + '\n' +
                "Type: " + super.getType() + '\n' +
                "Subtype: Car" + '\n' +
                "Kind: " + getKind() + '\n' +
                "Doors: " + doors + '\n' +
                "Manned: " + super.isManned() + '\n' +
                "Registration year: " + super.getRegistrationYear() + '\n' +
                "Passengers: " + super.getPassengers() + '\n' +
                "Wheels: " + super.getWheels() + '\n';
    }

}

