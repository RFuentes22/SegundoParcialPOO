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
import robertofuentes.s.world.vehiculos.VehiculoElfos;
import robertofuentes.s.world.vehiculos.VehiculoOrcos;
import robertofuentes.s.world.vehiculos.VehiculoZombies;

/**
 *
 * @author R.Fuentes
 */
public class Logic implements Edificaciones {

    public Logic() {
    }

    private int estadoEdifEntrenarJ1 = 0;
    private int estadoEdifEntrenarJ2 = 0;
    private int estadoEdifVehiculosJ1 = 0;
    private int estadoEdifVehiculosJ2 = 0;
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
    //Vehiculos
    VehiculoOrcos VehiculoOrc = new VehiculoOrcos();
    VehiculoZombies Vehiculozom = new VehiculoZombies();
    VehiculoElfos VehiculoElf = new VehiculoElfos();

//Setter and getter
    public int getEstadoEdifVehiculosJ2() {
        return estadoEdifVehiculosJ2;
    }

    public void setEstadoEdifVehiculosJ2(int estadoEdifVehiculosJ2) {
        this.estadoEdifVehiculosJ2 = estadoEdifVehiculosJ2;
    }

    public int getEstadoEdifVehiculosJ1() {
        return estadoEdifVehiculosJ1;
    }

    public void setEstadoEdifVehiculosJ1(int estadoEdifVehiculosJ1) {
        this.estadoEdifVehiculosJ1 = estadoEdifVehiculosJ1;
    }

    public int getEstadoEdifEntrenarJ1() {
        return estadoEdifEntrenarJ1;
    }

    public void setEstadoEdifEntrenarJ1(int estadoEdifEntrenarJ1) {
        this.estadoEdifEntrenarJ1 = estadoEdifEntrenarJ1;
    }

    public int getEstadoEdifEntrenarJ2() {
        return estadoEdifEntrenarJ2;
    }

    public void setEstadoEdifEntrenarJ2(int estadoEdifEntrenarJ2) {
        this.estadoEdifEntrenarJ2 = estadoEdifEntrenarJ2;
    }

    @Override
    public void Edificar() {
        System.out.println("");
    }

    //Metodos
    //Informacion Razas
    public void InformacionRazasJ1(int RazaJ1) {

        switch (RazaJ1) {
            case 1:
                System.out.println("\nVida Centro de Mando: " + infoCmando_Orcos.getVidaCmando_Orcos());
                System.out.println("Nivel de Centro de Mando: " + infoCmando_Orcos.getMejoraOrcos());
                System.out.println("Limite de oro: " + infoCmando_Orcos.getLimiteOro() + " Limite de diamantes: " + infoCmando_Orcos.getLimiteDiamantes() + "  Limite de estrellas: " + infoCmando_Orcos.getLimiteEstrellas());
                System.out.println("Oro: " + infoCmando_Orcos.getOroOrcos() + "  Diamantes: " + infoCmando_Orcos.getDiamantesOrcos() + "  Estrellas: " + infoCmando_Orcos.getEstrellasOrcos()
                        + "\nVida Bestia Mayor: " + infoBM.getVida() + "  Cantidad Bestia Mayor: " + infoBM.getCantBM()
                        + "\nVida Hechicero: " + infoHech.getVida() * infoHech.getCantHechicero() + "  Cantidad Hechicero: " + infoHech.getCantHechicero()
                        + "\nVida Lanzador: " + infoLanz.getVida() * infoLanz.getCantLanzador() + "  Cantidad Lanzador: " + infoLanz.getCantLanzador());
                System.out.println("Carros mounstro: " + VehiculoOrc.getEstadoVehiculoOrcosT1() + "  Camionetas: " + VehiculoOrc.getEstadoVehiculoOrcosT2());
                break;
            case 2:

                System.out.println("\nVida Centro de Mando: " + infoCmando_Elfos.getVidaCmando_Elfos());
                System.out.println("Nivel de Centro de Mando: " + infoCmando_Elfos.getMejoraElfos());
                System.out.println("Limite de oro: " + infoCmando_Elfos.getLimiteOro() + " Limite de diamantes: " + infoCmando_Elfos.getLimiteDiamantes() + "  Limite de estrellas: " + infoCmando_Elfos.getLimiteEstrellas());
                System.out.println("Oro: " + infoCmando_Elfos.getOroElfos() + "  Diamantes: " + infoCmando_Elfos.getDiamantesElfos() + "  Estrellas: " + infoCmando_Elfos.getEstrellasElfos()
                        + "\nVida Rey Elfo: " + infoElf.getVida() + "  Cantidad Rey Elfo: " + infoElf.getCantReyElfo()
                        + "\nVida Arqueros: " + infoAr.getVida() * infoAr.getCantArqueros() + "  Cantidad Arqueros: " + infoAr.getCantArqueros()
                        + "\nVida Magos: " + infoMag.getVida() * infoMag.getCantMagos() + "  Cantidad Magos: " + infoMag.getCantMagos()
                );
                System.out.println("Carros mounstro: " + VehiculoElf.getEstadoVehiculoElfosT1() + "  Camionetas: " + VehiculoElf.getEstadoVehiculoElfosT2());
                break;
            case 3:
                System.out.println("\nVida Centro de Mando: " + infoCmando_Zombies.getVidaCmando_Zombies());
                System.out.println("Nivel de Centro de Mando: " + infoCmando_Zombies.getMejoraZombies());
                System.out.println("Limite de oro: " + infoCmando_Zombies.getLimiteOro() + " Limite de diamantes: " + infoCmando_Zombies.getLimiteDiamantes() + "  Limite de estrellas: " + infoCmando_Zombies.getLimiteEstrellas());
                System.out.println("Oro: " + infoCmando_Zombies.getOroZombies() + "  Diamantes: " + infoCmando_Zombies.getDiamantesZombies() + "  Estrellas: " + infoCmando_Zombies.getEstrellasZombies()
                        + "\nVida Zombie Mayor: " + infoZM.getVida() + "  Cantidad Zombie Mayor: " + infoZM.getCantZM()
                        + "\nVida Perros Zombie: " + infoPZ.getVida() * infoPZ.getCantPerrosZombie() + "  Cantidad Perros Zombie: " + infoPZ.getCantPerrosZombie()
                        + "\nVida Zombie: " + infoZ.getVida() * infoZ.getCantZombie() + "  Cantidad zombie: " + infoZ.getCantZombie());
                System.out.println("Carros mounstro: " + Vehiculozom.getEstadoVehiculoZombiesT1() + "  Camionetas: " + Vehiculozom.getEstadoVehiculoZombiesT2());
                break;

        }
    }

