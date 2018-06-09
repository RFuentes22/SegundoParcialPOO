/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world;

import java.util.Scanner;


/**
 *
 * @author R.Fuentes
 */
public class Menu {

    private static Menu menu;

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }
    //Instancias
    Player player = new Player();
  

    public void inicio() {

        //while(true){    
        //int option = 0;
        //while(option==0){
        try {

            System.out.println("");
            System.out.println("Bienvenido a RobertoFuentes'World");
            System.out.println("Ingrese su nombre (Jugador 1)");
            System.out.print("Introduzca: ");
            Scanner leerNombre = new Scanner(System.in);
            String nombre1 = leerNombre.next();
            player.setNombre1(nombre1);
            //player.MostrarNombre1();
            System.out.println("Ingrese su nombre (Jugador 2)");
            System.out.print("Introduzca: ");
            String nombre2 = leerNombre.next();
            player.setNombre2(nombre2);
            //player.MostrarNombre2();
            System.out.println("¿Que tipo de raza prefieres? " + player.getNombre1());
            System.out.println("1- Orcos"
                    + "\n2- Elfos"
                    + "\n3- Zombies");
            System.out.print("Introduzca: ");
            Scanner leerRaza = new Scanner(System.in);
            int RazaJ1 = leerRaza.nextInt();
            player.setRazaJ1(RazaJ1);
            //player.MostrarRazaJ1();
            System.out.println("¿Que tipo de raza prefieres? " + player.getNombre2());
            System.out.println("1- Orcos"
                    + "\n2- Elfos"
                    + "\n3- Zombies");
            System.out.print("Introduzca: ");
            int RazaJ2 = leerRaza.nextInt();

            player.setRazaJ2(RazaJ2);
            //player.MostrarRazaJ2();
            opcionesJ1();
        } catch (Exception ex) {
            System.err.println("Error, Ingrese un Digito! ");
        }

    }

    public void opcionesJ1() {
       

        System.out.println("\n¿Que desea hacer? " + player.getNombre1() + "\n");
        player.InformacionRazasJ1();
        System.out.println("1- Atacar a " + player.getNombre2());
        System.out.println("2- Entrenar Unidades ");
        System.out.println("3- Comprar edificaciones ");
        System.out.println("4- Comprar vehiclos");
        System.out.println("5- Mejorar capacidad de Almacenamiento");
        System.out.println("6- Terminar turno");
        System.out.print("Introduzca: ");
        Scanner leerOpc = new Scanner(System.in);

        int Opc = leerOpc.nextInt();
        switch (Opc) {
            case 1:
                AtacarToJ2();
                break;
            case 2:
                EntrenarUnidadesJ1();
                break;
            case 3:
                ComprarEdificacionesJ1();
                break;
            case 4:
                ComprarVehiculosJ1();
                break;
            case 5:
                MejorarCapcidadJ1();
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

    public void opcionesJ2() {
        System.out.println("\n¿Que desea hacer? " + player.getNombre2());
        player.InformacionRazasJ2();
        System.out.println("1- Atacar a " + player.getNombre1());
        System.out.println("2- Entrenar Unidades ");
        System.out.println("3- Comprar edificaciones ");
        System.out.println("4- Comprar vehiclos");
        System.out.println("5- Mejorar capacidad de Almacenamiento");
        System.out.println("6- Terminar turno");
        System.out.print("Introduzca: ");
        Scanner leerOpc = new Scanner(System.in);

        int Opc = leerOpc.nextInt();
        switch (Opc) {
            case 1:
                AtacarToJ1();
                break;
            case 2:
                EntrenarUnidadesJ2();
                break;
            case 3:
                ComprarEdificacionesJ2();
                break;
            case 4:
                ComprarVehiculosJ2();
                break;
            case 5:
                MejorarCapcidadJ2();
                break;
            case 6:
                opcionesJ1();
                break;
            default:
                System.out.println("\nIntroduzca opcion valida \n");
                opcionesJ1();
                break;
        }

    }

    public void AtacarToJ2() {

    }

    public void AtacarToJ1() {

    }

    public void EntrenarUnidadesJ1() {

    }

    public void EntrenarUnidadesJ2() {

    }

    public void ComprarEdificacionesJ1() {

    }

    public void ComprarEdificacionesJ2() {

    }

    public void ComprarVehiculosJ1() {

    }

    public void ComprarVehiculosJ2() {

    }

    public void MejorarCapcidadJ1() {

    }

    public void MejorarCapcidadJ2() {

    }

    
}

