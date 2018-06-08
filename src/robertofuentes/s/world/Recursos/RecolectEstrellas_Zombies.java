/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world.Recursos;

/**
 *
 * @author R.Fuentes
 */
public class RecolectEstrellas_Zombies implements Recursos{
        @Override
    public void Recolectar() {
          System.out.println("RecolectEstrellas_Zombies recolecta");
    }

    @Override
    public void Generar() {
       System.out.println("RecolectEstrellas_Zombies genera");
    }
}
