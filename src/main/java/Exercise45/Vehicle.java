package Exercise45;

import static Exercise45.Ferry.getVehicles;

/**
 * Representa un vehículo y sus comportamientos
 */

public class Vehicle {

    /**
     * Tipo de un vehículo según su medio de desplazamiento
     */
    private String type;

    /**
     * Estado de tripulación de un vehículo
     */
    private boolean manned;

    /**
     * Año de registro de vehículo
     */
    private int registrationYear;


    /**
     * Número de pasajeros de un vehículo
     */
    private int passengers;

    /**
     * Número de ruedas de un vehículo
     */
    private int wheels;

    /**
     * Crea una instancia de la clase Vehicle
     */

    public Vehicle() {

    }

    /**
     * Obtiene el tipo de un vehículo
     *
     * @return Un String que contiene el tipo de vehículo
     */

    public String getType() {
        return type;
    }

    /**
     * Asigna el tipo de un vehículo
     *
     * @param type String que contiene el tipo de vehículo
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Obtiene el estado de tripulación de un vehículo
     *
     * @return Un boolean que contiene el estado de tripulación del vehículo
     */

    public boolean isManned() {
        return manned;
    }

    /**
     * Asigna el estado de tripulación de un vehículo
     *
     * @param manned Boolean que contiene el estado de tripulación
     */

    public void setManned(boolean manned) {
        this.manned = manned;
    }

    /**
     * Obtiene el año de registro de un vehículo
     *
     * @return Un int que contiene el año de registro del vehículo
     */

    public int getRegistrationYear() {
        return registrationYear;
    }

    /**
     * Asigna el año de registro de un vehículo
     *
     * @param registrationYear int que contiene el año de registro del vehículo
     */

    public void setRegistrationYear(int registrationYear) {
        this.registrationYear = registrationYear;
    }

    /**
     * Obtiene el número de pasajeros de un vehículo
     *
     * @return Un int que contiene el número de pasajeros del vehículo
     */

    public int getPassengers() {
        return passengers;
    }

    /**
     * Asigna el número de pasajeros de un vehículo
     *
     * @param passengers int que contiene el número de pasajeros del vehículo
     */

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    /**
     * Obtiene el número de ruedas de un vehículo
     *
     * @return Un int que contiene el número de ruedas del vehículo
     */

    public int getWheels() {
        return wheels;
    }

    /**
     * Asigna el número de ruedas de un vehículo
     *
     * @param wheels int que contiene el número de ruedas de un vehículo
     */

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    /**
     * Transforma en un String los valores de los atributos de una instancia de la clase Vehicle
     *
     * @return Un String con los valores de los atributos
     */

    @Override
    public String toString() {
        return "Vehicle " + (getVehicles().indexOf(this) + 1) + '\n' +
                "Type: " + type + '\n' +
                "Manned: " + manned + '\n' +
                "Registration year: " + registrationYear + '\n' +
                "Passengers: " + passengers + '\n' +
                "Wheels: " + wheels + '\n';
    }


}
