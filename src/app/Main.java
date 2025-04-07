package app;

import src.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("AB123CD", "Toyota", 2020, 1500);
        Vehiculo vehiculo2 = new Vehiculo("EF456GH", "Ford", 2018, 1200);
        Vehiculo vehiculo3 = new Vehiculo("IJ789KL", "Mercedes", 2022, 1800);

        vehiculo1.mostrarInformacion();
        System.out.println("-----------------------------");
        vehiculo2.mostrarInformacion();
        System.out.println("-----------------------------");
        vehiculo3.mostrarInformacion();
    }
}
