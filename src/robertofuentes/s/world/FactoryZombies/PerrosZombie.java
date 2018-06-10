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
     private int vida = 10;
    private int cantPerrosZombie = 0;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCantPerrosZombie() {
        return cantPerrosZombie;
    }

    public void setCantPerrosZombie(int cantPerrosZombie) {
        this.cantPerrosZombie = cantPerrosZombie;
    }
    
}