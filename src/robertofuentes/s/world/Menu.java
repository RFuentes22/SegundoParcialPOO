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
    
   public static Menu getInstance(){
        if(menu==null){
            menu=new Menu();
        }
        return menu;
    }
    public void opciones(){
        Scanner leer = new Scanner(System.in);
       Player player1=new Player();
       Player player2=new Player();
       Player Razaplayer1=new Player();
       Player Razaplayer2=new Player();
       String nombre1=leer.nextLine(),nombre2=leer.nextLine(),raza=leer.nextLine();
        while(true){    
        int option=0;
           while(option==0){
            try{
                 
                System.out.println("");
                System.out.println("Bienvenido a RobertoFuentes'World");
                System.out.println("Ingrese su nombre (Jugador 1)");
                player1.setNombre(nombre1);
                System.out.println("Ingrese su nombre (Jugador 2)");
                player2.setNombre(nombre2);
                System.out.println("¿Que tipo de raza prefieres?" + (nombre1));
                System.out.println("1- Orcos"
                        + "2- Elfos"
                        + "3- Zombies");
                Razaplayer1.setNombre(raza);
                System.out.println("¿Que tipo de raza prefieres?" + (nombre2));
                System.out.println("1- Orcos"
                        + "2- Elfos"
                        + "3- Zombies");
                Razaplayer2.setNombre(raza);
                //option = Integer.parseInt(opcion);
            }
            catch(Exception ex){
                System.err.println("Error, Ingrese un Digito! /n");
            }
        }
        /**
        switch(option){
            case 1: adminHotel.modificarPrecioDeHabitacion();
            break;
            case 2: adminHotel.modificarPiso();
            break;
            case 3: adminHotel.crearReservacion();
            break;
            case 4: 
                System.out.println("Ingrese El ID de la Reservacion: ");
                Scanner leerIdReservacion = new Scanner(System.in);
                String id = leerIdReservacion.next();
                int idReservacion = Integer.parseInt(id);
               adminHotel.verReservacion(idReservacion);
            break;
            case 5: 
                System.out.print("Ingrese Id de la Reservacion a Modificar: ");
                Scanner leerIdReservacion2 = new Scanner(System.in);
                String id2 = leerIdReservacion2.next();
                int idReservacion2 = Integer.parseInt(id2);
                adminHotel.modificarReservacion(idReservacion2);
            break;
            case 6: 
                System.out.print("Ingrese Id de la Reservacion a Cancelar: ");
                Scanner leerIdReservacion3 = new Scanner(System.in);
                 int hol = leerIdReservacion3.nextInt();
           
                adminHotel.cancelarReservacion(hol);
            break;
            case 7: 
                System.out.println("Reservaciones de la proxima semana");
                System.out.println("--------------------------------------");
                adminHotel.verReservacionesSemana();
   
            break;
            case 8:
                AdminPiso.MostrarHabitacionesDisponibles();
                break;
            case 9:
                System.exit(0);
                break;
            default: System.err.println("Error, Ingrese una opcion valida!");
            break;
        }
        
    }
    }**/
}}}


