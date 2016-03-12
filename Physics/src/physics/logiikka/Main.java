package physics.logiikka;

import physics.kappaleet.Pallo;
import javax.swing.SwingUtilities;
import physics.grafiikat.Kayttoliittyma;
import physics.grafiikat.Piirtoalusta;
import physics.kappaleet.Kuutio;

public class Main {
    

    public static void main(String[] args) throws InterruptedException {
        Piirtoalusta piirtoalusta = new Piirtoalusta();
        
        Kuutio pallo1 = new Kuutio(3.9);
        Pallo pallo2 = new Pallo(300.9);
        Pallo pallo3 = new Pallo(0.003);
        
        pallo1.asetaKoordinaatit(500, 100);
        pallo2.asetaKoordinaatit(500, 300);
        pallo3.asetaKoordinaatit(500, 150);
        
        pallo1.kiihdytaX(3);
        pallo3.kiihdytaX(4);
        
        piirtoalusta.lisaaKappale(pallo1);
        piirtoalusta.lisaaKappale(pallo2);
        piirtoalusta.lisaaKappale(pallo3);
        piirtoalusta.gravitaatioPaalla(true);
        
        
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(piirtoalusta);
        SwingUtilities.invokeLater(kayttoliittyma);

        while (true) {
            Thread.sleep(20);
            piirtoalusta.voimatVaikuttavat();
            piirtoalusta.kappaleetLiikkuvat();
            piirtoalusta.repaint();
        }

    }

}
