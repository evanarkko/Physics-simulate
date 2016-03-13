
package physics.kappaleet;

import java.awt.Graphics;

/**
 *
 * @author eamiller
 */
public class Hahmo {
    int x;
    int y;
    int menosuunta;

    public Hahmo(int x, int y) {
        this.x = x;
        this.y = y;
        menosuunta = 1;
    }
    
    public void siirry(int x, int y){
        this.x += x;
        this.y += y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setMenosuunta(int menosuunta) {
        this.menosuunta = menosuunta;
    }

    public int getMenosuunta() {
        return menosuunta;
    }
    
    
    
    
    public void luo(Graphics g){
        g.drawLine(x+30, y+30, x-20, y-20);
        g.drawLine(x-20, y+30, x+40, y-20);
        g.fillOval(x-4, y-4, 20, 20);
        if(menosuunta == 1){
            g.fillOval(x+10, y-4, 15, 10);
        }else{
            g.fillOval(x-14, y-4, 15, 10);
        }
    }
    
}
