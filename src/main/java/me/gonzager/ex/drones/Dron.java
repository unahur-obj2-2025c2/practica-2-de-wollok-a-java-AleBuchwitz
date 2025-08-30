package me.gonzager.ex.drones;

import me.gonzager.ex.misiones.Mision;

public abstract class Dron {
    protected  Double autonomia;
    protected Double nivelDeProcesamiento;
    protected Mision mision;

    public Dron(Double autonomia, Double nivelDeProcesamiento) {
        this.autonomia = autonomia;
        this.nivelDeProcesamiento = nivelDeProcesamiento;
    }

    public void setMision(Mision mision){
        this.mision = mision;
    }

    public Boolean esAvanzado(){
        return esAvanzadoSegunDron() || esAvanzadoSegunMision();
    }

    private boolean esAvanzadoSegunMision() {
        return mision.esAvanzada();
    }

    public abstract boolean esAvanzadoSegunDron();
}
