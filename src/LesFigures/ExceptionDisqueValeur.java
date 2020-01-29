package LesFigures;

public class ExceptionDisqueValeur extends Exception {
    public ExceptionDisqueValeur(){
        super("Vous devez saisir un rayon strictement supérieur à 0 !");
    }
}
