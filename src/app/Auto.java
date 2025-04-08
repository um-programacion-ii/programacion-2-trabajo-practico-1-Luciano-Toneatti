package app;

public class Auto extends Vehiculo {
    private int cantidadPasajeros;

    public Auto(String patente, String marca, int anio, double capacidadCargaKg, int cantidadPasajeros) {
        super(patente, marca, anio, capacidadCargaKg);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String obtenerInformacion() {
        return getMarca() + " - " + getPatente() +
                " - " + getAnio() +
                " - Capacidad: " + getCapacidadCargaKg() + "kg" +
                " - Pasajeros: " + cantidadPasajeros;
    }
}


