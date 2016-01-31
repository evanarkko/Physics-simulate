
package physics.grafiikat;

import java.util.Timer;
import java.awt.Container;
import java.awt.Dimension;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import physics.logiikka.Pallo;
import physics.tapahtumat.LiikuY;


public class Kayttoliittyma implements Runnable{

    private JFrame frame;
    private Pallo pallo;

    public Kayttoliittyma(Piirtoalusta piirtoalusta, Pallo pallo) {
        this.pallo = pallo;
    }

    @Override
    public void run() {
        frame = new JFrame("Physics");
        frame.setPreferredSize(new Dimension(1200, 700));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
        
        
    }

    private void luoKomponentit(Container container) {
        Piirtoalusta piirtoalusta = new Piirtoalusta(pallo);
        container.add(piirtoalusta);
        
        Timer timer = new Timer();
        TimerTask liikuY = new LiikuY(pallo, piirtoalusta);
       
        
        timer.scheduleAtFixedRate(liikuY, 0, 150);
        
    }

    public JFrame getFrame() {
        return frame;
    }
    
}
