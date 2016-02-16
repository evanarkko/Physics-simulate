package physics.logiikka;

import physics.kappaleet.Pallo;
import javax.swing.SwingUtilities;
import physics.grafiikat.Kayttoliittyma;
import physics.grafiikat.Piirtoalusta;
import physics.kappaleet.Kuutio;

public class Main {

    public static void main(String[] args) {
        Pallo pallo = new Pallo(1);
        Kuutio kuutio = new Kuutio(1);
        Piirtoalusta piirtoalusta = new Piirtoalusta();
        piirtoalusta.lisaaKappale(kuutio);
        piirtoalusta.lisaaKappale(pallo);
        
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(piirtoalusta);
        SwingUtilities.invokeLater(kayttoliittyma);
        
        
    }

}
