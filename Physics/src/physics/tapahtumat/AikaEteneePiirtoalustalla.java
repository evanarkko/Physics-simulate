/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physics.tapahtumat;

import java.util.TimerTask;
import physics.grafiikat.Piirtoalusta;

/**
 *
 * @author eamiller
 */
public class AikaEteneePiirtoalustalla extends TimerTask{
    private Piirtoalusta piirtoalusta;
    
    public AikaEteneePiirtoalustalla(Piirtoalusta piirtoalusta){
        this.piirtoalusta = piirtoalusta;
    }
    
    @Override
    public void run() {
        piirtoalusta.palloLiikkuu();
        piirtoalusta.repaint();
    }
    
}