    public void InformacionRazasJ2(int RazaJ2) {

        switch (RazaJ2) {
            case 1:
                System.out.println("\nVida Centro de Mando: " + infoCmando_Orcos.getVidaCmando_Orcos());
                System.out.println("Nivel de Centro de Mando: " + infoCmando_Orcos.getMejoraOrcos());
                System.out.println("Limite de oro: " + infoCmando_Orcos.getLimiteOro() + " Limite de diamantes: " + infoCmando_Orcos.getLimiteDiamantes() + "  Limite de estrellas: " + infoCmando_Orcos.getLimiteEstrellas());
                System.out.println("Oro: " + infoCmando_Orcos.getOroOrcos() + "  Diamantes: " + infoCmando_Orcos.getDiamantesOrcos() + "  Estrellas: " + infoCmando_Orcos.getEstrellasOrcos()
                        + "\nVida Bestia Mayor: " + infoBM.getVida() + "  Cantidad Bestia Mayor: " + infoBM.getCantBM()
                        + "\nVida Hechicero: " + infoHech.getVida() * infoHech.getCantHechicero() + "  Cantidad Hechicero: " + infoHech.getCantHechicero()
                        + "\nVida Lanzador: " + infoLanz.getVida() * infoLanz.getCantLanzador() + "  Cantidad Lanzador: " + infoLanz.getCantLanzador());
                System.out.println("Carros mounstro: " + VehiculoOrc.getEstadoVehiculoOrcosT1() + "  Camionetas: " + VehiculoOrc.getEstadoVehiculoOrcosT2());
                break;
            case 2:
                System.out.println("\nVida Centro de Mando: " + infoCmando_Elfos.getVidaCmando_Elfos());
                System.out.println("Nivel de Centro de Mando: " + infoCmando_Elfos.getMejoraElfos());
                System.out.println("Limite de oro: " + infoCmando_Elfos.getLimiteOro() + " Limite de diamantes: " + infoCmando_Elfos.getLimiteDiamantes() + "  Limite de estrellas: " + infoCmando_Elfos.getLimiteEstrellas());
                System.out.println("Oro: " + infoCmando_Elfos.getOroElfos() + "  Diamantes: " + infoCmando_Elfos.getDiamantesElfos() + "  Estrellas: " + infoCmando_Elfos.getEstrellasElfos()
                        + "\nVida Rey Elfo: " + infoElf.getVida() + "  Cantidad Rey Elfo: " + infoElf.getCantReyElfo()
                        + "\nVida Arqueros: " + infoAr.getVida() * infoAr.getCantArqueros() + "  Cantidad Arqueros: " + infoAr.getCantArqueros()
                        + "\nVida Magos: " + infoMag.getVida() * infoMag.getCantMagos() + "  Cantidad Magos: " + infoMag.getCantMagos()
                );
                System.out.println("Carros mounstro: " + VehiculoElf.getEstadoVehiculoElfosT1() + "  Camionetas: " + VehiculoElf.getEstadoVehiculoElfosT2());
                break;
            case 3:
                System.out.println("\nVida Centro de Mando: " + infoCmando_Zombies.getVidaCmando_Zombies());
                System.out.println("Nivel de Centro de Mando: " + infoCmando_Zombies.getMejoraZombies());
                System.out.println("Limite de oro: " + infoCmando_Zombies.getLimiteOro() + " Limite de diamantes: " + infoCmando_Zombies.getLimiteDiamantes() + "  Limite de estrellas: " + infoCmando_Zombies.getLimiteEstrellas());
                System.out.println("Oro: " + infoCmando_Zombies.getOroZombies() + "  Diamantes: " + infoCmando_Zombies.getDiamantesZombies() + "  Estrellas: " + infoCmando_Zombies.getEstrellasZombies()
                        + "\nVida Zombie Mayor: " + infoZM.getVida() + "  Cantidad Zombie Mayor: " + infoZM.getCantZM()
                        + "\nVida Perros Zombie: " + infoPZ.getVida() * infoPZ.getCantPerrosZombie() + "  Cantidad Perros Zombie: " + infoPZ.getCantPerrosZombie()
                        + "\nVida Zombie: " + infoZ.getVida() * infoZ.getCantZombie() + "  Cantidad zombie: " + infoZ.getCantZombie());
                System.out.println("Carros mounstro: " + Vehiculozom.getEstadoVehiculoZombiesT1() + "  Camionetas: " + Vehiculozom.getEstadoVehiculoZombiesT2());
                break;

        }
    }

