package LesFigures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GeometryLoader {


    private String[] CSVdata;
    private Geometrie lesfigs = new Geometrie();
    private static final String CSV_SPLIT = ";";

    public GeometryLoader(String CSVfile) {
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(CSVfile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                this.CSVdata = line.split(CSV_SPLIT);
                if (this.CSVdata[0].equals("RECTANGLE")){
                    this.lesfigs.addFig(new Rectangle(Integer.parseInt(this.CSVdata[1]),Integer.parseInt(this.CSVdata[2])));
                }

                if (this.CSVdata[0].equals("DISQUE")){
                    this.lesfigs.addFig(new Disque(Integer.parseInt(this.CSVdata[1])));
                }
            }

        } catch (IOException | ExceptionRectangleNegative | ExceptionDisqueValeur e) {
            e.printStackTrace();
        }
    }

    public String[] getCSVdata() {
        return CSVdata;
    }

    public void setCSVdata(String[] CSVdata) {
        this.CSVdata = CSVdata;
    }

    public static String getCsvSplit() {
        return CSV_SPLIT;
    }

    public Geometrie getLesfigs() {
        return lesfigs;
    }

    public void setLesfigs(Geometrie lesfigs) {
        this.lesfigs = lesfigs;
    }
}
