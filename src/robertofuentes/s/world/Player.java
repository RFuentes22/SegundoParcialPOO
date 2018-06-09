/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world;

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

/**
 *
 * @author R.Fuentes
 */
public class Player {
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
    private String Nombre1, Nombre2;
    private int RazaJ1, RazaJ2;

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

    public String getNombre1() {
        return Nombre1;
    }

    public void setNombre1(String Nombre1) {
        this.Nombre1 = Nombre1;
    }

    public String getNombre2() {
        return Nombre2;
    }

    public void setNombre2(String Nombre2) {
        this.Nombre2 = Nombre2;
    }

    //Mostrar
    public void MostrarNombre1() {
        System.out.println(Nombre1);

    }

    public void MostrarNombre2() {
        System.out.println(Nombre2);
    }

    public void MostrarRazaJ1() {
        System.out.println(RazaJ1);
    }

    public void MostrarRazaJ2() {
        System.out.println(RazaJ1);
    }

    
    public void InformacionRazasJ1() {

        
        switch (RazaJ1) {
            case 1:
                System.out.println("Vida Centro de Mando: " + infoCmando_Orcos.getVidaCmando_Orcos()
                        + "\nOro: " + infoCmando_Orcos.getOroOrcos() + "  Diamantes: " + infoCmando_Orcos.getDiamantesOrcos() + "  Estrellas: " + infoCmando_Orcos.getEstrellasOrcos()
                        + "\nVida Bestia Mayor: " + infoBM.getVida() + "  Cantidad Bestia Mayor: " + infoBM.getCantBM()
                        + "\nVida Hechicero: " + infoHech.getVida() + "  Cantidad Hechicero: " + infoHech.getCantHechicero()
                        + "\nVida Lanzador: " + infoLanz.getVida() + "  Cantidad Lanzador: " + infoLanz.getCantLanzador());

                break;
            case 2:

                System.out.println("Vida Centro de Mando: " + infoCmando_Elfos.getVidaCmando_Elfos()
                        + "\nOro: " + infoCmando_Elfos.getOroElfos() + "  Diamantes: " + infoCmando_Elfos.getDiamantesElfos() + "  Estrellas: " + infoCmando_Elfos.getEstrellasElfos()
                        + "\nVida Arqueros: " + infoAr.getVida() + "  Cantidad Arqueros: " + infoAr.getCantArqueros()
                        + "\nVida Magos: " + infoMag.getVida() + "  Cantidad Magos: " + infoMag.getCantMagos()
                        + "\nVida Rey Elfo: " + infoElf.getVida() + "  Cantidad Rey Elfo: " + infoElf.getCantReyElfo());

                break;
            case 3:
                System.out.println("Vida Centro de Mando: " + infoCmando_Zombies.getVidaCmando_Zombies()
                        + "\nOro: " + infoCmando_Zombies.getOroZombies() + "  Diamantes: " + infoCmando_Zombies.getDiamantesZombies() + "  Estrellas: " + infoCmando_Zombies.getEstrellasZombies()
                        + "\nVida Zombie Mayor: " + infoZM.getVida() + "  Cantidad Zombie Mayor: " + infoZM.getCantZM()
                        + "\nVida Perros Zombie: " + infoPZ.getVida() + "  Cantidad Perros Zombie: " + infoPZ.getCantPerrosZombie()
                        + "\nVida Zombie: " + infoZ.getVida() + "  Cantidad zombie: " + infoZ.getCantZombie());

                break;

        }}
       public void InformacionRazasJ2() {

        
        switch (RazaJ2) {
            case 1:
                System.out.println("Vida Centro de Mando: " + infoCmando_Orcos.getVidaCmando_Orcos()
                        + "\nOro: " + infoCmando_Orcos.getOroOrcos() + "  Diamantes: " + infoCmando_Orcos.getDiamantesOrcos() + "  Estrellas: " + infoCmando_Orcos.getEstrellasOrcos()
                        + "\nVida Bestia Mayor: " + infoBM.getVida() + "  Cantidad Bestia Mayor: " + infoBM.getCantBM()
                        + "\nVida Hechicero: " + infoHech.getVida() + "  Cantidad Hechicero: " + infoHech.getCantHechicero()
                        + "\nVida Lanzador: " + infoLanz.getVida() + "  Cantidad Lanzador: " + infoLanz.getCantLanzador());

                break;
            case 2:

                System.out.println("Vida Centro de Mando: " + infoCmando_Elfos.getVidaCmando_Elfos()
                        + "\nOro: " + infoCmando_Elfos.getOroElfos() + "  Diamantes: " + infoCmando_Elfos.getDiamantesElfos() + "  Estrellas: " + infoCmando_Elfos.getEstrellasElfos()
                        + "\nVida Arqueros: " + infoAr.getVida() + "  Cantidad Arqueros: " + infoAr.getCantArqueros()
                        + "\nVida Magos: " + infoMag.getVida() + "  Cantidad Magos: " + infoMag.getCantMagos()
                        + "\nVida Rey Elfo: " + infoElf.getVida() + "  Cantidad Rey Elfo: " + infoElf.getCantReyElfo());

                break;
            case 3:
                System.out.println("Vida Centro de Mando: " + infoCmando_Zombies.getVidaCmando_Zombies()
                        + "\nOro: " + infoCmando_Zombies.getOroZombies() + "  Diamantes: " + infoCmando_Zombies.getDiamantesZombies() + "  Estrellas: " + infoCmando_Zombies.getEstrellasZombies()
                        + "\nVida Zombie Mayor: " + infoZM.getVida() + "  Cantidad Zombie Mayor: " + infoZM.getCantZM()
                        + "\nVida Perros Zombie: " + infoPZ.getVida() + "  Cantidad Perros Zombie: " + infoPZ.getCantPerrosZombie()
                        + "\nVida Zombie: " + infoZ.getVida() + "  Cantidad zombie: " + infoZ.getCantZombie());

                break;

        }
    }
    
    
    
}
