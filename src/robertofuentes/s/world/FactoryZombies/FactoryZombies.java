/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world.FactoryZombies;

import robertofuentes.s.world.FactoryElfos.Elfos;
import robertofuentes.s.world.FactoryOrcos.Orcos;
import robertofuentes.s.world.AbstractFactory;
import robertofuentes.s.world.Centro_Mando.Cmando;
import robertofuentes.s.world.Edificaciones.Edificaciones;
import robertofuentes.s.world.Recursos.Recursos;
import robertofuentes.s.world.vehiculos.Vehiculo;

/**
 *
 * @author R.Fuentes
 */

public class FactoryZombies implements AbstractFactory {

    @Override
    public Elfos getElfos(String type) {
        return null;
    }

    @Override
    public Orcos getOrcos(String type) {
        return null;
    }

    @Override
    public Cmando getCmando(String type) {
        return null;
    }

    @Override
    public Zombies getZombies(String type) {
        switch (type) {
            case "PerrosZombie":
                return new PerrosZombie();
            case "ZombieMayor":
                return new ZombieMayor();
        }
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
