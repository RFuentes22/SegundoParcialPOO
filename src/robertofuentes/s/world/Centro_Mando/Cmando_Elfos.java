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
public class Cmando_Elfos implements Cmando {

    @Override
    public void AlmacenarRecursos() {
        System.out.println("Centro de mando elfos");

    }
    private int oroElfos = 1000, diamantesElfos = 1500, estrellasElfos = 1700;
    private int limiteOro = 10000, limiteDiamantes = 5000, limiteEstrellas = 3000;
    private int VidaCmando_Elfos = 50;

    public int getVidaCmando_Elfos() {
        return VidaCmando_Elfos;
    }

    public void setVidaCmando_Elfos(int VidaCmando_Elfos) {
        this.VidaCmando_Elfos = VidaCmando_Elfos;
    }

    public int getOroElfos() {
        return oroElfos;
    }

    public void setOroElfos(int oroElfos) {
        this.oroElfos = oroElfos;
    }

    public int getDiamantesElfos() {
        return diamantesElfos;
    }

    public void setDiamantesElfos(int diamantesElfos) {
        this.diamantesElfos = diamantesElfos;
    }

    public int getEstrellasElfos() {
        return estrellasElfos;
    }

    public void setEstrellasElfos(int estrellasElfos) {
        this.estrellasElfos = estrellasElfos;
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

}
