package physics.grafiikat;

import java.util.Timer;
import java.awt.Container;
import java.awt.Dimension;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import physics.kappaleet.Pallo;
import physics.tapahtumat.AikaEteneePiirtoalustalla;

public class Kayttoliittyma implements Runnable {
    private Piirtoalusta piirtoalusta;
    private JFrame frame;
    private Pallo pallo;

    public Kayttoliittyma(Piirtoalusta piirtoalusta) {
        this.piirtoalusta = piirtoalusta;
    }

    @Override
    public void run() {
        frame = new JFrame("Physics");
        frame.setPreferredSize(new Dimension(1310, 730));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    private void luoKomponentit(Container container) {
        AikaEteneePiirtoalustalla aikaEtenee = new AikaEteneePiirtoalustalla(piirtoalusta);
        container.add(piirtoalusta);
        Timer timer = new Timer();
        
        timer.scheduleAtFixedRate(aikaEtenee, 0, 1);
    }

    public JFrame getFrame() {
        return frame;
    }

}
