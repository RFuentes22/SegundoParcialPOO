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
public class VehiculoZombies implements Vehiculo {

    @Override
    public void moverse() {
        System.out.println("Vehiculo de zombies tipo 1");
    }
    private int estadoVehiculoZombiesT1 = 0;
    private int estadoVehiculoZombiesT2 = 0;

    public int getEstadoVehiculoZombiesT1() {
        return estadoVehiculoZombiesT1;
    }

    public void setEstadoVehiculoZombiesT1(int estadoVehiculoZombiesT1) {
        this.estadoVehiculoZombiesT1 = estadoVehiculoZombiesT1;
    }

    public int getEstadoVehiculoZombiesT2() {
        return estadoVehiculoZombiesT2;
    }

    public void setEstadoVehiculoZombiesT2(int estadoVehiculoZombiesT2) {
        this.estadoVehiculoZombiesT2 = estadoVehiculoZombiesT2;
    }

}
