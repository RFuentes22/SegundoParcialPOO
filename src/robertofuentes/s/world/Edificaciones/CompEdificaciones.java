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
import robertofuentes.s.world.vehiculos.Vehiculos;

/**
 *
 * @author R.Fuentes
 */
public class CompEdificaciones implements Edificaciones {

    public CompEdificaciones() {
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
    Vehiculos Vehiculos = new Vehiculos();
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
        System.out.println("Eu J1");
    }

    //Metodos
    //Edif entrenamiento
    public void ModEstadoEntrenarJ1(int RazaJ1) {

        // System.out.println(RazaJ1);
        switch (RazaJ1) {
            case 1:
                if (infoCmando_Orcos.getOroOrcos() >= 200 && infoCmando_Orcos.getDiamantesOrcos() >= 120) {
                    setEstadoEdifEntrenarJ1(1);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 2:
                if (infoCmando_Elfos.getOroElfos() >= 200 && infoCmando_Elfos.getDiamantesElfos() >= 120) {
                    setEstadoEdifEntrenarJ1(1);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 3:
                if (infoCmando_Zombies.getOroZombies() >= 200 && infoCmando_Zombies.getDiamantesZombies() >= 120) {
                    setEstadoEdifEntrenarJ1(1);
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
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 2:
                if (infoCmando_Elfos.getOroElfos() >= 200 && infoCmando_Elfos.getDiamantesElfos() >= 120) {
                    setEstadoEdifEntrenarJ2(1);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 3:
                if (infoCmando_Zombies.getOroZombies() >= 200 && infoCmando_Zombies.getDiamantesZombies() >= 120) {
                    setEstadoEdifEntrenarJ2(1);
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

                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 2:
                if (infoCmando_Elfos.getOroElfos() >= 200 && infoCmando_Elfos.getDiamantesElfos() >= 120) {
                    setEstadoEdifVehiculosJ1(1);

                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 3:
                if (infoCmando_Zombies.getOroZombies() >= 200 && infoCmando_Zombies.getDiamantesZombies() >= 120) {
                    setEstadoEdifVehiculosJ1(1);
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

                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 2:
                if (infoCmando_Elfos.getOroElfos() >= 200 && infoCmando_Elfos.getDiamantesElfos() >= 120) {
                    setEstadoEdifVehiculosJ2(1);

                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;
            case 3:
                if (infoCmando_Zombies.getOroZombies() >= 200 && infoCmando_Zombies.getDiamantesZombies() >= 120) {
                    setEstadoEdifVehiculosJ2(1);
                    System.out.println("Su compra ha sido satisfactoria");
                } else {
                    System.out.println("No se ha podido completar su compra, hace falta mas recursos");
                }
                break;

        }

    }

}
