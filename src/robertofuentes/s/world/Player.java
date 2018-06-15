/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world;

import java.util.Scanner;
import robertofuentes.s.world.Edificaciones.Logic;
import robertofuentes.s.world.vehiculos.Vehiculos;

/**
 *
 * @author R.Fuentes
 */
public class Player {
//Instancias    

    //Edificaciones
    Logic Comp = new Logic();
    //Vehiculos
    Vehiculos vehiculos = new Vehiculos();
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

    //Opciones Jugadores
    public void opcionesJ1() {

        while (true) {

            System.out.println("\n¿Que desea hacer? " + Nombre1 + "\n");
            System.out.println("1- Atacar a " + Nombre2);
            System.out.println("2- Entrenar Unidades ");
            System.out.println("3- Comprar edificaciones ");
            System.out.println("4- Comprar vehiculos");
            System.out.println("5- Mejorar capacidad de Almacenamiento");
            System.out.println("6- Estado ");
            System.out.println("7- Terminar turno");
            System.out.print("Introduzca: ");
            Scanner leerOpc = new Scanner(System.in);

            int Opc = leerOpc.nextInt();
            switch (Opc) {
                case 1:
                    //AtacarToJ2();
                    break;
                case 2:

                    if (Comp.getEstadoEdifEntrenarJ1() == 1) {
                        Comp.EntrenarUnidadesJ1(RazaJ1);

                    } else {
                        System.out.println("\nLa edificacion Entrenar no ha sido adquirida");
                    }

                    break;
                case 3:
                    Comp.ComprarEdificacionesJ1(RazaJ1);
                    break;
                case 4:

                    if (Comp.getEstadoEdifVehiculosJ1() == 1) {
                        Comp.CompraVehiculosJ1(RazaJ1);

                    } else {
                        System.out.println("\nLa edificacion para comprar Vehiculos no ha sido adquirida");
                    }

                    break;
                case 5:
                    Comp.MejorarC_MandoJ1(RazaJ1);
                    break;
                case 6:
                    Comp.InformacionRazasJ1(RazaJ1);
                    break;
                case 7:
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
            System.out.println("\n¿Que desea hacer? " + Nombre2 + "\n");
            System.out.println("1- Atacar a " + Nombre1);
            System.out.println("2- Entrenar Unidades ");
            System.out.println("3- Comprar edificaciones ");
            System.out.println("4- Comprar vehiculos");
            System.out.println("5- Mejorar capacidad de Almacenamiento");
            System.out.println("6- Estado");
            System.out.println("7- Terminar turno");
            System.out.print("Introduzca: ");
            Scanner leerOpc = new Scanner(System.in);

            int Opc = leerOpc.nextInt();
            switch (Opc) {
                case 1:
                    //AtacarToJ1();
                    break;
                case 2:
                    if (Comp.getEstadoEdifEntrenarJ2() == 1) {

                        Comp.EntrenarUnidadesJ2(RazaJ2);
                    } else {
                        System.out.println("\nLa edificacion Entrenar no ha sido adquirida");
                    }
                    break;
                case 3:
                    Comp.ComprarEdificacionesJ2(RazaJ2);
                    break;
                case 4:
                    if (Comp.getEstadoEdifVehiculosJ2() == 1) {
                        Comp.CompraVehiculosJ2(RazaJ2);

                    } else {
                        System.out.println("\nLa edificacion para comprar Vehiculos no ha sido adquirida");
                    }

                    break;
                case 5:
                    Comp.MejorarC_MandoJ2(RazaJ2);
                    break;
                case 6:
                    Comp.InformacionRazasJ2(RazaJ2);
                    break;
                case 7:
                    opcionesJ1();
                    break;
                default:
                    System.out.println("\nIntroduzca opcion valida \n");
                    opcionesJ2();
                    break;
            }
        }
    }

}
