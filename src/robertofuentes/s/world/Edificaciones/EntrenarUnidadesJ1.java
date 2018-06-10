/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world.Edificaciones;

import java.util.Scanner;
import robertofuentes.s.world.Centro_Mando.Cmando_Elfos;
import robertofuentes.s.world.Centro_Mando.Cmando_Orcos;
import robertofuentes.s.world.Centro_Mando.Cmando_Zombies;
import robertofuentes.s.world.FactoryElfos.Arquero;
import robertofuentes.s.world.FactoryElfos.Mago;
import robertofuentes.s.world.FactoryElfos.ReyElfo;
import robertofuentes.s.world.FactoryOrcos.BestiaMayor;
import robertofuentes.s.world.FactoryOrcos.Hechicero;
import robertofuentes.s.world.FactoryOrcos.Lanzador;
import robertofuentes.s.world.FactoryZombies.PerrosZombie;
import robertofuentes.s.world.FactoryZombies.Zombie;
import robertofuentes.s.world.FactoryZombies.ZombieMayor;
import robertofuentes.s.world.Player;

/**
 *
 * @author R.Fuentes
 */
public class EntrenarUnidadesJ1 {

    private boolean estadoEdifEntrenarJ1 = false;
    private int RazaJ1,RazaJ2;
 //Orcos

    Cmando_Orcos infoCmando_Orcos = new Cmando_Orcos();
    BestiaMayor infoBM = new BestiaMayor();
    Hechicero infoHech = new Hechicero();
    Lanzador infoLanz = new Lanzador();
    //Elfos
    Cmando_Elfos infoCmando_Elfos = new Cmando_Elfos();
    Arquero infoAr = new Arquero();
    Mago infoMag = new Mago();
    ReyElfo infoElf = new ReyElfo();
    //Zombies
    Cmando_Zombies infoCmando_Zombies = new Cmando_Zombies();
    ZombieMayor infoZM = new ZombieMayor();
    PerrosZombie infoPZ = new PerrosZombie();
    Zombie infoZ = new Zombie();
  
    public int getRazaJ1() {
        return RazaJ1;
    }

    public void setRazaJ1(int RazaJ1) {
        this.RazaJ1 = RazaJ1;
    }

    public int getRazaJ2() {
        return RazaJ2;
    }

    public void setRazaJ2(int RazaJ2) {
        this.RazaJ2 = RazaJ2;
    }
    
    public boolean isEstadoEdifEntrenarJ1() {
        return estadoEdifEntrenarJ1;
    }

    public void setEstadoEdifEntrenarJ1(boolean estadoEdifEntrenarJ1) {
        this.estadoEdifEntrenarJ1 = estadoEdifEntrenarJ1;
    }

    public void EntrenarUnidadesJ1() {

        System.out.println("¿Cuantas unidades entrenar? ");
        Scanner unid = new Scanner(System.in);
        int uni = unid.nextInt();
        switch (RazaJ1) {
            case 1:

                int cantHech = infoHech.getCantHechicero();
                int cantLanz = infoLanz.getCantLanzador();

                infoHech.setCantHechicero(cantHech += uni);
                infoLanz.setCantLanzador(cantLanz += uni);

                break;
            case 2:
                int cantAr = infoAr.getCantArqueros();
                int cantMag = infoMag.getCantMagos();

                infoAr.setCantArqueros(cantAr += uni);
                infoMag.setCantMagos(cantMag += uni);
                break;
            case 3:
                int cantZ = infoZ.getCantZombie();
                int cantPZ = infoPZ.getCantPerrosZombie();

                infoZ.setCantZombie(cantZ += uni);
                infoPZ.setCantPerrosZombie(cantPZ += uni);
                break;

        }
    }
    
    
    public void ModEstadoEntrenar(){
        Player players=new Player();
        //player.MostrarRazaJ1();
        //System.out.println("hello");
        System.out.println(getRazaJ1());
     /**switch(RazaJ1){
         case 1:
             if(infoCmando_Orcos.getOroOrcos()>=200 && infoCmando_Orcos.getDiamantesOrcos()>=120){
                 estadoEdifEntrenarJ1=true;
                 System.out.println("Su compra ha sido satisfactoria");
             }
             else{
                 System.out.println("No se ha podido completar su compra");
             }
             
     
     }**/
     
    
    }
}