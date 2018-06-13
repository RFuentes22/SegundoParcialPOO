/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world.Recursos;

import robertofuentes.s.world.AbstractFactory;
import robertofuentes.s.world.Centro_Mando.Cmando;
import robertofuentes.s.world.Edificaciones.Edificaciones;
import robertofuentes.s.world.FactoryElfos.Elfos;
import robertofuentes.s.world.FactoryOrcos.Orcos;
import robertofuentes.s.world.FactoryZombies.Zombies;
import robertofuentes.s.world.vehiculos.Vehiculo;

/**
 *
 * @author R.Fuentes
 */
public class FactoryRecursos implements AbstractFactory {
     @Override
    public Orcos getOrcos(String type) {
        return null;
    }
    @Override
    public Zombies getZombies(String type) {
        return null;
    }
    @Override
    public Elfos getElfos(String type) {
        return null;
    }

    @Override
    public Cmando getCmando(String type) {
        return null;
    }

    @Override
    public Vehiculo getVehiculos(String type) {
        return null;
    }

    @Override
    public Recursos getRecursos(String type) {
       return null;
    }

    @Override
    public Edificaciones getEdificaciones(String type) {
       return null;
    }

    @Override
    public Vehiculo getVehiculo(String string) {
        return null;
    }
   
}
