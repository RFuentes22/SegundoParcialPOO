/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world.FactoryOrcos;

/**
 *
 * @author R.Fuentes
 */
public class BestiaMayor implements Orcos{
   
     @Override
    public void ataque() {
        System.out.println("BestiaMayor ataca");
    }
    @Override
    public void defiende() {
        System.out.println("BestiaMayor defiende");
    }
    
    private int vida = 20;
    public int cantBM = 1;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCantBM() {
        return cantBM;
    }

    public void setCantBM(int cantBM) {
        this.cantBM = cantBM;
    }
    
    
}