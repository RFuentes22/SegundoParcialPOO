/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world.FactoryElfos;

/**
 *
 * @author R.Fuentes
 */
public class Arquero implements Elfos{
    @Override
    public void ataque() {
        System.out.println("Arquero ataca");
    }
    @Override
     public void defiende() {
        System.out.println("Arquero defiende");
    }
    
}