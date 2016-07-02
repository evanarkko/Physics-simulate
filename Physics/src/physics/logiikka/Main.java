package physics.logiikka;

import physics.kappaleet.Pallo;
import javax.swing.SwingUtilities;
import physics.grafiikat.Kayttoliittyma;
import physics.grafiikat.Piirtoalusta;
import physics.kappaleet.Pelihahmo;
import physics.kappaleet.Kuutio;
import physics.kappaleet.Vihollinen;

public class Main {
    

    public static void main(String[] args) throws InterruptedException {
        Piirtoalusta piirtoalusta = new Piirtoalusta();
        Pelihahmo paahenkilo = new Pelihahmo(500, 350);
        piirtoalusta.lisaaVihollinen(new Vihollinen(700, 700));
        piirtoalusta.gravitaatioPaalla(false);
        
        
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(piirtoalusta, paahenkilo);
        SwingUtilities.invokeLater(kayttoliittyma);

        while (true) {
            Thread.sleep(20);
            piirtoalusta.voimatVaikuttavat();
            piirtoalusta.kappaleetLiikkuvat();
            piirtoalusta.repaint();
        }

    }

}
