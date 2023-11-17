// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Alimento a1 = new Alimento();
        a1.ingresarProducto();
        Tecnologia t1 = new Tecnologia();
        t1.ingresarProducto();
        System.out.println(t1.toString());
        Electrodomestico e1 = new Electrodomestico();
        e1.ingresarProducto();
        System.out.println(t1.toString());

    }
}