public class Cafe {
    // Atributos
    private String nombre;
    private String region;
    private double precioPorKilo;
    private float cantidadEnKilos;

    // Constructor: Inicializa los atributos cuando creamos un objeto
    public Cafe(String nombre, String region, double precioPorKilo, float cantidadEnKilos) {
        this.nombre = nombre;
        this.region = region;
        this.precioPorKilo = precioPorKilo;
        this.cantidadEnKilos = cantidadEnKilos;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("--- Información del Café ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Región: " + region);
        System.out.println("Precio por Kilo: $" + precioPorKilo);
        System.out.println("Cantidad disponible: " + cantidadEnKilos + " kg");
    }

    // Método para calcular precio total
    public double calcularPrecioTotal() {
        return precioPorKilo * cantidadEnKilos;
    }

    // Método para actualizar la cantidad disponible
    public void actualizarCantidad(float nuevaCantidad) {
        this.cantidadEnKilos = nuevaCantidad;
        System.out.println(">> Cantidad actualizada a: " + this.cantidadEnKilos + " kg");
    }
    
    // Getters y Setters (Opcionales para este ejercicio, pero buena práctica)
    public void setPrecioPorKilo(double precioPorKilo) {
        this.precioPorKilo = precioPorKilo;
    }
    // Método nuevo para aplicar descuento
public void aplicarDescuento(double porcentaje) {
    double descuento = this.precioPorKilo * (porcentaje / 100);
    this.precioPorKilo -= descuento;
    System.out.println(">> Se ha aplicado un descuento del " + porcentaje + "%. Nuevo precio: $" + this.precioPorKilo);
}
}