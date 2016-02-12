
package physics.kappaleet;
import java.awt.Graphics;
import physics.logiikka.Aine;

public abstract class Kappale {
    double tilavuusKuutioina;
    double massaKiloina;
    Aine aine;
    double x = 100;
    double y = 100;
    double nopeusX = 0.21;
    double nopeusY = 0.21;

    public Kappale(Aine aine, double tilavuusKuutioina) {
        this.aine = aine;
        this.tilavuusKuutioina = tilavuusKuutioina;
        this.massaKiloina = this.aine.getTiheys() * this.tilavuusKuutioina;
    }

    public Kappale(double massa) {
        this.massaKiloina = massa;
    }
    
    public void asetaKoordinaatit(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void liiku(){
        if(y > 671 || y < 0){
            nopeusY *= (-1);
        }
        if(x > 1270 || x < 0){
            nopeusX *= (-1);
        }
        
        y += nopeusY;
        x += nopeusX;
    }
    
    private int laskemitat;
    
    
    public void luo(Graphics graphics){
        
    }
    
}


    