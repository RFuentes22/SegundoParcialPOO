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
public class RobertoFuentesSWorldAbstractFactory {
  
    public static void main(String[] args) {
        AbstractFactory factory;
        //Elfos
        factory=FactoryProducer.getFactory("elfos");
        Elfos Arquero =factory.getElfos("arquero");
        Arquero.ataque();
        
        
        Elfos Mago =factory.getElfos("mago");
        Mago.ataque();
        
        Elfos ReyElfo =factory.getElfos("ReyElfo");
        ReyElfo.ataque();
        
        //Orcos
        factory=FactoryProducer.getFactory("orcos");
        Orcos lanzador =factory.getOrcos("lanzador");
        lanzador.ataque();
        
        Orcos Hechicero =factory.getOrcos("hechicero");
        Hechicero.ataque();
        
        Orcos BestiaMayor =factory.getOrcos("bestiamayor");
        BestiaMayor.ataque();
        /**
         //Zombies
        factory=FactoryProducer.getFactory("Zombies");
        Zombies ZombieMayor =factory.getZombies("ZombieMayor");
        lanzador.ataque();
        
        Orcos Hechicero =factory.getOrcos("hechicero");
        Hechicero.ataque();
        
        Orcos BestiaMayor =factory.getOrcos("bestiamayor");
        BestiaMayor.ataque();
        **/
    }
    
}
