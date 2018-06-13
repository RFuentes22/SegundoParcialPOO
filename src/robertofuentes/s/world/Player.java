/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world;

import java.util.Scanner;
import robertofuentes.s.world.Centro_Mando.Cmando_Elfos;
import robertofuentes.s.world.Centro_Mando.Cmando_Orcos;
import robertofuentes.s.world.Centro_Mando.Cmando_Zombies;
import robertofuentes.s.world.Edificaciones.CompEdificaciones;
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
//Instancias    
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
    //Edificaciones
    CompEdificaciones EntrenarU = new CompEdificaciones();
    //Abstract
    AbstractFactory factory;

    private String Nombre1 = null, Nombre2 = null;
    private int RazaJ1 = 0, RazaJ2 = 0;

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

    //Informacion Razas
    public void InformacionRazasJ1() {

        switch (RazaJ1) {
            case 1:
                System.out.println("Vida Centro de Mando: " + infoCmando_Orcos.getVidaCmando_Orcos()
                        + "\nOro: " + infoCmando_Orcos.getOroOrcos() + "  Diamantes: " + infoCmando_Orcos.getDiamantesOrcos() + "  Estrellas: " + infoCmando_Orcos.getEstrellasOrcos()
                        + "\nVida Bestia Mayor: " + infoBM.getVida() + "  Cantidad Bestia Mayor: " + infoBM.getCantBM()
                        + "\nVida Hechicero: " + infoHech.getVida() * infoHech.getCantHechicero() + "  Cantidad Hechicero: " + infoHech.getCantHechicero()
                        + "\nVida Lanzador: " + infoLanz.getVida() * infoLanz.getCantLanzador() + "  Cantidad Lanzador: " + infoLanz.getCantLanzador());

                break;
            case 2:

                System.out.println("Vida Centro de Mando: " + infoCmando_Elfos.getVidaCmando_Elfos()
                        + "\nOro: " + infoCmando_Elfos.getOroElfos() + "  Diamantes: " + infoCmando_Elfos.getDiamantesElfos() + "  Estrellas: " + infoCmando_Elfos.getEstrellasElfos()
                        + "\nVida Rey Elfo: " + infoElf.getVida() + "  Cantidad Rey Elfo: " + infoElf.getCantReyElfo()
                        + "\nVida Arqueros: " + infoAr.getVida() * infoAr.getCantArqueros() + "  Cantidad Arqueros: " + infoAr.getCantArqueros()
                        + "\nVida Magos: " + infoMag.getVida() * infoMag.getCantMagos() + "  Cantidad Magos: " + infoMag.getCantMagos()
                );

                break;
            case 3:
                System.out.println("Vida Centro de Mando: " + infoCmando_Zombies.getVidaCmando_Zombies()
                        + "\nOro: " + infoCmando_Zombies.getOroZombies() + "  Diamantes: " + infoCmando_Zombies.getDiamantesZombies() + "  Estrellas: " + infoCmando_Zombies.getEstrellasZombies()
                        + "\nVida Zombie Mayor: " + infoZM.getVida() + "  Cantidad Zombie Mayor: " + infoZM.getCantZM()
                        + "\nVida Perros Zombie: " + infoPZ.getVida() * infoPZ.getCantPerrosZombie() + "  Cantidad Perros Zombie: " + infoPZ.getCantPerrosZombie()
                        + "\nVida Zombie: " + infoZ.getVida() * infoZ.getCantZombie() + "  Cantidad zombie: " + infoZ.getCantZombie());

                break;

        }
    }

    public void InformacionRazasJ2() {

        switch (RazaJ2) {
            case 1:
                System.out.println("Vida Centro de Mando: " + infoCmando_Orcos.getVidaCmando_Orcos()
                        + "\nOro: " + infoCmando_Orcos.getOroOrcos() + "  Diamantes: " + infoCmando_Orcos.getDiamantesOrcos() + "  Estrellas: " + infoCmando_Orcos.getEstrellasOrcos()
                        + "\nVida Bestia Mayor: " + infoBM.getVida() + "  Cantidad Bestia Mayor: " + infoBM.getCantBM()
                        + "\nVida Hechicero: " + infoHech.getVida() * infoHech.getCantHechicero() + "  Cantidad Hechicero: " + infoHech.getCantHechicero()
                        + "\nVida Lanzador: " + infoLanz.getVida() * infoLanz.getCantLanzador() + "  Cantidad Lanzador: " + infoLanz.getCantLanzador());

                break;
            case 2:

                System.out.println("Vida Centro de Mando: " + infoCmando_Elfos.getVidaCmando_Elfos()
                        + "\nOro: " + infoCmando_Elfos.getOroElfos() + "  Diamantes: " + infoCmando_Elfos.getDiamantesElfos() + "  Estrellas: " + infoCmando_Elfos.getEstrellasElfos()
                        + "\nVida Rey Elfo: " + infoElf.getVida() + "  Cantidad Rey Elfo: " + infoElf.getCantReyElfo()
                        + "\nVida Arqueros: " + infoAr.getVida() * infoAr.getCantArqueros() + "  Cantidad Arqueros: " + infoAr.getCantArqueros()
                        + "\nVida Magos: " + infoMag.getVida() * infoMag.getCantMagos() + "  Cantidad Magos: " + infoMag.getCantMagos()
                );

                break;
            case 3:
                System.out.println("Vida Centro de Mando: " + infoCmando_Zombies.getVidaCmando_Zombies()
                        + "\nOro: " + infoCmando_Zombies.getOroZombies() + "  Diamantes: " + infoCmando_Zombies.getDiamantesZombies() + "  Estrellas: " + infoCmando_Zombies.getEstrellasZombies()
                        + "\nVida Zombie Mayor: " + infoZM.getVida() + "  Cantidad Zombie Mayor: " + infoZM.getCantZM()
                        + "\nVida Perros Zombie: " + infoPZ.getVida() * infoPZ.getCantPerrosZombie() + "  Cantidad Perros Zombie: " + infoPZ.getCantPerrosZombie()
                        + "\nVida Zombie: " + infoZ.getVida() * infoZ.getCantZombie() + "  Cantidad zombie: " + infoZ.getCantZombie());

                break;

        }
    }

    //Opciones Jugadores
    public void opcionesJ1() {

        while (true) {

            System.out.println("\n¿Que desea hacer? " + Nombre1 + "\n");
            InformacionRazasJ1();

            System.out.println("1- Atacar a " + Nombre2);
            System.out.println("2- Entrenar Unidades ");
            System.out.println("3- Comprar edificaciones ");
            System.out.println("4- Comprar vehiculos");
            System.out.println("5- Mejorar capacidad de Almacenamiento");
            System.out.println("6- Terminar turno");
            System.out.print("Introduzca: ");
            Scanner leerOpc = new Scanner(System.in);

            int Opc = leerOpc.nextInt();
            switch (Opc) {
                case 1:
                    //AtacarToJ2();
                    break;
                case 2:

                    if (EntrenarU.getEstadoEdifEntrenarJ1() == 1) {
                        //EntrenarUJ1.CompEdificaciones(RazaJ1);
                        EntrenarUnidadesJ1();
                    } else {
                        System.out.println("\nLa edificacion Entrenar no ha sido adquirida");
                    }

                    break;
                case 3:
                    EntrenarU.ComprarEdificacionesJ1(RazaJ1);
                    break;
                case 4:

                    if (EntrenarU.getEstadoEdifVehiculosJ1() == 1) {
                      
                        System.out.println("comprado");
                      
                    } else {
                        System.out.println("\nLa edificacion para comprar Vehiculos no ha sido adquirida");
                    }

                    break;
                case 5:
                    //MejorarCapcidadJ1();
                    break;
                case 6:
                    opcionesJ2();
                    break;
                default:
                    System.out.println("\nIntroduzca opcion valida \n");
                    opcionesJ1();
                    break;
            }
        }
    }

    public void opcionesJ2() {
        while (true) {
            System.out.println("\n¿Que desea hacer? " + Nombre2);
            InformacionRazasJ2();
            System.out.println("1- Atacar a " + Nombre1);
            System.out.println("2- Entrenar Unidades ");
            System.out.println("3- Comprar edificaciones ");
            System.out.println("4- Comprar vehiculos");
            System.out.println("5- Mejorar capacidad de Almacenamiento");
            System.out.println("6- Terminar turno");
            System.out.print("Introduzca: ");
            Scanner leerOpc = new Scanner(System.in);

            int Opc = leerOpc.nextInt();
            switch (Opc) {
                case 1:
                    //AtacarToJ1();
                    break;
                case 2:
                    if (EntrenarU.getEstadoEdifEntrenarJ2() == 1) {
                        //EntrenarUJ1.CompEdificaciones();
                        EntrenarUnidadesJ2();
                    } else {
                        System.out.println("\nLa edificacion Entrenar no ha sido adquirida");
                    }
                    break;
                case 3:
                    EntrenarU.ComprarEdificacionesJ2(RazaJ2);
                    break;
                case 4:
                      if (EntrenarU.getEstadoEdifVehiculosJ2() == 1) {
                      
                        System.out.println("comprado");
                      
                    } else {
                        System.out.println("\nLa edificacion para comprar Vehiculos no ha sido adquirida");
                    }
                    break;
                case 5:
                    //MejorarCapcidadJ2();
                    break;
                case 6:
                    opcionesJ1();
                    break;
                default:
                    System.out.println("\nIntroduzca opcion valida \n");
                    opcionesJ2();
                    break;
            }
        }
    }

    //Entrenar Unidades
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

    public void EntrenarUnidadesJ2() {

        System.out.println("¿Cuantas unidades entrenar? ");
        Scanner unid2 = new Scanner(System.in);
        int uni2 = unid2.nextInt();
        switch (RazaJ2) {
            case 1:

                int cantHech = infoHech.getCantHechicero();
                int cantLanz = infoLanz.getCantLanzador();

                infoHech.setCantHechicero(cantHech += uni2);
                infoLanz.setCantLanzador(cantLanz += uni2);

                break;
            case 2:
                int cantAr = infoAr.getCantArqueros();
                int cantMag = infoMag.getCantMagos();

                infoAr.setCantArqueros(cantAr += uni2);
                infoMag.setCantMagos(cantMag += uni2);
                break;
            case 3:
                int cantZ = infoZ.getCantZombie();
                int cantPZ = infoPZ.getCantPerrosZombie();

                infoZ.setCantZombie(cantZ += uni2);
                infoPZ.setCantPerrosZombie(cantPZ += uni2);
                break;

        }
    }

}
