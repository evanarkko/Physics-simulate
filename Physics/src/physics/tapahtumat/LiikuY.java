
package physics.tapahtumat;

import java.awt.Component;
import java.util.TimerTask;
import physics.logiikka.Kappale;


public class LiikuY extends TimerTask{
    Kappale liikkuja;
    Component component;
    
    public LiikuY(Kappale kappale, Component component){
        super();
        liikkuja = kappale;
        this.component = component;
    }
    
   

    @Override
    public void run() {
        liikkuja.liikuY();
        component.repaint();
    }
    
}
