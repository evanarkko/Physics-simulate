
package physics.grafiikat;

import java.awt.Graphics;
import javax.swing.JPanel;
import physics.logiikka.Kappale;


public class Piirtoalusta extends JPanel{
    Kappale kappale;

    public Piirtoalusta(Kappale kappale) {
        this.kappale = kappale;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        kappale.luo(g);
    }
    
    
    
}
