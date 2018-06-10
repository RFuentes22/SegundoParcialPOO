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
public class Lanzador implements Orcos{
 
     @Override
    public void ataque() {
        System.out.println("Lanzador ataca");
    }
    @Override 
    public void defiende() {
        System.out.println("Lanzador defiende");
    }
    
    private int vida = 10;
    private int cantLanzador = 0;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCantLanzador() {
        return cantLanzador;
    }

    public void setCantLanzador(int cantLanzador) {
        this.cantLanzador = cantLanzador;
    }
    
}


