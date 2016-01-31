
package physics.logiikka;
import java.awt.Graphics;

public abstract class Kappale {
    double tilavuusKuutioina;
    double massaKiloina;
    Aine aine;
    int x = 100;
    int y = 100;

    public Kappale(Aine aine, double tilavuusKuutioina) {
        this.aine = aine;
        this.tilavuusKuutioina = tilavuusKuutioina;
        this.massaKiloina = this.aine.getTiheys() * this.tilavuusKuutioina;
    }

    public Kappale(double massa) {
        this.massaKiloina = massa;
        
    }
    
    public void liikuY(){
        y++;
    }
    
    private int laskemitat;
    
    
    public void luo(Graphics graphics){
        
    }
    
    
    
    
}
