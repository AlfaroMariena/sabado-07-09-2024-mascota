import java.util.Scanner;

public class Mascota {
    // Variables para almacenar los datos de la mascota
    private String tipo;
    private String nombre;
    private String color;

    // Método para solicitar los datos al usuario
    public void solicitarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el tipo de mascota: ");
        tipo = scanner.nextLine();

        System.out.print("Ingresa el nombre de la mascota: ");
        nombre = scanner.nextLine();

        System.out.print("Ingresa el color de la mascota: ");
        color = scanner.nextLine();
    }

    // Método para mostrar la información de la mascota
    public void mostrarInformacion(String tipo, String nombre, String color) {
        System.out.println("Mi mascota es un " + tipo + " llamado " + nombre + ", su color es " + color + ".");
    }

    // Método principal
    public static void main(String[] args) {
        // Crear una instancia de Mascota
        Mascota miMascota = new Mascota();

        // Solicitar los datos de la mascota al usuario
        miMascota.solicitarDatos();

        // Mostrar la información de la mascota
        miMascota.mostrarInformacion(miMascota.tipo, miMascota.nombre, miMascota.color);
    }
}
