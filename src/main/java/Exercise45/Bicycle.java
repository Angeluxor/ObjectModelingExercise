package Exercise45;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Exercise45.Ferry.getVehicles;

/**
 * Representa una bicicleta y sus comportamientos
 */

public class Bicycle extends Vehicle {

    /**
     * Tipo de bicicleta
     */

    private String kind;

    /**
     * Solicita al usuario que determine el tipo de bicicleta que desea crear
     *
     * @param vehicle La instancia de la clase Bicycle que está siendo modificada
     */

    public static void kindRequest(Bicycle vehicle) {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        int option;

        while (!exit) {
            System.out.println("""                                                            
                    Select a kind of bicycle:
                                    
                    1. Mountain
                    2. Route
                    3. Exit
                                                        
                    """);
            try {
                option = scanner.nextInt();
                switch (option) {

                    case 1 -> {
                        vehicle.setKind("Mountain");
                        exit = true;
                    }
                    case 2 -> {
                        vehicle.setKind("Route");
                        exit = true;
                    }
                    case 3 -> System.exit(0);
                    default -> System.out.println("Sorry at the moment only the options between 1 and 3 are available");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scanner.next();
            }
        }
    }

    /**
     * Obtiene el tipo de bicicleta
     *
     * @return El tipo bicicleta en un objeto de clase String
     */

    public String getKind() {
        return kind;
    }

    /**
     * Asigna el tipo de bicicleta
     *
     * @param kind String que contiene el tipo de bicicleta
     */

    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Transforma en un String los valores de los atributos de una instancia de la clase Bicycle
     *
     * @return Un String con los valores de los atributos
     */
    @Override
    public String toString() {
        return "Vehicle " + (getVehicles().indexOf(this) + 1) + '\n' +
                "Type: " + super.getType() + '\n' +
                "Subtype: Bicycle" + '\n' +
                "Kind: " + getKind() + '\n' +
                "Manned: " + super.isManned() + '\n' +
                "Registration year: " + super.getRegistrationYear() + '\n' +
                "Passengers: " + super.getPassengers() + '\n' +
                "Wheels: " + super.getWheels() + '\n';
    }

}

