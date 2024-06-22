import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1. Metodo para ingresar dos numeros y un operador cualquiera");
        System.out.println("2. Clase catedratico");
        System.out.println("3. Clase estudiante");
        System.out.println("4. Lista de estudiantes");
        System.out.println("5. Mostrar lista de estudiantes");
        System.out.println("6. Salir");

        System.out.print("Selecciona una opción (1-6): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Elegiste: Metodo para ingresar dos numeros y un operador cualquiera");
                break;
            case 2:
                System.out.println("Elegiste: Clase catedratico");
                break;
            case 3:
                System.out.println("Elegiste: Clase estudiante");
                break;
            case 4:
                System.out.println("Elegiste: Lista de estudiantes");
                break;
            case 5:
                System.out.println("Elegiste: Mostrar lista de estudiantes");
                break;
            case 6:
                System.out.println("¡Hasta luego!");
                break;

            default:
                System.out.println("Opción no válida. Inténtalo nuevamente.");
        }

        }
    }
