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
public class Cmando_Orcos implements Cmando {
    @Override
    public void AlmacenarRecursos() {
        System.out.println("Centro de mando orcos");
        
    }
    private int oroOrcos = 0, diamantesOrcos = 0, estrellasOrcos = 0;
    private int limiteOro = 10000, limiteDiamantes = 5000, limiteEstrellas = 3000;
    private int VidaCmando_Orcos = 50;

    public int getOroOrcos() {
        return oroOrcos;
    }

    public void setOroOrcos(int oroOrcos) {
        this.oroOrcos = oroOrcos;
    }

    public int getDiamantesOrcos() {
        return diamantesOrcos;
    }

    public void setDiamantesOrcos(int diamantesOrcos) {
        this.diamantesOrcos = diamantesOrcos;
    }

    public int getEstrellasOrcos() {
        return estrellasOrcos;
    }

    public void setEstrellasOrcos(int estrellasOrcos) {
        this.estrellasOrcos = estrellasOrcos;
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

    public int getVidaCmando_Orcos() {
        return VidaCmando_Orcos;
    }

    public void setVidaCmando_Orcos(int VidaCmando_Orcos) {
        this.VidaCmando_Orcos = VidaCmando_Orcos;
    }
    
    
}

