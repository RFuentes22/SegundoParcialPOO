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
public class lanzador implements Orcos{
    @Override
    public void ataque() {
        System.out.println("lanzador ataca");
    }
    @Override
    public void defiende() {
        System.out.println("lanzador defiende");
    }
    
}