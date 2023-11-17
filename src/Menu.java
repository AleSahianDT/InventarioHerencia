import java.util.ArrayList;
import java.util.Scanner;

    public class Menu {
        private Scanner scanner;
        private Producto producto;

        public Menu() {
            scanner = new Scanner(System.in);
            producto = new Producto();
        }

        public void mostrarMenu() {
            System.out.println("-----BIENVENIDO AL INVENTARIO DE PRODUCTOS------");
            System.out.println("1. Agregar Alimento");
            System.out.println("2. Agregar Electrodomestico");
            System.out.println("3. Agregar Tecnologia");
            System.out.println("4. Salir");
            System.out.println("-------------------------------");
            System.out.print("Porfavor, seleccione una opción: ");
        }

        public void ejecutarOpcion(int opcion) {
            switch (opcion) {
                case 1:
                    Alimento a1 = new Alimento();
                    a1.ingresarProducto();
                    System.out.println(a1.toString());
                    break;
                case 2:
                    Electrodomestico e1 = new Electrodomestico();
                    e1.ingresarProducto();
                    System.out.println(e1.toString());
                    break;
                case 3:
                    Tecnologia t1 = new Tecnologia();
                    t1.ingresarProducto();
                    System.out.println(t1.toString());
                    break;
                case 4:
                    System.out.println("¡Inventario Cerrada!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
        public Scanner getScanner() {
            return scanner;
        }
        public void Ejecucion() {
            while (true) {
                mostrarMenu();
                int opcion = Integer.parseInt(scanner.next());
                ejecutarOpcion(opcion);
            }
        }
    }

