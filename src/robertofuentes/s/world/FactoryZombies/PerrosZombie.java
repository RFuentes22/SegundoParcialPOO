/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world.FactoryZombies;

/**
 *
 * @author R.Fuentes
 */
public class PerrosZombie implements Zombies{
  

    @Override
    public void ataque() {
         System.out.println("PerrosZombies atacan");
       }
    
    @Override
    public void defiende() {
         System.out.println("PerrosZombies defienden");
       }
    
}