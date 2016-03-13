package physics.grafiikat;

import physics.Voimat.Gravitaatio;
import physics.Voimat.Kitkavoima;
import physics.Voimat.Maan_Vetovoima;
import physics.Voimat.Voima;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import physics.kappaleet.Hahmo;
import physics.kappaleet.PerusKappale;
import physics.kappaleet.Neste;

public class Piirtoalusta extends JPanel {

    private Hahmo hahmo;
    private boolean gravitaatioPaalla;
    private ArrayList<Voima> voimat;
    private ArrayList<Voima> gravitaatiot;
    private ArrayList<PerusKappale> kappaleet;
    private ArrayList<Neste> nesteet;

    public Piirtoalusta() {
        this.nesteet = new ArrayList<Neste>();
        this.kappaleet = new ArrayList<PerusKappale>();
        this.voimat = new ArrayList<>();
        this.gravitaatiot = new ArrayList<>();
    }

    public void gravitaatioPaalla(boolean paalla) {
        if (paalla) {
            this.gravitaatioPaalla = true;
        } else {
            this.gravitaatioPaalla = false;
        }
    }
    
    

    public void lisaaNeste(Neste neste){
        /*
        tänne tarkistus raskaimmasta nesteestä, jotta selviää järjestys
        mikä päällimmäisenä jne.
        */
        this.nesteet.add(neste);
    }

    public void lisaaKappale(PerusKappale kappale) {
        voimat.add(new Maan_Vetovoima(kappale));
        voimat.add(new Kitkavoima(kappale));
        if (!kappaleet.isEmpty()) {
            for (PerusKappale k : kappaleet) {
                gravitaatiot.add(new Gravitaatio(k, kappale));
            }
        }
        kappaleet.add(kappale);
    }
    
    public void asetaHahmo(Hahmo h){
        this.hahmo = h;
    }

    public void voimatVaikuttavat() {
        if (gravitaatioPaalla) {
            for (Voima v : gravitaatiot) {
                v.vaikuta();
            }
        } else {
            for (Voima v : voimat) {
                v.vaikuta();
            }
        }

    }

    public void kappaleetLiikkuvat() {
        for (PerusKappale k : kappaleet) {
            k.liiku();
        }
    }

    public void poistaKappale() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        int pun = 0, vih = 255, sin = 126;
        super.paintComponent(g);
        hahmo.luo(g);
        for (PerusKappale k : kappaleet) {
            g.setColor(new Color(pun, vih, sin));
            k.luo(g);
            pun++;
            if(pun == 255){
                pun = 0;
            }
            sin--;
            if(sin == 0){
                sin = 200;
            }
            vih--;
            if(vih == 0){
                vih = 255;
            }
        }
    }

}
