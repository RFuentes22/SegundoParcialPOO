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
public class VehiculoOrcos implements Vehiculo {

    @Override
    public void moverse() {
        System.out.println("Vehiculo de orcos tipo 1");
    }

    public VehiculoOrcos() {
    }
    private int estadoVehiculoOrcosT1=0;
    private int estadoVehiculoOrcosT2=0;

    public int getEstadoVehiculoOrcosT1() {
        return estadoVehiculoOrcosT1;
    }

    public void setEstadoVehiculoOrcosT1(int estadoVehiculoOrcosT1) {
        this.estadoVehiculoOrcosT1 = estadoVehiculoOrcosT1;
    }

    public int getEstadoVehiculoOrcosT2() {
        return estadoVehiculoOrcosT2;
    }

    public void setEstadoVehiculoOrcosT2(int estadoVehiculoOrcosT2) {
        this.estadoVehiculoOrcosT2 = estadoVehiculoOrcosT2;
    }

}
