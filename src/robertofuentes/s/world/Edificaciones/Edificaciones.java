/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world.Edificaciones;

import java.util.Scanner;
import robertofuentes.s.world.Player;

/**
 *
 * @author R.Fuentes
 */

public class Edificaciones {
    EntrenarUnidadesJ1 EntrenarUJ1 = new EntrenarUnidadesJ1();
   
    
    public void ComprarEdificaciones(){
     Player player=new Player();
    System.out.println("¿Que edificacion desea comprar?");
    System.out.println("1- Entrenar Unidades");
    System.out.println("2- Comprar Vehiculos");
    Scanner opcCE=new Scanner(System.in);
    int Opc = opcCE.nextInt();
    
    switch(Opc){
        case 1:
          if(EntrenarUJ1.isEstadoEdifEntrenarJ1()==false){
          System.out.println("Edificacion para entrenar: No ha sido comprada");
              System.out.println("¿Desea comprar la edificacion?. Su valor seria de: 200 de oro y 120 de diamantes.  s/n" );
              Scanner opcCom=new Scanner(System.in);
                String OpcC = opcCom.nextLine();
                // System.out.println(OpcC);
                if ("s".equals(OpcC)){
                 //player.ModEstadoEntrenar();
                 EntrenarUJ1.ModEstadoEntrenar();
                }
                
          }
          else{
        System.out.println("Edificacion para entrenar: Ya ha sido comprada");
          }
        break;
        
    
    }
   
}
}
