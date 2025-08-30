package me.gonzager.ex.drones;

public class DronComercial extends Dron {

    public DronComercial(Double autonomia, Double nivelDeProcesamiento) {
        super(autonomia, nivelDeProcesamiento);
    }

    @Override
    public Boolean esAvanzado() {
        return super.esAvanzado();
    }

    @Override
    public boolean esAvanzadoSegunDron() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esAvanzadoSegunDron'");
    }

}
