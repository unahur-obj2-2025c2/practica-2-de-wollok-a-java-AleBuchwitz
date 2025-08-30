package me.gonzager.ex.drones;

public class DronDeSeguridad extends Dron {

    public DronDeSeguridad(Double autonomia, Double nivelDeProcesamiento) {
        super(autonomia, nivelDeProcesamiento);
    }

    @Override
    public boolean esAvanzadoSegunDron() {
        throw new UnsupportedOperationException("Unimplemented method 'esAvanzadoSegunDron'");
    }

}
