
package physics.kappaleet;

import java.awt.Color;
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
        sivu = 25;
        tilavuusKuutioina = Math.pow(sivu, 3);
        this.kimmoisuus = 0;
    }
    
    

    @Override
    public void luo(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect((int)x,(int)y,(int)sivu,(int)sivu);
    }

    @Override
    public void liiku() {
        super.liiku(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
