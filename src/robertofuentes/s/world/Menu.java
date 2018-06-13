/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world;

import java.util.Scanner;
import robertofuentes.s.world.Edificaciones.CompEdificaciones;


/**
 *
 * @author R.Fuentes
 */
public class Menu {

    private static Menu menu;

    public Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }
    //Instancias
    Player player = new Player();
    CompEdificaciones EntrenarUniJ1=new CompEdificaciones();
    public void inicio() {

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
            player.opcionesJ1();
        } catch (Exception ex) {
            System.err.println("Error, Ingrese un Digito! ");
        }

    }

}
