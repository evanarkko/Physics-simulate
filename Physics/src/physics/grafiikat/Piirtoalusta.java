package physics.grafiikat;

import Voimat.Gravitaatio;
import Voimat.Voima;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import physics.kappaleet.Kappale;

public class Piirtoalusta extends JPanel {

    private ArrayList<Voima> voimat;
    private ArrayList<Kappale> kappaleet;

    public Piirtoalusta() {
        this.kappaleet = new ArrayList<Kappale>();
        this.voimat = new ArrayList<>();
    }

    public void lisaaKappale(Kappale kappale) {
        if (!kappaleet.isEmpty()) {
            for (Kappale k : kappaleet) {
                voimat.add(new Gravitaatio(k, kappale));
            }
        }
        kappaleet.add(kappale);
    }

    public void voimatVaikuttavat() {
        for (Voima v : voimat) {
            v.vaikuta();
        }
    }

    public void kappaleetLiikkuvat() {
        for (Kappale k : kappaleet) {
            k.liiku();
        }
    }

    public void poistaKappale() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        int pun = 200, vih = 100, sin = 150;
        super.paintComponent(g);
        for (Kappale k : kappaleet) {
            g.setColor(new Color(pun, vih, sin));
            k.luo(g);
            pun -= 100;
            sin += 50;
            vih += 100;
        }
    }

}
