package stuff;

import javax.swing.JLabel;
import java.awt.*;

//   Die Vitrine ist Teil der Ausstellung und stellt ein Schmuckstück dar.
public class Vitrine extends JLabel {

    private final Schmuck schmuck;

    public Vitrine(Schmuck schmuck) {
        this.schmuck = schmuck;
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2D = (Graphics2D)g;

        Dimension size = getSize();
        g2D.setColor(Color.RED);
        g2D.setStroke(new BasicStroke(5, 0, 1, 0, null, 0));
        g2D.drawRect(0, 0, size.width, size.height);
        g2D.setStroke(new BasicStroke(1, 0, 1, 0, null, 0));

        int yWert = 20;

        g2D.setColor(Color.BLACK);
        String bezeichnung = schmuck.getBezeichnung();
        int stringWidth = bezeichnung != null? g.getFontMetrics().stringWidth(bezeichnung): 0;
        g2D.drawString(bezeichnung != null? bezeichnung: "-", size.width/2 - stringWidth/2, yWert);
        g2D.drawLine(size.width/2 - stringWidth/2 - 10, 22, size.width/2 + stringWidth/2 + 10, yWert+2);

        yWert +=20;
        g2D.drawString("Katalognr.: " + schmuck.getKatalognummer(), 10, yWert);
        yWert+=15;
        g2D.drawString("Material: " + (schmuck.getMaterial() != null? schmuck.getMaterial(): "-"), 10, yWert);
        yWert+=15;
        g2D.drawString("Materialgewicht: " + schmuck.getMaterialGewicht() + " g", 10, yWert);
        yWert+=15;
        g2D.drawString("Edelsteine:", 10, yWert);

        if (schmuck.getVerbauteEdelsteine() == null || schmuck.getVerbauteEdelsteine().isEmpty()){
            yWert+=15;
            g2D.drawString(" - keine -", 20, yWert);
        }
        else{
            for (Edelstein edelstein : schmuck.getVerbauteEdelsteine()) {
                yWert+=15;
                int karat = edelstein.getGewichtInKarat();
                EdelsteinTyp typ = edelstein.getTyp();
                String edelsteinString = "- " + (typ != null? typ : "-" ) + ", " + karat + " Karat, " + edelstein.getWert() + " €";
                g2D.drawString(edelsteinString, 10, yWert);
                int edelWidth = g.getFontMetrics().stringWidth(edelsteinString);
                Color farbe = typ != null? typ.getFarbe(): null;
                if (farbe != null){
                    g2D.setColor(new Color(farbe.getRed(), farbe.getGreen(), farbe.getBlue(), 100));
                    int groesse = berechneGroesse(karat);
                    g2D.fillOval(edelWidth + 15, yWert-(groesse/2 + 5), groesse, groesse);
                    g2D.setColor(Color.BLACK);
                    g2D.drawOval(edelWidth + 15, yWert-(groesse/2 + 5), groesse, groesse);
                }
            }
        }
        yWert+=30;


        g2D.drawString("Gesamtwert: " + convert(schmuck.getGesamtwertInEuro()) + " €", 10, yWert);

    }

    private int berechneGroesse(int karat){
        if (karat <10){
            return 10;
        }
        if (karat < 25){
            return 15;
        }
        if (karat < 100){
            return 20;
        }
        return 25;
    }

    private String convert(int number){

        String numberString = "" + number;

        StringBuffer sb = new StringBuffer();
        while (numberString.length() > 3){
            sb.insert(0, numberString.substring(numberString.length()-3, numberString.length()));
            sb.insert(0, ".");
            numberString = numberString.substring(0, numberString.length()-3);
        }
        sb.insert(0, numberString);


       return sb.toString();
    }
}
