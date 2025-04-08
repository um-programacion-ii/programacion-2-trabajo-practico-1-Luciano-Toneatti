package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehiculo camion1 = new Camion("ABC123", "Scania", 2015, 8000.0, true);
        Vehiculo camion2 = new Camion("DEF456", "Volvo", 2018, 9000.0, false);
        Vehiculo auto1 = new Auto("GHI789", "Toyota", 2020, 500.0, 5);

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(camion1);
        vehiculos.add(camion2);
        vehiculos.add(auto1);

        VehiculoPrinter printer = new VehiculoPrinter();
        printer.imprimirInformacion(vehiculos);
    }
}



