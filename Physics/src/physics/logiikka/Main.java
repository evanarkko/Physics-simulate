package physics.logiikka;

import physics.kappaleet.Pallo;
import javax.swing.SwingUtilities;
import physics.grafiikat.Kayttoliittyma;
import physics.grafiikat.Piirtoalusta;

public class Main {

    public static void main(String[] args) {
        Pallo pallo = new Pallo(1);
        Piirtoalusta piirtoalusta = new Piirtoalusta();
        piirtoalusta.lisaaKappale(pallo);
        
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(piirtoalusta, pallo);
        SwingUtilities.invokeLater(kayttoliittyma);
        
        
    }

}
