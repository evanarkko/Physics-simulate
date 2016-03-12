package physics.grafiikat;


import java.awt.Container;
import java.awt.Dimension;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import physics.kappaleet.Pallo;

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
        container.add(piirtoalusta);
    }

    public JFrame getFrame() {
        return frame;
    }

}
