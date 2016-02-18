package physics.logiikka;

import physics.kappaleet.Pallo;
import javax.swing.SwingUtilities;
import physics.grafiikat.Kayttoliittyma;
import physics.grafiikat.Piirtoalusta;
import physics.kappaleet.Kuutio;

public class Main {

    public static void main(String[] args) {
        Piirtoalusta piirtoalusta = new Piirtoalusta();
        
        Pallo pallo1 = new Pallo(300.9);
        Pallo pallo2 = new Pallo(300.9);
        Pallo pallo3 = new Pallo(300.9);
        pallo2.asetaKoordinaatit(600, 370);
        pallo3.asetaKoordinaatit(800, 100);
        
        piirtoalusta.lisaaKappale(pallo1);
        piirtoalusta.lisaaKappale(pallo2);
        piirtoalusta.lisaaKappale(pallo3);
        
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(piirtoalusta);
        SwingUtilities.invokeLater(kayttoliittyma);
        
        
    }

}
