
package physics.logiikka;
import java.awt.Graphics;

public abstract class Kappale {
    private double tilavuusKuutioina;
    private double massaKiloina;
    private Aine aine;
    private int sijaintiX = 0;
    private int sijaintiY = 0;

    public Kappale(Aine aine, double tilavuusKuutioina) {
        this.aine = aine;
        this.tilavuusKuutioina = tilavuusKuutioina;
        this.massaKiloina = this.aine.getTiheys() * this.tilavuusKuutioina;
    }

    public Kappale(double massa) {
        this.massaKiloina = massa;
    }
    
    
    public void luo(Graphics graphics){
        
    }
    
    
    
    
}
