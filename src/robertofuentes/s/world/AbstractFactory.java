/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world;

import robertofuentes.s.world.FactoryElfos.Elfos;
import robertofuentes.s.world.FactoryOrcos.Orcos;
import robertofuentes.s.world.FactoryZombies.Zombies;

/**
 *
 * @author R.Fuentes
 */
public interface AbstractFactory {
    Orcos getOrcos(String type);
    Elfos getElfos(String type);
    Zombies getZombies(String type);
    
}