    //Entrenamiento
    public void EntrenarUnidadesJ1(int RazaJ1) {

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

    public void EntrenarUnidadesJ2(int RazaJ2) {

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

    //Edif entrenamiento
    public void ModEstadoEntrenarJ1(int RazaJ1) {

        // System.out.println(RazaJ1);
        switch (RazaJ1) {
            case 1:
                if (infoCmando_Orcos.getOroOrcos() >= 200 && infoCmando_Orcos.getDiamantesOrcos() >= 120) {
                    setEstadoEdifEntrenarJ1(1);
                    infoCmando_Orcos.setOroOrcos(infoCmando_Orcos.getOroOrcos() - 200);
                    infoCmando_Orcos.setDiamantesOrcos(infoCmando_Orcos.getDiamantesOrcos() - 120);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 2:
                if (infoCmando_Elfos.getOroElfos() >= 200 && infoCmando_Elfos.getDiamantesElfos() >= 120) {
                    setEstadoEdifEntrenarJ1(1);
                    infoCmando_Elfos.setOroElfos(infoCmando_Elfos.getOroElfos() - 200);
                    infoCmando_Elfos.setDiamantesElfos(infoCmando_Elfos.getDiamantesElfos() - 120);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 3:
                if (infoCmando_Zombies.getOroZombies() >= 200 && infoCmando_Zombies.getDiamantesZombies() >= 120) {
                    setEstadoEdifEntrenarJ1(1);
                    infoCmando_Zombies.setOroZombies(infoCmando_Zombies.getOroZombies() - 200);
                    infoCmando_Zombies.setDiamantesZombies(infoCmando_Zombies.getDiamantesZombies() - 120);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;

        }

    }

    public void ModEstadoEntrenarJ2(int RazaJ2) {

        // System.out.println(RazaJ1);
        switch (RazaJ2) {
            case 1:
                if (infoCmando_Orcos.getOroOrcos() >= 200 && infoCmando_Orcos.getDiamantesOrcos() >= 120) {
                    setEstadoEdifEntrenarJ2(1);
                    infoCmando_Orcos.setOroOrcos(infoCmando_Orcos.getOroOrcos() - 200);
                    infoCmando_Orcos.setDiamantesOrcos(infoCmando_Orcos.getDiamantesOrcos() - 120);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 2:
                if (infoCmando_Elfos.getOroElfos() >= 200 && infoCmando_Elfos.getDiamantesElfos() >= 120) {
                    setEstadoEdifEntrenarJ2(1);
                    infoCmando_Elfos.setOroElfos(infoCmando_Elfos.getOroElfos() - 200);
                    infoCmando_Elfos.setDiamantesElfos(infoCmando_Elfos.getDiamantesElfos() - 120);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 3:
                if (infoCmando_Zombies.getOroZombies() >= 200 && infoCmando_Zombies.getDiamantesZombies() >= 120) {
                    setEstadoEdifEntrenarJ2(1);
                    infoCmando_Zombies.setOroZombies(infoCmando_Zombies.getOroZombies() - 200);
                    infoCmando_Zombies.setDiamantesZombies(infoCmando_Zombies.getDiamantesZombies() - 120);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;

        }

    }

    //Compras edificaciones
    public void ComprarEdificacionesJ1(int RazaJ1) {

        System.out.println("¿Que edificacion desea comprar?");
        System.out.println("1- Entrenar Unidades");
        System.out.println("2- Comprar Vehiculos");
        Scanner opcCE = new Scanner(System.in);
        int Opc = opcCE.nextInt();

        switch (Opc) {
            case 1:
                if (getEstadoEdifEntrenarJ1() == 0) {
                    System.out.println("Edificacion para entrenar: No ha sido comprada");
                    System.out.println("¿Desea comprar la edificacion?. Su valor seria de: 200 de oro y 120 de diamantes.  s/n");
                    Scanner opcCom = new Scanner(System.in);
                    String OpcC = opcCom.nextLine();

                    if ("s".equals(OpcC)) {

                        ModEstadoEntrenarJ1(RazaJ1);

                    }

                } else {
                    System.out.println("Edificacion para entrenar: Ya ha sido comprada");
                }
                break;
            case 2:

                if (getEstadoEdifVehiculosJ1() == 0) {
                    System.out.println("Edificacion para Comprar Vehiculos: No ha sido comprada");
                    System.out.println("¿Desea comprar la edificacion?. Su valor seria de: 200 de oro y 120 de diamantes.  s/n");
                    Scanner opcCom = new Scanner(System.in);
                    String OpcC = opcCom.nextLine();

                    if ("s".equals(OpcC)) {
                        ModEstadoComprarVehiculosJ1(RazaJ1);

                    }

                } else {
                    System.out.println("Edificacion para Comprar Vehiculos: Ya ha sido comprada");
                }
                break;

        }

    }

    public void ComprarEdificacionesJ2(int RazaJ2) {

        System.out.println("¿Que edificacion desea comprar?");
        System.out.println("1- Entrenar Unidades");
        System.out.println("2- Comprar Vehiculos");
        Scanner opcCE = new Scanner(System.in);
        int Opc = opcCE.nextInt();

        switch (Opc) {
            case 1:
                if (getEstadoEdifEntrenarJ2() == 0) {
                    System.out.println("Edificacion para entrenar: No ha sido comprada");
                    System.out.println("¿Desea comprar la edificacion?. Su valor seria de: 200 de oro y 120 de diamantes.  s/n");
                    Scanner opcCom = new Scanner(System.in);
                    String OpcC = opcCom.nextLine();

                    if ("s".equals(OpcC)) {

                        ModEstadoEntrenarJ2(RazaJ2);

                    }

                } else {
                    System.out.println("Edificacion para entrenar: Ya ha sido comprada");
                }
                break;
            case 2:
                if (getEstadoEdifVehiculosJ2() == 0) {
                    System.out.println("Edificacion para Comprar Vehiculos: No ha sido comprada");
                    System.out.println("¿Desea comprar la edificacion?. Su valor seria de: 200 de oro y 120 de diamantes.  s/n");
                    Scanner opcCom = new Scanner(System.in);
                    String OpcC = opcCom.nextLine();

                    if ("s".equals(OpcC)) {
                        ModEstadoComprarVehiculosJ2(RazaJ2);

                    }

                } else {
                    System.out.println("Edificacion para Comprar Vehiculos: Ya ha sido comprada");
                }

                break;
        }

    }

    //Edif Vehiculos
    public void ModEstadoComprarVehiculosJ1(int RazaJ1) {

        switch (RazaJ1) {
            case 1:
                if (infoCmando_Orcos.getOroOrcos() >= 200 && infoCmando_Orcos.getDiamantesOrcos() >= 120) {
                    setEstadoEdifVehiculosJ1(1);
                    infoCmando_Orcos.setOroOrcos(infoCmando_Orcos.getOroOrcos() - 200);
                    infoCmando_Orcos.setDiamantesOrcos(infoCmando_Orcos.getDiamantesOrcos() - 120);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 2:
                if (infoCmando_Elfos.getOroElfos() >= 200 && infoCmando_Elfos.getDiamantesElfos() >= 120) {
                    setEstadoEdifVehiculosJ1(1);
                    infoCmando_Elfos.setOroElfos(infoCmando_Elfos.getOroElfos() - 200);
                    infoCmando_Elfos.setDiamantesElfos(infoCmando_Elfos.getDiamantesElfos() - 120);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 3:
                if (infoCmando_Zombies.getOroZombies() >= 200 && infoCmando_Zombies.getDiamantesZombies() >= 120) {
                    setEstadoEdifVehiculosJ1(1);
                    infoCmando_Zombies.setOroZombies(infoCmando_Zombies.getOroZombies() - 200);
                    infoCmando_Zombies.setDiamantesZombies(infoCmando_Zombies.getDiamantesZombies() - 120);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;

        }

    }

    public void ModEstadoComprarVehiculosJ2(int RazaJ2) {

        switch (RazaJ2) {
            case 1:
                if (infoCmando_Orcos.getOroOrcos() >= 200 && infoCmando_Orcos.getDiamantesOrcos() >= 120) {
                    setEstadoEdifVehiculosJ2(1);
                    infoCmando_Orcos.setOroOrcos(infoCmando_Orcos.getOroOrcos() - 200);
                    infoCmando_Orcos.setDiamantesOrcos(infoCmando_Orcos.getDiamantesOrcos() - 120);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 2:
                if (infoCmando_Elfos.getOroElfos() >= 200 && infoCmando_Elfos.getDiamantesElfos() >= 120) {
                    setEstadoEdifVehiculosJ2(1);
                    infoCmando_Elfos.setOroElfos(infoCmando_Elfos.getOroElfos() - 200);
                    infoCmando_Elfos.setDiamantesElfos(infoCmando_Elfos.getDiamantesElfos() - 120);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 3:
                if (infoCmando_Zombies.getOroZombies() >= 200 && infoCmando_Zombies.getDiamantesZombies() >= 120) {
                    setEstadoEdifVehiculosJ2(1);
                    infoCmando_Zombies.setOroZombies(infoCmando_Zombies.getOroZombies() - 200);
                    infoCmando_Zombies.setDiamantesZombies(infoCmando_Zombies.getDiamantesZombies() - 120);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;

        }

    }

    //Compras vehiculos
    public void CompraVehiculosJ1(int RazaJ1) {
        if (getEstadoEdifVehiculosJ1() == 1) {
            System.out.println("Que tipo de Vehiculo desea: ");
            System.out.println("1- Camion mounstro  Costo:1000 Oro y 700 Estrellas ");
            System.out.println("2- Camioneta  Costo:700 Oro y 400 Estrellas ");
            Scanner leerOpc = new Scanner(System.in);
            int opc = leerOpc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Confirmar compra s/n");
                    System.out.println("Introduzca: ");
                    Scanner opcCom = new Scanner(System.in);
                    String OpcC = opcCom.nextLine();

                    if ("s".equals(OpcC)) {
                        CompraVehiculoT1J1(RazaJ1);

                    }
                    break;
                case 2:
                    System.out.println("Confirmar compra s/n");
                    System.out.println("Introduzca: ");
                    Scanner c2 = new Scanner(System.in);
                    String OpcC2 = c2.nextLine();

                    if ("s".equals(OpcC2)) {
                        CompraVehiculoT2J1(RazaJ1);

                    }
                    break;
            }
        } else {

            System.out.println("Edificacion para comprar vehiculos: No ha sido comprada");

        }
    }

    public void CompraVehiculosJ2(int RazaJ2) {
        if (getEstadoEdifVehiculosJ2() == 1) {
            System.out.println("Que tipo de Vehiculo desea: ");
            System.out.println("1- Camion mounstro  Costo:1000 Oro y 700 Estrellas ");
            System.out.println("2- Camioneta  Costo:700 Oro y 400 Estrellas ");
            Scanner leerOpc = new Scanner(System.in);
            int opc = leerOpc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Confirmar compra s/n");
                    System.out.println("Introduzca: ");
                    Scanner opcCom = new Scanner(System.in);
                    String OpcC = opcCom.nextLine();

                    if ("s".equals(OpcC)) {
                        CompraVehiculoT1J2(RazaJ2);

                    }
                    break;
                case 2:
                    System.out.println("Confirmar compra s/n");
                    System.out.println("Introduzca: ");
                    Scanner c2 = new Scanner(System.in);
                    String OpcC2 = c2.nextLine();

                    if ("s".equals(OpcC2)) {
                        CompraVehiculoT2J2(RazaJ2);

                    }
                    break;
            }
        } else {

            System.out.println("Edificacion para comprar vehiculos: No ha sido comprada");

        }
    }

    public void CompraVehiculoT1J1(int RazaJ1) {

        switch (RazaJ1) {

            case 1:
                if (infoCmando_Orcos.getOroOrcos() >= 200 && infoCmando_Orcos.getDiamantesOrcos() >= 120) {
                    VehiculoOrc.setEstadoVehiculoOrcosT1(1);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 2:
                if (infoCmando_Elfos.getOroElfos() >= 200 && infoCmando_Elfos.getDiamantesElfos() >= 120) {
                    VehiculoElf.setEstadoVehiculoElfosT1(1);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 3:
                if (infoCmando_Zombies.getOroZombies() >= 200 && infoCmando_Zombies.getDiamantesZombies() >= 120) {
                    Vehiculozom.setEstadoVehiculoZombiesT1(1);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;

        }

    }

    public void CompraVehiculoT2J1(int RazaJ1) {

        switch (RazaJ1) {

            case 1:
                if (infoCmando_Orcos.getOroOrcos() >= 200 && infoCmando_Orcos.getDiamantesOrcos() >= 120) {
                    VehiculoOrc.setEstadoVehiculoOrcosT2(1);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 2:
                if (infoCmando_Elfos.getOroElfos() >= 200 && infoCmando_Elfos.getDiamantesElfos() >= 120) {
                    VehiculoElf.setEstadoVehiculoElfosT2(1);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 3:
                if (infoCmando_Zombies.getOroZombies() >= 200 && infoCmando_Zombies.getDiamantesZombies() >= 120) {
                    Vehiculozom.setEstadoVehiculoZombiesT2(1);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;

        }
    }

    public void CompraVehiculoT1J2(int RazaJ2) {

        switch (RazaJ2) {

            case 1:
                if (infoCmando_Orcos.getOroOrcos() >= 200 && infoCmando_Orcos.getDiamantesOrcos() >= 120) {
                    VehiculoOrc.setEstadoVehiculoOrcosT1(1);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 2:
                if (infoCmando_Elfos.getOroElfos() >= 200 && infoCmando_Elfos.getDiamantesElfos() >= 120) {
                    VehiculoElf.setEstadoVehiculoElfosT1(1);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 3:
                if (infoCmando_Zombies.getOroZombies() >= 200 && infoCmando_Zombies.getDiamantesZombies() >= 120) {
                    Vehiculozom.setEstadoVehiculoZombiesT1(1);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;

        }

    }

    public void CompraVehiculoT2J2(int RazaJ2) {

        switch (RazaJ2) {

            case 1:
                if (infoCmando_Orcos.getOroOrcos() >= 200 && infoCmando_Orcos.getDiamantesOrcos() >= 120) {
                    VehiculoOrc.setEstadoVehiculoOrcosT2(1);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 2:
                if (infoCmando_Elfos.getOroElfos() >= 200 && infoCmando_Elfos.getDiamantesElfos() >= 120) {
                    VehiculoElf.setEstadoVehiculoElfosT2(1);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 3:
                if (infoCmando_Zombies.getOroZombies() >= 200 && infoCmando_Zombies.getDiamantesZombies() >= 120) {
                    Vehiculozom.setEstadoVehiculoZombiesT2(1);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;

        }
    }

    //MejorarCapacidadRecursos
    public void MejorarC_MandoJ1(int RazaJ1) {
        Scanner opcCom = new Scanner(System.in);
        switch (RazaJ1) {
            case 1:
                //Estado Mejora Orcos
                switch (infoCmando_Orcos.getMejoraOrcos()) {
                    case 0:
                        int MejoraR1 = (int) ((0.25 * (infoCmando_Orcos.getLimiteOro() * 1.10 + infoCmando_Orcos.getLimiteDiamantes() * 1.10 + infoCmando_Orcos.getLimiteEstrellas() * 1.10)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR1);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC = opcCom.nextLine();

                        if ("s".equals(OpcC)) {
                            if (infoCmando_Orcos.getOroOrcos() >= MejoraR1 && infoCmando_Orcos.getDiamantesOrcos() >= MejoraR1 && infoCmando_Orcos.getEstrellasOrcos() >= MejoraR1) {
                                infoCmando_Orcos.setMejoraOrcos(1);
                                infoCmando_Orcos.setLimiteOro((int) (infoCmando_Orcos.getLimiteOro() * 1.10));
                                // System.out.println(infoCmando_Orcos.getLimiteDiamantes() * 1.10);
                                infoCmando_Orcos.setLimiteDiamantes((int) (infoCmando_Orcos.getLimiteDiamantes() * 1.10));
                                infoCmando_Orcos.setLimiteEstrellas((int) (infoCmando_Orcos.getLimiteEstrellas() * 1.10));
                                infoCmando_Orcos.setOroOrcos(infoCmando_Orcos.getOroOrcos() - MejoraR1);
                                infoCmando_Orcos.setDiamantesOrcos(infoCmando_Orcos.getDiamantesOrcos() - MejoraR1);
                                infoCmando_Orcos.setEstrellasOrcos(infoCmando_Orcos.getEstrellasOrcos() - MejoraR1);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                    case 1:
                        int MejoraR2 = (int) ((0.25 * (infoCmando_Orcos.getLimiteOro() * 1.30 + infoCmando_Orcos.getLimiteDiamantes() * 1.30 + infoCmando_Orcos.getLimiteEstrellas() * 1.30)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR2);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC2 = opcCom.nextLine();

                        if ("s".equals(OpcC2)) {
                            if (infoCmando_Orcos.getOroOrcos() >= MejoraR2 && infoCmando_Orcos.getDiamantesOrcos() >= MejoraR2 && infoCmando_Orcos.getEstrellasOrcos() >= MejoraR2) {
                                infoCmando_Orcos.setMejoraOrcos(2);
                                infoCmando_Orcos.setLimiteOro((int) (infoCmando_Orcos.getLimiteOro() * 1.30));
                                // System.out.println(infoCmando_Orcos.getLimiteDiamantes() * 1.10);
                                infoCmando_Orcos.setLimiteDiamantes((int) (infoCmando_Orcos.getLimiteDiamantes() * 1.30));
                                infoCmando_Orcos.setLimiteEstrellas((int) (infoCmando_Orcos.getLimiteEstrellas() * 1.30));
                                infoCmando_Orcos.setOroOrcos(infoCmando_Orcos.getOroOrcos() - MejoraR2);
                                infoCmando_Orcos.setDiamantesOrcos(infoCmando_Orcos.getDiamantesOrcos() - MejoraR2);
                                infoCmando_Orcos.setEstrellasOrcos(infoCmando_Orcos.getEstrellasOrcos() - MejoraR2);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                    case 2:
                        int MejoraR3 = (int) ((0.25 * (infoCmando_Orcos.getLimiteOro() * 1.50 + infoCmando_Orcos.getLimiteDiamantes() * 1.50 + infoCmando_Orcos.getLimiteEstrellas() * 1.50)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR3);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC3 = opcCom.nextLine();

                        if ("s".equals(OpcC3)) {
                            if (infoCmando_Orcos.getOroOrcos() >= MejoraR3 && infoCmando_Orcos.getDiamantesOrcos() >= MejoraR3 && infoCmando_Orcos.getEstrellasOrcos() >= MejoraR3) {
                                infoCmando_Orcos.setMejoraOrcos(2);
                                infoCmando_Orcos.setLimiteOro((int) (infoCmando_Orcos.getLimiteOro() * 1.50));
                                //  System.out.println(infoCmando_Orcos.getLimiteDiamantes() * 1.10);
                                infoCmando_Orcos.setLimiteDiamantes((int) (infoCmando_Orcos.getLimiteDiamantes() * 1.50));
                                infoCmando_Orcos.setLimiteEstrellas((int) (infoCmando_Orcos.getLimiteEstrellas() * 1.50));
                                infoCmando_Orcos.setOroOrcos(infoCmando_Orcos.getOroOrcos() - MejoraR3);
                                infoCmando_Orcos.setDiamantesOrcos(infoCmando_Orcos.getDiamantesOrcos() - MejoraR3);
                                infoCmando_Orcos.setEstrellasOrcos(infoCmando_Orcos.getEstrellasOrcos() - MejoraR3);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                }

                break;
            case 2:
                //Estado Mejora Elfos
                switch (infoCmando_Elfos.getMejoraElfos()) {
                    case 0:
                        int MejoraR1 = (int) ((0.25 * (infoCmando_Elfos.getLimiteOro() * 1.10 + infoCmando_Elfos.getLimiteDiamantes() * 1.10 + infoCmando_Elfos.getLimiteDiamantes() * 1.10)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR1);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC = opcCom.nextLine();

                        if ("s".equals(OpcC)) {
                            if (infoCmando_Elfos.getOroElfos() >= MejoraR1 && infoCmando_Elfos.getDiamantesElfos() >= MejoraR1 && infoCmando_Elfos.getEstrellasElfos() >= MejoraR1) {
                                infoCmando_Elfos.setMejoraElfos(1);
                                infoCmando_Elfos.setLimiteOro((int) (infoCmando_Elfos.getLimiteOro() * 1.10));
                                // System.out.println(infoCmando_Orcos.getLimiteDiamantes()*1.10);
                                infoCmando_Elfos.setLimiteDiamantes((int) (infoCmando_Elfos.getLimiteDiamantes() * 1.10));
                                infoCmando_Elfos.setLimiteEstrellas((int) (infoCmando_Elfos.getLimiteEstrellas() * 1.10));
                                infoCmando_Elfos.setOroElfos(infoCmando_Elfos.getOroElfos() - MejoraR1);
                                infoCmando_Elfos.setDiamantesElfos(infoCmando_Elfos.getDiamantesElfos() - MejoraR1);
                                infoCmando_Elfos.setEstrellasElfos(infoCmando_Elfos.getEstrellasElfos() - MejoraR1);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                    case 1:
                        int MejoraR2 = (int) ((0.25 * (infoCmando_Elfos.getLimiteOro() * 1.30 + infoCmando_Elfos.getLimiteDiamantes() * 1.30 + infoCmando_Elfos.getLimiteDiamantes() * 1.30)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR2);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC2 = opcCom.nextLine();

                        if ("s".equals(OpcC2)) {
                            if (infoCmando_Elfos.getOroElfos() >= MejoraR2 && infoCmando_Elfos.getDiamantesElfos() >= MejoraR2 && infoCmando_Elfos.getEstrellasElfos() >= MejoraR2) {
                                infoCmando_Elfos.setMejoraElfos(2);
                                infoCmando_Elfos.setLimiteOro((int) (infoCmando_Elfos.getLimiteOro() * 1.30));
                                // System.out.println(infoCmando_Orcos.getLimiteDiamantes()*1.10);
                                infoCmando_Elfos.setLimiteDiamantes((int) (infoCmando_Elfos.getLimiteDiamantes() * 1.30));
                                infoCmando_Elfos.setLimiteEstrellas((int) (infoCmando_Elfos.getLimiteEstrellas() * 1.30));
                                infoCmando_Elfos.setOroElfos(infoCmando_Elfos.getOroElfos() - MejoraR2);
                                infoCmando_Elfos.setDiamantesElfos(infoCmando_Elfos.getDiamantesElfos() - MejoraR2);
                                infoCmando_Elfos.setEstrellasElfos(infoCmando_Elfos.getEstrellasElfos() - MejoraR2);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                    case 2:
                        int MejoraR3 = (int) ((0.25 * (infoCmando_Elfos.getLimiteOro() * 1.50 + infoCmando_Elfos.getLimiteDiamantes() * 1.50 + infoCmando_Elfos.getLimiteDiamantes() * 1.50)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR3);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC3 = opcCom.nextLine();

                        if ("s".equals(OpcC3)) {
                            if (infoCmando_Elfos.getOroElfos() >= MejoraR3 && infoCmando_Elfos.getDiamantesElfos() >= MejoraR3 && infoCmando_Elfos.getEstrellasElfos() >= MejoraR3) {
                                infoCmando_Elfos.setMejoraElfos(3);
                                infoCmando_Elfos.setLimiteOro((int) (infoCmando_Elfos.getLimiteOro() * 1.50));
                                // System.out.println(infoCmando_Orcos.getLimiteDiamantes()*1.10)5
                                infoCmando_Elfos.setLimiteDiamantes((int) (infoCmando_Elfos.getLimiteDiamantes() * 1.50));
                                infoCmando_Elfos.setLimiteEstrellas((int) (infoCmando_Elfos.getLimiteEstrellas() * 1.50));
                                infoCmando_Elfos.setOroElfos(infoCmando_Elfos.getOroElfos() - MejoraR3);
                                infoCmando_Elfos.setDiamantesElfos(infoCmando_Elfos.getDiamantesElfos() - MejoraR3);
                                infoCmando_Elfos.setEstrellasElfos(infoCmando_Elfos.getEstrellasElfos() - MejoraR3);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                }
                break;
            case 3:
                //Estado Mejora Zombies
                switch (infoCmando_Zombies.getMejoraZombies()) {
                    case 0:
                        int MejoraR1 = (int) ((0.25 * (infoCmando_Zombies.getLimiteOro() * 1.10 + infoCmando_Zombies.getLimiteDiamantes() * 1.10 + infoCmando_Zombies.getLimiteDiamantes() * 1.10)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR1);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC = opcCom.nextLine();

                        if ("s".equals(OpcC)) {
                            if (infoCmando_Zombies.getOroZombies() >= MejoraR1 && infoCmando_Zombies.getDiamantesZombies() >= MejoraR1 && infoCmando_Zombies.getEstrellasZombies() >= MejoraR1) {
                                infoCmando_Zombies.setMejoraZombies(1);
                                infoCmando_Zombies.setLimiteOro((int) (infoCmando_Zombies.getLimiteOro() * 1.10));
                                // System.out.println(infoCmando_Orcos.getLimiteDiamantes()*1.10);
                                infoCmando_Zombies.setLimiteDiamantes((int) (infoCmando_Zombies.getLimiteDiamantes() * 1.10));
                                infoCmando_Zombies.setLimiteEstrellas((int) (infoCmando_Zombies.getLimiteEstrellas() * 1.10));
                                infoCmando_Zombies.setOroZombies(infoCmando_Zombies.getOroZombies() - MejoraR1);
                                infoCmando_Zombies.setDiamantesZombies(infoCmando_Zombies.getDiamantesZombies() - MejoraR1);
                                infoCmando_Zombies.setEstrellasZombies(infoCmando_Zombies.getEstrellasZombies() - MejoraR1);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                    case 1:
                        int MejoraR2 = (int) ((0.25 * (infoCmando_Zombies.getLimiteOro() * 1.30 + infoCmando_Zombies.getLimiteDiamantes() * 1.30 + infoCmando_Zombies.getLimiteDiamantes() * 1.30)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR2);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC2 = opcCom.nextLine();

                        if ("s".equals(OpcC2)) {
                            if (infoCmando_Zombies.getOroZombies() >= MejoraR2 && infoCmando_Zombies.getDiamantesZombies() >= MejoraR2 && infoCmando_Zombies.getEstrellasZombies() >= MejoraR2) {
                                infoCmando_Zombies.setMejoraZombies(2);
                                infoCmando_Zombies.setLimiteOro((int) (infoCmando_Zombies.getLimiteOro() * 1.30));
                                // System.out.println(infoCmando_Orcos.getLimiteDiamantes()*1.10);
                                infoCmando_Zombies.setLimiteDiamantes((int) (infoCmando_Zombies.getLimiteDiamantes() * 1.30));
                                infoCmando_Zombies.setLimiteEstrellas((int) (infoCmando_Zombies.getLimiteEstrellas() * 1.30));
                                infoCmando_Zombies.setOroZombies(infoCmando_Zombies.getOroZombies() - MejoraR2);
                                infoCmando_Zombies.setDiamantesZombies(infoCmando_Zombies.getDiamantesZombies() - MejoraR2);
                                infoCmando_Zombies.setEstrellasZombies(infoCmando_Zombies.getEstrellasZombies() - MejoraR2);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                    case 2:
                        int MejoraR3 = (int) ((0.25 * (infoCmando_Zombies.getLimiteOro() * 1.50 + infoCmando_Zombies.getLimiteDiamantes() * 1.50 + infoCmando_Zombies.getLimiteDiamantes() * 1.50)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR3);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC3 = opcCom.nextLine();

                        if ("s".equals(OpcC3)) {
                            if (infoCmando_Zombies.getOroZombies() >= MejoraR3 && infoCmando_Zombies.getDiamantesZombies() >= MejoraR3 && infoCmando_Zombies.getEstrellasZombies() >= MejoraR3) {
                                infoCmando_Zombies.setMejoraZombies(3);
                                infoCmando_Zombies.setLimiteOro((int) (infoCmando_Zombies.getLimiteOro() * 1.50));
                                // System.out.println(infoCmando_Orcos.getLimiteDiamantes()*1.10);
                                infoCmando_Zombies.setLimiteDiamantes((int) (infoCmando_Zombies.getLimiteDiamantes() * 1.50));
                                infoCmando_Zombies.setLimiteEstrellas((int) (infoCmando_Zombies.getLimiteEstrellas() * 1.50));
                                infoCmando_Zombies.setOroZombies(infoCmando_Zombies.getOroZombies() - MejoraR3);
                                infoCmando_Zombies.setDiamantesZombies(infoCmando_Zombies.getDiamantesZombies() - MejoraR3);
                                infoCmando_Zombies.setEstrellasZombies(infoCmando_Zombies.getEstrellasZombies() - MejoraR3);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                }
                break;
        }
    }

    public void MejorarC_MandoJ2(int RazaJ2) {
        Scanner opcCom = new Scanner(System.in);
        switch (RazaJ2) {
            case 1:
                //Estado Mejora Orcos
                switch (infoCmando_Orcos.getMejoraOrcos()) {
                    case 0:
                        int MejoraR1 = (int) ((0.25 * (infoCmando_Orcos.getLimiteOro() * 1.10 + infoCmando_Orcos.getLimiteDiamantes() * 1.10 + infoCmando_Orcos.getLimiteEstrellas() * 1.10)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR1);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC = opcCom.nextLine();

                        if ("s".equals(OpcC)) {
                            if (infoCmando_Orcos.getOroOrcos() >= MejoraR1 && infoCmando_Orcos.getDiamantesOrcos() >= MejoraR1 && infoCmando_Orcos.getEstrellasOrcos() >= MejoraR1) {
                                infoCmando_Orcos.setMejoraOrcos(1);
                                infoCmando_Orcos.setLimiteOro((int) (infoCmando_Orcos.getLimiteOro() * 1.10));
                                // System.out.println(infoCmando_Orcos.getLimiteDiamantes() * 1.10);
                                infoCmando_Orcos.setLimiteDiamantes((int) (infoCmando_Orcos.getLimiteDiamantes() * 1.10));
                                infoCmando_Orcos.setLimiteEstrellas((int) (infoCmando_Orcos.getLimiteEstrellas() * 1.10));
                                infoCmando_Orcos.setOroOrcos(infoCmando_Orcos.getOroOrcos() - MejoraR1);
                                infoCmando_Orcos.setDiamantesOrcos(infoCmando_Orcos.getDiamantesOrcos() - MejoraR1);
                                infoCmando_Orcos.setEstrellasOrcos(infoCmando_Orcos.getEstrellasOrcos() - MejoraR1);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                    case 1:
                        int MejoraR2 = (int) ((0.25 * (infoCmando_Orcos.getLimiteOro() * 1.30 + infoCmando_Orcos.getLimiteDiamantes() * 1.30 + infoCmando_Orcos.getLimiteEstrellas() * 1.30)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR2);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC2 = opcCom.nextLine();

                        if ("s".equals(OpcC2)) {
                            if (infoCmando_Orcos.getOroOrcos() >= MejoraR2 && infoCmando_Orcos.getDiamantesOrcos() >= MejoraR2 && infoCmando_Orcos.getEstrellasOrcos() >= MejoraR2) {
                                infoCmando_Orcos.setMejoraOrcos(2);
                                infoCmando_Orcos.setLimiteOro((int) (infoCmando_Orcos.getLimiteOro() * 1.30));
                                // System.out.println(infoCmando_Orcos.getLimiteDiamantes() * 1.10);
                                infoCmando_Orcos.setLimiteDiamantes((int) (infoCmando_Orcos.getLimiteDiamantes() * 1.30));
                                infoCmando_Orcos.setLimiteEstrellas((int) (infoCmando_Orcos.getLimiteEstrellas() * 1.30));
                                infoCmando_Orcos.setOroOrcos(infoCmando_Orcos.getOroOrcos() - MejoraR2);
                                infoCmando_Orcos.setDiamantesOrcos(infoCmando_Orcos.getDiamantesOrcos() - MejoraR2);
                                infoCmando_Orcos.setEstrellasOrcos(infoCmando_Orcos.getEstrellasOrcos() - MejoraR2);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                    case 2:
                        int MejoraR3 = (int) ((0.25 * (infoCmando_Orcos.getLimiteOro() * 1.50 + infoCmando_Orcos.getLimiteDiamantes() * 1.50 + infoCmando_Orcos.getLimiteEstrellas() * 1.50)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR3);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC3 = opcCom.nextLine();

                        if ("s".equals(OpcC3)) {
                            if (infoCmando_Orcos.getOroOrcos() >= MejoraR3 && infoCmando_Orcos.getDiamantesOrcos() >= MejoraR3 && infoCmando_Orcos.getEstrellasOrcos() >= MejoraR3) {
                                infoCmando_Orcos.setMejoraOrcos(2);
                                infoCmando_Orcos.setLimiteOro((int) (infoCmando_Orcos.getLimiteOro() * 1.50));
                                //  System.out.println(infoCmando_Orcos.getLimiteDiamantes() * 1.10);
                                infoCmando_Orcos.setLimiteDiamantes((int) (infoCmando_Orcos.getLimiteDiamantes() * 1.50));
                                infoCmando_Orcos.setLimiteEstrellas((int) (infoCmando_Orcos.getLimiteEstrellas() * 1.50));
                                infoCmando_Orcos.setOroOrcos(infoCmando_Orcos.getOroOrcos() - MejoraR3);
                                infoCmando_Orcos.setDiamantesOrcos(infoCmando_Orcos.getDiamantesOrcos() - MejoraR3);
                                infoCmando_Orcos.setEstrellasOrcos(infoCmando_Orcos.getEstrellasOrcos() - MejoraR3);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                }

                break;
            case 2:
                //Estado Mejora Elfos
                switch (infoCmando_Elfos.getMejoraElfos()) {
                    case 0:
                        int MejoraR1 = (int) ((0.25 * (infoCmando_Elfos.getLimiteOro() * 1.10 + infoCmando_Elfos.getLimiteDiamantes() * 1.10 + infoCmando_Elfos.getLimiteDiamantes() * 1.10)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR1);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC = opcCom.nextLine();

                        if ("s".equals(OpcC)) {
                            if (infoCmando_Elfos.getOroElfos() >= MejoraR1 && infoCmando_Elfos.getDiamantesElfos() >= MejoraR1 && infoCmando_Elfos.getEstrellasElfos() >= MejoraR1) {
                                infoCmando_Elfos.setMejoraElfos(1);
                                infoCmando_Elfos.setLimiteOro((int) (infoCmando_Elfos.getLimiteOro() * 1.10));
                                // System.out.println(infoCmando_Orcos.getLimiteDiamantes()*1.10);
                                infoCmando_Elfos.setLimiteDiamantes((int) (infoCmando_Elfos.getLimiteDiamantes() * 1.10));
                                infoCmando_Elfos.setLimiteEstrellas((int) (infoCmando_Elfos.getLimiteEstrellas() * 1.10));
                                infoCmando_Elfos.setOroElfos(infoCmando_Elfos.getOroElfos() - MejoraR1);
                                infoCmando_Elfos.setDiamantesElfos(infoCmando_Elfos.getDiamantesElfos() - MejoraR1);
                                infoCmando_Elfos.setEstrellasElfos(infoCmando_Elfos.getEstrellasElfos() - MejoraR1);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                    case 1:
                        int MejoraR2 = (int) ((0.25 * (infoCmando_Elfos.getLimiteOro() * 1.30 + infoCmando_Elfos.getLimiteDiamantes() * 1.30 + infoCmando_Elfos.getLimiteDiamantes() * 1.30)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR2);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC2 = opcCom.nextLine();

                        if ("s".equals(OpcC2)) {
                            if (infoCmando_Elfos.getOroElfos() >= MejoraR2 && infoCmando_Elfos.getDiamantesElfos() >= MejoraR2 && infoCmando_Elfos.getEstrellasElfos() >= MejoraR2) {
                                infoCmando_Elfos.setMejoraElfos(2);
                                infoCmando_Elfos.setLimiteOro((int) (infoCmando_Elfos.getLimiteOro() * 1.30));
                                // System.out.println(infoCmando_Orcos.getLimiteDiamantes()*1.10);
                                infoCmando_Elfos.setLimiteDiamantes((int) (infoCmando_Elfos.getLimiteDiamantes() * 1.30));
                                infoCmando_Elfos.setLimiteEstrellas((int) (infoCmando_Elfos.getLimiteEstrellas() * 1.30));
                                infoCmando_Elfos.setOroElfos(infoCmando_Elfos.getOroElfos() - MejoraR2);
                                infoCmando_Elfos.setDiamantesElfos(infoCmando_Elfos.getDiamantesElfos() - MejoraR2);
                                infoCmando_Elfos.setEstrellasElfos(infoCmando_Elfos.getEstrellasElfos() - MejoraR2);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                    case 2:
                        int MejoraR3 = (int) ((0.25 * (infoCmando_Elfos.getLimiteOro() * 1.50 + infoCmando_Elfos.getLimiteDiamantes() * 1.50 + infoCmando_Elfos.getLimiteDiamantes() * 1.50)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR3);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC3 = opcCom.nextLine();

                        if ("s".equals(OpcC3)) {
                            if (infoCmando_Elfos.getOroElfos() >= MejoraR3 && infoCmando_Elfos.getDiamantesElfos() >= MejoraR3 && infoCmando_Elfos.getEstrellasElfos() >= MejoraR3) {
                                infoCmando_Elfos.setMejoraElfos(3);
                                infoCmando_Elfos.setLimiteOro((int) (infoCmando_Elfos.getLimiteOro() * 1.50));
                                // System.out.println(infoCmando_Orcos.getLimiteDiamantes()*1.10)5
                                infoCmando_Elfos.setLimiteDiamantes((int) (infoCmando_Elfos.getLimiteDiamantes() * 1.50));
                                infoCmando_Elfos.setLimiteEstrellas((int) (infoCmando_Elfos.getLimiteEstrellas() * 1.50));
                                infoCmando_Elfos.setOroElfos(infoCmando_Elfos.getOroElfos() - MejoraR3);
                                infoCmando_Elfos.setDiamantesElfos(infoCmando_Elfos.getDiamantesElfos() - MejoraR3);
                                infoCmando_Elfos.setEstrellasElfos(infoCmando_Elfos.getEstrellasElfos() - MejoraR3);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                }
                break;
            case 3:
                //Estado Mejora Zombies
                switch (infoCmando_Zombies.getMejoraZombies()) {
                    case 0:
                        int MejoraR1 = (int) ((0.25 * (infoCmando_Zombies.getLimiteOro() * 1.10 + infoCmando_Zombies.getLimiteDiamantes() * 1.10 + infoCmando_Zombies.getLimiteDiamantes() * 1.10)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR1);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC = opcCom.nextLine();

                        if ("s".equals(OpcC)) {
                            if (infoCmando_Zombies.getOroZombies() >= MejoraR1 && infoCmando_Zombies.getDiamantesZombies() >= MejoraR1 && infoCmando_Zombies.getEstrellasZombies() >= MejoraR1) {
                                infoCmando_Zombies.setMejoraZombies(1);
                                infoCmando_Zombies.setLimiteOro((int) (infoCmando_Zombies.getLimiteOro() * 1.10));
                                // System.out.println(infoCmando_Orcos.getLimiteDiamantes()*1.10);
                                infoCmando_Zombies.setLimiteDiamantes((int) (infoCmando_Zombies.getLimiteDiamantes() * 1.10));
                                infoCmando_Zombies.setLimiteEstrellas((int) (infoCmando_Zombies.getLimiteEstrellas() * 1.10));
                                infoCmando_Zombies.setOroZombies(infoCmando_Zombies.getOroZombies() - MejoraR1);
                                infoCmando_Zombies.setDiamantesZombies(infoCmando_Zombies.getDiamantesZombies() - MejoraR1);
                                infoCmando_Zombies.setEstrellasZombies(infoCmando_Zombies.getEstrellasZombies() - MejoraR1);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                    case 1:
                        int MejoraR2 = (int) ((0.25 * (infoCmando_Zombies.getLimiteOro() * 1.30 + infoCmando_Zombies.getLimiteDiamantes() * 1.30 + infoCmando_Zombies.getLimiteDiamantes() * 1.30)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR2);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC2 = opcCom.nextLine();

                        if ("s".equals(OpcC2)) {
                            if (infoCmando_Zombies.getOroZombies() >= MejoraR2 && infoCmando_Zombies.getDiamantesZombies() >= MejoraR2 && infoCmando_Zombies.getEstrellasZombies() >= MejoraR2) {
                                infoCmando_Zombies.setMejoraZombies(2);
                                infoCmando_Zombies.setLimiteOro((int) (infoCmando_Zombies.getLimiteOro() * 1.30));
                                // System.out.println(infoCmando_Orcos.getLimiteDiamantes()*1.10);
                                infoCmando_Zombies.setLimiteDiamantes((int) (infoCmando_Zombies.getLimiteDiamantes() * 1.30));
                                infoCmando_Zombies.setLimiteEstrellas((int) (infoCmando_Zombies.getLimiteEstrellas() * 1.30));
                                infoCmando_Zombies.setOroZombies(infoCmando_Zombies.getOroZombies() - MejoraR2);
                                infoCmando_Zombies.setDiamantesZombies(infoCmando_Zombies.getDiamantesZombies() - MejoraR2);
                                infoCmando_Zombies.setEstrellasZombies(infoCmando_Zombies.getEstrellasZombies() - MejoraR2);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                    case 2:
                        int MejoraR3 = (int) ((0.25 * (infoCmando_Zombies.getLimiteOro() * 1.50 + infoCmando_Zombies.getLimiteDiamantes() * 1.50 + infoCmando_Zombies.getLimiteDiamantes() * 1.50)) / 3);
                        System.out.println("\nLa cantidad para mejorar el Centro de Mando es: " + MejoraR3);
                        System.out.println("Confirmar compra s/n");
                        System.out.println("Introduzca: ");

                        String OpcC3 = opcCom.nextLine();

                        if ("s".equals(OpcC3)) {
                            if (infoCmando_Zombies.getOroZombies() >= MejoraR3 && infoCmando_Zombies.getDiamantesZombies() >= MejoraR3 && infoCmando_Zombies.getEstrellasZombies() >= MejoraR3) {
                                infoCmando_Zombies.setMejoraZombies(3);
                                infoCmando_Zombies.setLimiteOro((int) (infoCmando_Zombies.getLimiteOro() * 1.50));
                                // System.out.println(infoCmando_Orcos.getLimiteDiamantes()*1.10);
                                infoCmando_Zombies.setLimiteDiamantes((int) (infoCmando_Zombies.getLimiteDiamantes() * 1.50));
                                infoCmando_Zombies.setLimiteEstrellas((int) (infoCmando_Zombies.getLimiteEstrellas() * 1.50));
                                infoCmando_Zombies.setOroZombies(infoCmando_Zombies.getOroZombies() - MejoraR3);
                                infoCmando_Zombies.setDiamantesZombies(infoCmando_Zombies.getDiamantesZombies() - MejoraR3);
                                infoCmando_Zombies.setEstrellasZombies(infoCmando_Zombies.getEstrellasZombies() - MejoraR3);
                                System.out.println("Su compra ha sido satisfactoria");
                            } else {
                                System.out.println("\nNo son suficiente los recursos para la compra");
                            }

                        }
                        break;
                }
                break;
        }
    }

    

}
