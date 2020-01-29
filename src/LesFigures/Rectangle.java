package LesFigures;

public class Rectangle extends Figure{
    private int longueur;
    private int largeur;

    public Rectangle(int longueur, int largeur) throws ExceptionRectangleNegative {
        if (longueur<0 || largeur<0){
            throw new ExceptionRectangleNegative();
        }
        this.longueur = longueur;
        this.largeur = largeur;
    }


    @Override
    public double getPerimetre() {
        return (double) (this.longueur + this.largeur) * 2;
    }

    @Override
    public double getAire() {
        return (double) this.longueur * this.longueur;
    }

    @Override
    public String toString() {
        return ("Rectangle de longueur " + this.longueur + " et de largeur " + this.largeur);
    }
}
