package physics.grafiikat;

import physics.Voimat.Gravitaatio;
import physics.Voimat.Kitkavoima;
import physics.Voimat.Maan_Vetovoima;
import physics.Voimat.Voima;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import physics.kappaleet.Pelihahmo;
import physics.kappaleet.PerusKappale;
import physics.kappaleet.Neste;
import physics.kappaleet.Vihollinen;

public class Piirtoalusta extends JPanel {

    private Pelihahmo hahmo;
    private boolean gravitaatioPaalla;
    private ArrayList<Vihollinen> viholliset;
    private ArrayList<Voima> voimat;
    private ArrayList<Voima> gravitaatiot;
    private ArrayList<PerusKappale> kappaleet;
    private ArrayList<Neste> nesteet;

    public Piirtoalusta() {
        this.nesteet = new ArrayList<Neste>();
        this.kappaleet = new ArrayList<PerusKappale>();
        this.voimat = new ArrayList<>();
        this.gravitaatiot = new ArrayList<>();
        this.viholliset = new ArrayList<>();
    }

    public void gravitaatioPaalla(boolean paalla) {
        if (paalla) {
            this.gravitaatioPaalla = true;
        } else {
            this.gravitaatioPaalla = false;
        }
    }
    
    public void lisaaVihollinen(Vihollinen v){
        this.viholliset.add(v);
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
    
    public void asetaHahmo(Pelihahmo h){
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
        super.paintComponent(g);
        hahmo.luo(g);
        for(Vihollinen v : viholliset){
            v.luo(g);
        }
        for (PerusKappale k : kappaleet) {
            k.luo(g);
        }
    }

}
