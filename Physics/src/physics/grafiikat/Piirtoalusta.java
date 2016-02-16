
package physics.grafiikat;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import physics.kappaleet.Kappale;


public class Piirtoalusta extends JPanel{
    private ArrayList<Kappale> kappaleet;

    public Piirtoalusta() {
        this.kappaleet = new ArrayList<Kappale>();
    }
    
    public void lisaaKappale(Kappale kappale){
        kappaleet.add(kappale);
    }
    
    public void kappaleetLiikkuvat(){
        for(Kappale k : kappaleet){
            k.liiku();
        }
    }
    
    public void poistaKappale(){
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(Kappale k : kappaleet){
            k.luo(g);
        }
    }
    
    
    
}
