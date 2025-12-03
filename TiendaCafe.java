public class TiendaCafe {
    public static void main(String[] args) {
        // 1. Instanciar tres objetos de la clase Cafe
        Cafe cafe1 = new Cafe("Café Volcánico", "Nariño", 45000, 10.5f);
        Cafe cafe2 = new Cafe("Café de la Montaña", "Antioquia", 38000, 20.0f);
        Cafe cafe3 = new Cafe("Café Huila Especial", "Huila", 42000, 5.0f);

        // 2. Mostrar información y calcular total del Café 1
        cafe1.mostrarInformacion();
        System.out.println("Valor total del inventario: $" + cafe1.calcularPrecioTotal());

        // 3. Mostrar información y calcular total del Café 2
        cafe2.mostrarInformacion();
        System.out.println("Valor total del inventario: $" + cafe2.calcularPrecioTotal());

        // 4. Mostrar información y calcular total del Café 3
        cafe3.mostrarInformacion();
        System.out.println("Valor total del inventario: $" + cafe3.calcularPrecioTotal());

        // 5. Actualizar cantidad de uno de los cafés (Ej: Café 3)
        System.out.println("\n... Actualizando inventario del Café Huila ...");
        cafe3.actualizarCantidad(15.0f); // Cambiamos de 5.0 a 15.0 kilos
        
        // Mostrar la información actualizada
        cafe3.mostrarInformacion();
        System.out.println("Nuevo valor total: $" + cafe3.calcularPrecioTotal());
    }
}