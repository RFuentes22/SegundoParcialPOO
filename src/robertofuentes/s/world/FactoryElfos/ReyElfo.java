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
public class ReyElfo implements Elfos{
    @Override
    public void ataque() {
        System.out.println("ReyElfo ataca");
    }
    @Override
     public void defiende() {
        System.out.println("ReyElfo defiende");
    }
    
    private int vida = 20;
    private int cantReyElfo = 1;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCantReyElfo() {
        return cantReyElfo;
    }

    public void setCantReyElfo(int cantReyElfo) {
        this.cantReyElfo = cantReyElfo;
    }

}