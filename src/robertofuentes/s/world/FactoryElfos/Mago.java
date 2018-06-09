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
public class Mago implements Elfos{
    @Override
    public void ataque() {
        System.out.println("Mago ataca");
    }
    @Override
     public void defiende() {
        System.out.println("mago defiende");
    }
    private int vida = 10;
    private int cantMagos = 1;

    public int getCantMagos() {
        return cantMagos;
    }

    public void setCantMagos(int cantMagos) {
        this.cantMagos = cantMagos;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    
    
}