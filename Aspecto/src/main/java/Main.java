public class Main {
    public static void main(String[] args) {
        // Intentamos crear dos configuradores distintos
        Configurador config1 = new Configurador("http://localhost", "miBase");
        Configurador config2 = new Configurador("http://otrohost", "otraBase");

        // Imprimimos valores para ver si se reutilizó la misma instancia
        System.out.println("Configurador 1:");
        System.out.println("URL: " + config1.getUrl());
        System.out.println("Base de datos: " + config1.getBaseDatos());

        System.out.println("\nConfigurador 2:");
        System.out.println("URL: " + config2.getUrl());
        System.out.println("Base de datos: " + config2.getBaseDatos());

        // Verificamos si son la misma instancia
        System.out.println("\n¿Es la misma instancia? " + (config1 == config2));
    }
}
