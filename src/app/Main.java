package app;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC123", "Ford", 2015, 1000);
        Vehiculo v2 = new Vehiculo("XYZ789", "Chevrolet", 2018, 1200);
        Vehiculo v3 = new Vehiculo("LMN456", "Toyota", 2020, 800);

        VehiculoPrinter.imprimir(v1);
        VehiculoPrinter.imprimir(v2);
        VehiculoPrinter.imprimir(v3);
    }
}


