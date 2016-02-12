package physics.logiikka;

public class Aine {
    private double tiheys;
    private Olomuoto olomuoto;//relevantti??

    public Aine(int tiheys, Olomuoto olomuoto) {
        this.tiheys = tiheys;
        this.olomuoto = olomuoto;
    }
    
    public Aine() {
    }

    public void setTiheys(int tiheys) {
        this.tiheys = tiheys;
    }
    
    

    public double getTiheys() {
        return tiheys;
    }
    
    
}
