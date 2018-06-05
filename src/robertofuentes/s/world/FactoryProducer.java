/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world;

import robertofuentes.s.world.FactoryElfos.FactoryElfos;
import robertofuentes.s.world.FactoryOrcos.FactoryOrcos;
import robertofuentes.s.world.FactoryZombies.FactoryZombies;

/**
 *
 * @author R.Fuentes
 */
public class FactoryProducer {
      public static AbstractFactory getFactory(String type) {
      switch (type){
          case "elfos":
              return new FactoryElfos();
          case "orcos":
              return new FactoryOrcos();
          case "zombies":
                  return new FactoryZombies();
      }
      return null;
}}
