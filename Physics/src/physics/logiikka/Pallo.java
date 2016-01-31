
package physics.logiikka;

import java.awt.Graphics;


public class Pallo extends Kappale{
    

    public Pallo(Aine aine, double tilavuusKuutioina) {
        super(aine, tilavuusKuutioina);
    }

    public Pallo(double massa) {
        super(massa);
        tilavuusKuutioina = 33510;
    }
    
    private double laskeSade(double tilavuus){
        double r = (Math.cbrt((3*tilavuus)/4*Math.PI));
        return r;
    }

    @Override
    public void luo(Graphics graphics) {
        int r = (int) laskeSade(this.tilavuusKuutioina);
        graphics.fillOval(x, y, 2*r, 2*r);
    }
    
    
}
