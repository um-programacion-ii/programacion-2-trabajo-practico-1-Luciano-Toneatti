package app;

public class Camion extends Vehiculo {
    private boolean tieneAcoplado;

    public Camion(String patente, String marca, int anio, double capacidadCargaKg, boolean tieneAcoplado) {
        super(patente, marca, anio, capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    @Override
    public String obtenerInformacion() {
        return getMarca() + " - " + getPatente() +
                " - " + getAnio() +
                " - Capacidad: " + getCapacidadCargaKg() + "kg" +
                " - Tiene acoplado: " + (tieneAcoplado ? "Sí" : "No");
    }
}

