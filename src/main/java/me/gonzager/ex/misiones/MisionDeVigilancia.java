package me.gonzager.ex.misiones;

import java.util.List;

import me.gonzager.ex.drones.Dron;
import me.gonzager.ex.sensores.Sensor;

public class MisionDeVigilancia extends Mision {

    private List<Sensor> sensores;

    @Override
    public boolean esAvanzada(Dron dron) {
        return sensores.stream().allMatch(s -> s.esDuradero());
    }

}
