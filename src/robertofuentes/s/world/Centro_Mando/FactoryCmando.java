/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world.Centro_Mando;

import robertofuentes.s.world.AbstractFactory;
import robertofuentes.s.world.Edificaciones.Edificaciones;
import robertofuentes.s.world.FactoryElfos.Elfos;
import robertofuentes.s.world.FactoryOrcos.Orcos;
import robertofuentes.s.world.FactoryZombies.Zombies;
import robertofuentes.s.world.Recursos.Recursos;
import robertofuentes.s.world.vehiculos.Vehiculo;

/**
 *
 * @author R.Fuentes
 */
public class FactoryCmando implements AbstractFactory {
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
        switch (type) {
            case "Centro de mando elfos":
                return new Cmando_Elfos();
            case "Centro de mando orcos":
                return new Cmando_Orcos();
            case "Centro de mando zombies":
                return new Cmando_Zombies();
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
