import java.util.Scanner;

public class Electrodomestico extends Producto{

    private int vidaUtilAnios;
    private String sitioFabricacion;
    private double voltajeAlimentacion;
    private String garantia;

    public Electrodomestico(String nombre, double precio, String codigo, int cantidad,
                            String marca, int vidaUtilAnios, String sitioFabricacion,
                            double voltajeAlimentacion, String garantia) {
        super(nombre, precio, codigo, cantidad, marca);
        this.vidaUtilAnios = vidaUtilAnios;
        this.sitioFabricacion = sitioFabricacion;
        this.voltajeAlimentacion = voltajeAlimentacion;
        this.garantia = garantia;
    }
    public Electrodomestico(){
    }

    @Override
    public void ingresarProducto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        this.nombre=sc.next();
        System.out.println("Ingrese el precio del producto");
        this.precio=sc.nextDouble();
        System.out.println("Ingrese la vida util del producto en años");
        this.vidaUtilAnios=sc.nextInt();
        System.out.println("Ingrese sitio de fabricacion del producto");
        this.sitioFabricacion=sc.next();
        System.out.println("Ingrese el numero de voltaje que tiene el producto");
        this.voltajeAlimentacion=sc.nextDouble();
        System.out.println("Ingrese la garantia del producto");
        this.garantia=sc.next();
    }

    public double intervaloMantenimiento(){
       double intervalo = vidaUtilAnios/5;
       return intervalo;
    }

    @Override
    public String toString(){
        return "Electrodomestico: "+this.nombre+
                "\nPrecio: "+this.precio+
                "\nSitio de fabricacion: "+this.sitioFabricacion+
                "\nGarantia: "+this.garantia+
                "\nVoltaje: "+this.voltajeAlimentacion+
                "\nMantenimiento cada: "+intervaloMantenimiento();
    }

    public void imprimirElectrodomestico(){
        System.out.println(toString());
    }

    public int getVidaUtilAnios() {
        return vidaUtilAnios;
    }

    public void setVidaUtilAnios(int vidaUtilAnios) {
        this.vidaUtilAnios = vidaUtilAnios;
    }

    public String getSitioFabricacion() {
        return sitioFabricacion;
    }

    public void setSitioFabricacion(String sitioFabricacion) {
        this.sitioFabricacion = sitioFabricacion;
    }

    public double getVoltajeAlimentacion() {
        return voltajeAlimentacion;
    }

    public void setVoltajeAlimentacion(double voltajeAlimentacion) {
        this.voltajeAlimentacion = voltajeAlimentacion;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
}
