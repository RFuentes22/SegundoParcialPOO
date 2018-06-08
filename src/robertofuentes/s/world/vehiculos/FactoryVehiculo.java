/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world.vehiculos;
import robertofuentes.s.world.AbstractFactory;
import robertofuentes.s.world.Centro_Mando.Cmando;
import robertofuentes.s.world.FactoryElfos.Elfos;
import robertofuentes.s.world.FactoryOrcos.Orcos;
import robertofuentes.s.world.FactoryZombies.Zombies;
import robertofuentes.s.world.Recursos.Recursos;
/**
 *
 * @author R.Fuentes
 */
public class FactoryVehiculo implements AbstractFactory {

    @Override
    public Orcos getOrcos(String type) {
        return null;
    }

    @Override
    public Elfos getElfos(String type) {
       return null;
        }

    @Override
    public Zombies getZombies(String type) {
    return null;    
    }
    
    @Override
    public Cmando getCmando(String type) {
        return null;
    }
     @Override
    public Vehiculo getVehiculos(String type) {
        switch (type) {
            case "Vehiculo de elfos tipo 1":
                return new VehiculoElfosT1();
            case "Vehiculo de elfos tipo 2":
                return new VehiculoElfosT2();
            case "Vehiculo de orcos tipo 1":
                return new VehiculoOrcosT1();
            case "Vehiculo de orcos tipo 2":
                return new VehiculoOrcosT2();
            case "Vehiculo de zombies tipo 1":
                return new VehiculoZombiesT1();
            case "Vehiculo de zombies tipo 2":
                return new VehiculoZombiesT2();
                   
            
        }
        return null;
    }

    @Override
    public Recursos getRecursos(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
