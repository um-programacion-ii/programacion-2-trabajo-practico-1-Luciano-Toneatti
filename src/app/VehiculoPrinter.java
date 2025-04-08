package app;


public class VehiculoPrinter {
    public void imprimir(Vehiculo vehiculo) {
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Año: " + vehiculo.getAnio());
        System.out.println("Capacidad de Carga: " + vehiculo.getCapacidadCargaKg() + " kg");

        if (vehiculo instanceof Camion) {
            Camion camion = (Camion) vehiculo;
            System.out.println("¿Tiene Acoplado?: " + (camion.isTieneAcoplado() ? "Sí" : "No"));
        }

        System.out.println("-----------------------------");
    }
}


