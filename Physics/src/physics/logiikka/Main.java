package physics.logiikka;

import physics.kappaleet.Pallo;
import javax.swing.SwingUtilities;
import physics.grafiikat.Kayttoliittyma;
import physics.grafiikat.Piirtoalusta;
import physics.kappaleet.Kuutio;

public class Main {

    public static void main(String[] args) {
        Piirtoalusta piirtoalusta = new Piirtoalusta();
        
        Pallo pallo1 = new Pallo(2300.9);
        pallo1.kiihdytaX(2);
        Pallo pallo2 = new Pallo(2800.9);
        pallo2.asetaKoordinaatit(400, 400);
        
        piirtoalusta.lisaaKappale(pallo1);
        piirtoalusta.lisaaKappale(pallo2);
        
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(piirtoalusta);
        SwingUtilities.invokeLater(kayttoliittyma);
        
        
    }

}
