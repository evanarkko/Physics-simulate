
package physics.kappaleet;

import java.awt.Graphics;
import physics.logiikka.Aine;

/**
 *
 * @author eamiller
 */
public class Kuutio extends PerusKappale{
    private double sivu;
    

    public Kuutio(Aine aine, double sivu) {
        super(aine, Math.pow(sivu, 3));
        this.sivu = sivu;
    }

    public Kuutio(double massa) {
        super(massa);
        tilavuusKuutioina = 2000;
        sivu = Math.cbrt(2000);
    }
    
    

    @Override
    public void luo(Graphics graphics) {
        graphics.fill3DRect((int)x,(int)y,(int)sivu,(int)sivu, true);
    }

    @Override
    public void liiku() {
        super.liiku(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
