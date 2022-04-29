package Exercise1;

import java.util.UUID;

/**
 * Representa un cuerpo celeste y sus características
 */

public class AstronomicalObject {

    /**
     * Masa de un cuerpo celeste
     */
    private double mass;
    /**
     * Densidad de un cuerpo celeste
     */
    private double density;
    /**
     * Diámetro de un cuerpo celeste
     */
    private double diameter;
    /**
     * Distancia al sol de un cuerpo celeste
     */
    private double sunDistance;
    /**
     * Identificador único de un cuerpo celeste
     */
    private UUID uniqueId;
    /**
     * Nombre de un cuerpo celeste
     */
    private String name;

    /**
     * Crea una instancia de la clase AstronomicalObject
     */

    public AstronomicalObject() {

    }

    /**
     * Crea una instancia de la clase AstronomicalObject
     *
     * @param mass        Masa del objeto
     * @param density     Densidad del objeto
     * @param diameter    Diámetro del objeto
     * @param sunDistance Distancia al sol del objeto
     * @param name        Nombre del objeto
     */

    public AstronomicalObject(
            double mass,
            double density,
            double diameter,
            double sunDistance,
            String name) {

        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.sunDistance = sunDistance;
        this.name = name;
        this.uniqueId = UUID.randomUUID();
    }

    /**
     * Obtiene la masa del objeto
     *
     * @return Masa del objeto expresada como un Double
     */

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getSunDistance() {
        return sunDistance;
    }

    public void setSunDistance(double sunDistance) {
        this.sunDistance = sunDistance;
    }

    public UUID getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(UUID uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
