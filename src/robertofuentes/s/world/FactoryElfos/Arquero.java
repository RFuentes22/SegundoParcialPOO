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
public class Arquero implements Elfos {

    @Override
    public void ataque() {
        System.out.println("Arquero ataca");
    }

    @Override
    public void defiende() {
        System.out.println("Arquero defiende");
    }
    private int vida = 10;
    private int cantArqueros = 0;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCantArqueros() {
        return cantArqueros;
    }

    public void setCantArqueros(int cantArqueros) {
        this.cantArqueros = cantArqueros;
    }

}
