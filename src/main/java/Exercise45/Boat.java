package Exercise45;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Exercise45.Ferry.getVehicles;

/**
 * Representa un bote y sus comportamientos
 */


public class Boat extends Vehicle {

    /**
     * Tipo de bote
     */

    private String kind;

    /**
     * Solicita al usuario que determine el tipo de bote que desea crear
     *
     * @param vehicle La instancia de la clase Boat que está siendo modificada
     */

    public static void kindRequest(Boat vehicle) {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        int option;

        while (!exit) {
            System.out.println("""                                                            
                    Select a kind of boat:
                                    
                    1. Recreation
                    2. Transport
                    3. Competition
                    4. Exit
                                                        
                    """);
            try {
                option = scanner.nextInt();
                switch (option) {

                    case 1 -> {
                        vehicle.setKind("Recreation");
                        exit = true;
                    }
                    case 2 -> {
                        vehicle.setKind("Transport");
                        exit = true;
                    }
                    case 3 -> {
                        vehicle.setKind("Competition");
                        exit = true;
                    }
                    case 4 -> System.exit(0);
                    default -> System.out.println("Sorry at the moment only the options between 1 and 4 are available");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scanner.next();
            }
        }
    }

    /**
     * Obtiene el tipo de bote
     *
     * @return El tipo bote en un objeto de clase String
     */

    public String getKind() {
        return kind;
    }

    /**
     * Asigna el tipo de bote
     *
     * @param kind String que contiene el tipo de bote
     */

    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Transforma en un String los valores de los atributos de una instancia de la clase Boat
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

