/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertofuentes.s.world.Centro_Mando;

/**
 *
 * @author R.Fuentes
 */
public class Cmando_Zombies implements Cmando {
    @Override
    
    public void AlmacenarRecursos() {
        System.out.println("Centro de mando zombies");
       
    }
    private int oroZombies = 1000, diamantesZombies = 1500, estrellasZombies = 1700;
    private int limiteOro = 10000, limiteDiamantes = 5000, limiteEstrellas = 3000;
    private int VidaCmando_Zombies = 50;
    private int mejoraZombies=0;
    public int getOroZombies() {
        return oroZombies;
    }

    public void setOroZombies(int oroZombies) {
        this.oroZombies = oroZombies;
    }

    public int getDiamantesZombies() {
        return diamantesZombies;
    }

    public void setDiamantesZombies(int diamantesZombies) {
        this.diamantesZombies = diamantesZombies;
    }

    public int getEstrellasZombies() {
        return estrellasZombies;
    }

    public void setEstrellasZombies(int estrellasZombies) {
        this.estrellasZombies = estrellasZombies;
    }

    public int getLimiteOro() {
        return limiteOro;
    }

    public void setLimiteOro(int limiteOro) {
        this.limiteOro = limiteOro;
    }

    public int getLimiteDiamantes() {
        return limiteDiamantes;
    }

    public void setLimiteDiamantes(int limiteDiamantes) {
        this.limiteDiamantes = limiteDiamantes;
    }

    public int getLimiteEstrellas() {
        return limiteEstrellas;
    }

    public void setLimiteEstrellas(int limiteEstrellas) {
        this.limiteEstrellas = limiteEstrellas;
    }

    public int getVidaCmando_Zombies() {
        return VidaCmando_Zombies;
    }

    public void setVidaCmando_Zombies(int VidaCmando_Zombies) {
        this.VidaCmando_Zombies = VidaCmando_Zombies;
    }

    public int getMejoraZombies() {
        return mejoraZombies;
    }

    public void setMejoraZombies(int mejoraZombies) {
        this.mejoraZombies = mejoraZombies;
    }
    
    
    
}