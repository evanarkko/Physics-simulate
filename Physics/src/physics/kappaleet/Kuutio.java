
package physics.kappaleet;

import java.awt.Graphics;
import physics.logiikka.Aine;

/**
 *
 * @author eamiller
 */
public class Kuutio extends Kappale{
    private double sivu;
    

    public Kuutio(Aine aine, double sivu) {
        super(aine, Math.pow(sivu, 3));
        this.sivu = sivu;
    }

    @Override
    public void luo(Graphics graphics) {
        graphics.fillRect((int)sivu,(int)sivu,(int)sivu,(int)sivu);
    }
    
    
    
    
}
