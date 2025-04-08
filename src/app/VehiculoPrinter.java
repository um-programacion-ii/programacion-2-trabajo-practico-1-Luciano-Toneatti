package app;

public class VehiculoPrinter {

    public static void imprimir(Vehiculo vehiculo) {
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Año: " + vehiculo.getAnio());
        System.out.println("Capacidad de Carga (kg): " + vehiculo.getCapacidadCargaKg());
        System.out.println("------------------------------------");
    }
}

