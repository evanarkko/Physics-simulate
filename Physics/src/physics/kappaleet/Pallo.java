
package physics.kappaleet;

import java.awt.Color;
import java.awt.Graphics;
import physics.logiikka.Aine;


public class Pallo extends PerusKappale{
    private double sade;
    

    public Pallo(Aine aine, double tilavuusKuutioina) {
        super(aine, tilavuusKuutioina);
        sade = laskeSade(tilavuusKuutioina);    
    }

    public Pallo(double massa) {
        super(massa);
        tilavuusKuutioina = 1000;
        sade = laskeSade(tilavuusKuutioina);
    }
    
    private double laskeSade(double tilavuus){
        double r = (Math.cbrt((3*tilavuus)/4*Math.PI));
        return r;
    }
    
    private double laskeTilavuus(){//Kesken
        return 0;
    }

    @Override
    public void liiku() {
        super.liiku(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public void luo(Graphics graphics) {
        int pun = (int) (Math.random() * 255);
        int sin = 0;//(int) (Math.random() * 255);
        int vih = 0;//(int) (Math.random() * 255);
        graphics.setColor(new Color(pun, vih, sin));
        graphics.fillOval((int)x, (int)y, 2*(int)sade, 2*(int)sade);
    }
    
    
}
