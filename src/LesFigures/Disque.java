package LesFigures;

public class Disque extends Figure {

    private int rayon;

    public Disque(int rayon) throws ExceptionDisqueValeur {
        if (rayon <= 0){
            throw new ExceptionDisqueValeur();
        }
        this.rayon = rayon;
    }

    @Override
    public double getPerimetre() {
        return 2 * Math.PI * this.rayon;
    }

    @Override
    public double getAire() {
        return Math.PI * Math.pow(this.rayon, 2);
    }

    @Override
    public String toString() {
        return ("Ex1.Disque de rayon  " + this.rayon);
    }
}
