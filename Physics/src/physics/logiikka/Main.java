package physics.logiikka;

import javax.swing.SwingUtilities;
import physics.grafiikat.Kayttoliittyma;
import physics.grafiikat.Piirtoalusta;

public class Main {

    public static void main(String[] args) {
        Pallo pallo = new Pallo(30);
        Piirtoalusta piirtoalusta = new Piirtoalusta(pallo);
        
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(piirtoalusta, pallo);
        SwingUtilities.invokeLater(kayttoliittyma);
        
        
    }

}
