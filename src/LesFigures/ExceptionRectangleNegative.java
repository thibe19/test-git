package LesFigures;

public class ExceptionRectangleNegative extends Exception {
    public ExceptionRectangleNegative(){
        super("Vous ne pouvez pas saisir de valeurs négatives !");
    }
}
