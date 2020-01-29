package LesFigures;

import java.util.ArrayList;

public class Geometrie {

    private ArrayList<Figure> figures = new ArrayList<>();

    public void addFig(Figure fig){
        this.figures.add(fig);
    }

    public void showFigures(){
        for ( Figure afig: this.figures
             ) {
            System.out.println(afig);
        }
    }

    public void showFigures(String forme){
        for ( Figure afig: this.figures
        ) {
            if (afig.getClass().getSimpleName().equals(forme)){
                System.out.println(afig);
            }
            System.out.println(afig);
        }
    }

    public double totalAire(){
        double totaire = 0.0;
        for (Figure afig: this.figures
             ) {
            totaire += afig.getAire();
        }
        return totaire;
    }
}
