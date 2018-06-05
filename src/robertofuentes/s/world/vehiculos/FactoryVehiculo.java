/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world.vehiculos;
import robertofuentes.s.world.AbstractFactory;
import robertofuentes.s.world.FactoryElfos.Elfos;
import robertofuentes.s.world.FactoryOrcos.Orcos;
import robertofuentes.s.world.FactoryZombies.Zombies;
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
    
}
