/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world.FactoryOrcos;
import robertofuentes.s.world.FactoryElfos.Elfos;
import robertofuentes.s.world.FactoryZombies.Zombies;
import robertofuentes.s.world.AbstractFactory;


/**
 *
 * @author R.Fuentes
 */

public class  FactoryOrcos implements AbstractFactory{
    @Override
    public Elfos getElfos(String type) {
        return null;
    }
 @Override
    public Zombies getZombies(String type) {
        return null;
    }

    @Override
    public Orcos getOrcos(String type) {
        switch (type) {
            case "lanzador":
                return new lanzador();
            case "hechicero":
                return new Hechicero();
            case "bestiamayor":
                return new BestiaMayor();
        }
        return null;
    }
}