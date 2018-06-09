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
public class Zombie implements Zombies {
    @Override
    public void ataque() {
         System.out.println("Zombies atacan");
       }
    
    @Override
    public void defiende() {
         System.out.println("Zombies defienden");
       }
     private int vida = 10;
    private int cantZombie = 1;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCantZombie() {
        return cantZombie;
    }

    public void setCantZombie(int cantZombie) {
        this.cantZombie = cantZombie;
    }
    
    
}
