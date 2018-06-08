/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world;

/**
 *
 * @author R.Fuentes
 */
public class Player {

    public String Nombre1, Nombre2;
    public int RazaJ1, RazaJ2;

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

}
