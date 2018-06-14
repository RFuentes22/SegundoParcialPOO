/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world.vehiculos;

/**
 *
 * @author R.Fuentes
 */
public class VehiculoElfos implements Vehiculo {

    @Override
    public void moverse() {
        System.out.println("Vehiculo de elfos tipo 1");
    }
    private int estadoVehiculoElfosT1 = 0;
    private int estadoVehiculoElfosT2 = 0;

    public int getEstadoVehiculoElfosT1() {
        return estadoVehiculoElfosT1;
    }

    public void setEstadoVehiculoElfosT1(int estadoVehiculoElfosT1) {
        this.estadoVehiculoElfosT1 = estadoVehiculoElfosT1;
    }

    public int getEstadoVehiculoElfosT2() {
        return estadoVehiculoElfosT2;
    }

    public void setEstadoVehiculoElfosT2(int estadoVehiculoElfosT2) {
        this.estadoVehiculoElfosT2 = estadoVehiculoElfosT2;
    }

}
