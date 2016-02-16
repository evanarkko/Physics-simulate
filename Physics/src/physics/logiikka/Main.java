package physics.logiikka;

import physics.kappaleet.Pallo;
import javax.swing.SwingUtilities;
import physics.grafiikat.Kayttoliittyma;
import physics.grafiikat.Piirtoalusta;
import physics.kappaleet.Kuutio;

public class Main {

    public static void main(String[] args) {
        Piirtoalusta piirtoalusta = new Piirtoalusta();
        
        Kuutio kuutio = new Kuutio(1);
        piirtoalusta.lisaaKappale(kuutio);
        Pallo pallo = new Pallo(1);
        pallo.asetaKoordinaatit(200, 0);
        piirtoalusta.lisaaKappale(pallo);
        
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(piirtoalusta);
        SwingUtilities.invokeLater(kayttoliittyma);
        
        
    }

}
