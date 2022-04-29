package Exercise45;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Representa un ferry y sus comportamientos
 */


public class Ferry {

    /**
     * Arreglo que contiene los vehículos que lleva el ferry
     */

    private static final ArrayList<Vehicle> vehicles = new ArrayList<>();

    /**
     * Método principal que llama a los métodos encargados de solicitar información al usuario
     *
     * @param args
     */

    public static void main(String[] args) {

        boolean control = true;
        while (control) {
            typeRequest();
            control = false;
        }

    }

    /**
     * Solicita al usuario que elija el tipo de vehículo que desea crear según su medio de desplazamiento
     */

    public static void typeRequest() {

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        int option;

        while (!exit) {
            System.out.println("""
                    Welcome to Ferry system
                                    
                    Select the type of vehicle do you want to create:
                                    
                    1. Aerial vehicle
                    2. Aquatic vehicle
                    3. Land vehicle
                    4. Exit
                                    
                    """);
            try {
                option = scanner.nextInt();
                switch (option) {

                    case 1 -> {
                        Vehicle vehicle = new Vehicle();
                        vehicle.setType("Aerial");
                        mannedRequest(vehicle);
                        yearRequest(vehicle);
                        if (vehicle.isManned()) {
                            passengersRequest(vehicle);
                        }
                        wheelsRequest(vehicle);
                        vehicles.add(vehicle);
                        newVehicle();
                        exit = true;

                    }
                    case 2 -> {
                        subtypeAquaticRequest();
                        exit = true;
                    }
                    case 3 -> {
                        subtypeLandRequest();
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
     * Solicita al usuario el estado de tripulación del vehículo
     *
     * @param vehicle Instancia de la clase Vehicle o de sus subclases que está siendo modificada
     */

    public static void mannedRequest(Vehicle vehicle) {

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        int option;

        while (!exit) {
            System.out.println("""
                                                        
                    Is the vehicle manned?
                                    
                    1. Yes
                    2. No
                    3. Exit
                                                        
                    """);
            try {
                option = scanner.nextInt();
                switch (option) {

                    case 1 -> {
                        vehicle.setManned(true);
                        exit = true;
                    }
                    case 2 -> {
                        vehicle.setManned(false);
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
     * Solicita al usuario el año de registro del vehículo
     *
     * @param vehicle Instancia de la clase Vehicle o de sus subclases que está siendo modificada
     */

    public static void yearRequest(Vehicle vehicle) {

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        int option;

        while (!exit) {
            System.out.println("""
                                                        
                    Type the registration year of the vehicle or type 0 to exit:
                                    
                    0. Exit
                                    
                    """);
            try {
                option = scanner.nextInt();
                if (option == 0) {
                    System.exit(0);
                } else {
                    vehicle.setRegistrationYear(option);
                    exit = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scanner.next();
            }
        }

    }

    /**
     * Solicita al usuario el número de pasajeros del vehículo
     *
     * @param vehicle Instancia de la clase Vehicle o de sus subclases que está siendo modificada
     */

    public static void passengersRequest(Vehicle vehicle) {

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        int option;

        while (!exit) {
            System.out.println("""
                                                        
                    Type the passengers number of the vehicle or type 0 to exit:
                                    
                    0. Exit
                                    
                    """);
            try {
                option = scanner.nextInt();
                if (option == 0) {
                    System.exit(0);
                } else {
                    vehicle.setPassengers(option);
                    exit = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scanner.next();
            }
        }

    }

    /**
     * Solicita al usuario el número de ruedas del vehículo
     *
     * @param vehicle Instancia de la clase Vehicle o de sus subclases que está siendo modificada
     */

    public static void wheelsRequest(Vehicle vehicle) {

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        int option;

        while (!exit) {
            System.out.println("""
                                                        
                    Type the wheels number of the vehicle:
                                                           
                    """);
            try {
                option = scanner.nextInt();
                vehicle.setWheels(option);
                exit = true;

            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scanner.next();
            }
        }

    }

    /**
     * Pregunta al usuario si desea crear otro vehículo o si desea cerrar e imprimir la lista de vehículos del ferry
     */

    public static void newVehicle() {
        boolean exit = false;

        Scanner scanner = new Scanner(System.in);
        int option;

        while (!exit) {
            System.out.println("""
                                                        
                    Do you want to create another vehicle:
                                            
                    1. Yes
                    2. Close and print the list of vehicles
                                    
                    """);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1 -> exit = true;
                    case 2 -> {

                        System.out.println(vehicles);
                        System.exit(0);
                    }
                    default -> System.out.println("Sorry at the moment only the options  1 and 2 are available");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scanner.next();
            }
        }

    }

    /**
     * Solicita al usuario que elija el subtipo de vehículo terrestre que desea crear y genera una instancia de la clase correspondiente
     */

    public static void subtypeLandRequest() {

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        int option;


        while (!exit) {
            System.out.println("""
                    Select the type of land vehicle do you want to create:
                                    
                    1. Bicycle
                    2. Motorcycle
                    3. Car
                    4. Truck
                    5. Exit
                                    
                    """);
            try {
                option = scanner.nextInt();
                switch (option) {

                    case 1 -> {
                        Bicycle vehicle = new Bicycle();
                        vehicle.setType("Land");
                        Bicycle.kindRequest(vehicle);
                        mannedRequest(vehicle);
                        yearRequest(vehicle);
                        if (vehicle.isManned()) {
                            passengersRequest(vehicle);
                        }
                        wheelsRequest(vehicle);
                        vehicles.add(vehicle);
                        newVehicle();
                        exit = true;
                    }
                    case 2 -> {
                        Motorcycle vehicle = new Motorcycle();
                        vehicle.setType("Land");
                        Motorcycle.kindRequest(vehicle);
                        mannedRequest(vehicle);
                        yearRequest(vehicle);
                        if (vehicle.isManned()) {
                            passengersRequest(vehicle);
                        }
                        wheelsRequest(vehicle);
                        vehicles.add(vehicle);
                        newVehicle();
                        exit = true;
                    }
                    case 3 -> {
                        Car vehicle = new Car();
                        vehicle.setType("Land");
                        Car.kindRequest(vehicle);
                        mannedRequest(vehicle);
                        yearRequest(vehicle);
                        if (vehicle.isManned()) {
                            passengersRequest(vehicle);
                        }
                        wheelsRequest(vehicle);
                        vehicles.add(vehicle);
                        newVehicle();
                        exit = true;
                    }
                    case 4 -> {
                        Truck vehicle = new Truck();
                        vehicle.setType("Land");
                        Truck.kindRequest(vehicle);
                        mannedRequest(vehicle);
                        yearRequest(vehicle);
                        if (vehicle.isManned()) {
                            passengersRequest(vehicle);
                        }
                        wheelsRequest(vehicle);
                        vehicles.add(vehicle);
                        newVehicle();
                        exit = true;
                    }
                    case 5 -> System.exit(0);
                    default -> System.out.println("Sorry at the moment only the options between 1 and 5 are available");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scanner.next();
            }
        }

    }

    /**
     * Solicita al usuario que elija el subtipo de vehículo acuático que desea crear y genera una instancia de la clase correspondiente
     */

    public static void subtypeAquaticRequest() {

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        int option;


        while (!exit) {
            System.out.println("""
                    Select the type of land vehicle do you want to create:
                                    
                    1. Boat
                    2. Exit
                                    
                    """);
            try {
                option = scanner.nextInt();
                switch (option) {

                    case 1 -> {
                        Boat vehicle = new Boat();
                        vehicle.setType("Aquatic");
                        Boat.kindRequest(vehicle);
                        mannedRequest(vehicle);
                        yearRequest(vehicle);
                        if (vehicle.isManned()) {
                            passengersRequest(vehicle);
                        }
                        wheelsRequest(vehicle);
                        vehicles.add(vehicle);
                        newVehicle();
                        exit = true;
                    }

                    case 2 -> System.exit(0);
                    default -> System.out.println("Sorry at the moment only the options 1 and 2 are available");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scanner.next();
            }
        }

    }

    /**
     * Obtiene la lista de vehículos del ferry
     *
     * @return Un arreglo que contiene todos los vehículos del ferry
     */

    public static ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }


}



