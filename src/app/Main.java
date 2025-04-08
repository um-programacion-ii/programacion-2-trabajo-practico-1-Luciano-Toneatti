package app;

public class Main {
    public static void main(String[] args) {
        VehiculoPrinter printer = new VehiculoPrinter();

        Vehiculo v1 = new Vehiculo("ABC123", "Toyota", 2015, 1000);
        Vehiculo v2 = new Vehiculo("DEF456", "Ford", 2018, 1500);
        Camion camion = new Camion("GHI789", "Scania", 2020, 5000, true);

        printer.imprimir(v1);
        printer.imprimir(v2);
        printer.imprimir(camion);
    }
}


