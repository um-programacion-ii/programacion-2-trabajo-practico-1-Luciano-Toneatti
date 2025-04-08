package app;

import java.util.List;

public class VehiculoPrinter {
    public void imprimirInformacion(List<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.obtenerInformacion());
        }
    }
}



