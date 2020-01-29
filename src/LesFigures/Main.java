package LesFigures;

public class Main {
    public static void main(String[] args) throws ExceptionRectangleNegative, ExceptionDisqueValeur {
        Rectangle rect = new Rectangle(12, 4);
        Disque disq = new Disque(1);
        Geometrie desfigs = new Geometrie();
        desfigs.addFig(rect);
        desfigs.addFig(disq);
        desfigs.showFigures("Disque");
        desfigs.showFigures("Rectangle");
        desfigs.showFigures();
        GeometryLoader geocsv = new GeometryLoader("/home/thibault/B3_EPSI/B3_JAVA/TP_rendre_2/src/file.csv");
        geocsv.getLesfigs().showFigures();
        System.out.println(desfigs.totalAire());
    }
}
