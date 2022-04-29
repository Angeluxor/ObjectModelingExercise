package Exercise1;

/**
 * Representa un sistema planetario y sus comportamientos
 */

public class PlanetarySystem {

    /**
     * Constante de gravitación universal
     */

    public static final double UNIVERSAL_GRAVITATIONAL_CONS = 0.00000006673;

    /**
     * Clase principal que crea dos instancias de la clase AstronomicalObject y llama al método que calcula la atracción gravitacional entre ambos
     *
     * @param args
     */

    public static void main(String[] args) {

        AstronomicalObject objectA = new AstronomicalObject(
                21,
                4,
                48,
                68,
                "Tierra");

        AstronomicalObject objectB = new AstronomicalObject(
                24,
                1,
                25,
                43,
                "Marte");

        System.out.println(gravitationalAttraction(objectA, objectB, 50));


    }

    /**
     * Calcula la atracción gravitacional entre dos cuerpos celestes (instancias de la clase AstronomicalObject)
     *
     * @param a        Primer objeto
     * @param b        Segundo objeto
     * @param distance Distancia entre ambos objetos
     * @return Atracción gravitacional entre ambos objetos
     */

    public static double gravitationalAttraction(AstronomicalObject a, AstronomicalObject b, double distance) {

        double gravitationalAttraction;
        double mass1 = a.getMass();
        double mass2 = b.getMass();
        double distance2 = Math.pow(distance, 2);
        gravitationalAttraction = UNIVERSAL_GRAVITATIONAL_CONS * ((mass1 * mass2) / distance2);

        return gravitationalAttraction;
    }
}
