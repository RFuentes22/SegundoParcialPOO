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
public class ZombieMayor implements Zombies{
    @Override
    public void ataque() {
        System.out.println("ZombieMayor ataca");
    }
    
    @Override
    public void defiende() {
         System.out.println("ZombieMayor defiende");
       }
     private int vida = 20;
    private int cantZM = 1;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCantZM() {
        return cantZM;
    }

    public void setCantZM(int cantZM) {
        this.cantZM = cantZM;
    }
    
    
}