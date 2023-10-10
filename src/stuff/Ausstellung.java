package stuff;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.util.Collection;

// Wird benötigt, um die Ausstellung anzuzeigen.
public class Ausstellung {


    public static void main(String[] args) {
        new Ausstellung();
    }


    public Ausstellung() {

        JFrame fenster = new JFrame();

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        double sqrt = Math.sqrt(schatz.size());
        fenster.setLayout(new GridLayout((int)sqrt, (int)sqrt));

        for (Schmuck schmuck : schatz) {
            fenster.add(new Vitrine(schmuck));
        }

        fenster.setSize(600, 600);
        fenster.setVisible(true);

    }
}
