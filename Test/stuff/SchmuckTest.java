package stuff;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class SchmuckTest {

    @Test
    public void getBezeichnung() {

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        for (Schmuck schmuck : schatz) {
            Assert.assertNotNull("Die Bezeichnung von " + schmuck.getClass().getName() + " ist null", schmuck.getBezeichnung());
        }
    }

    @Test
    public void getMaterial() {

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        for (Schmuck schmuck : schatz) {
            Material material = schmuck.getMaterial();
            assertNotNull("Bei " + schmuck.getClass().getName() + " ist Material null", material);

        }

    }

    @Test
    public void edelsteineGetWert() {

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();
        for (Schmuck schmuck : schatz) {
            for(Edelstein edelstein : schmuck.getVerbauteEdelsteine()){

                Assert.assertTrue("Der Edelstein " + edelstein.getClass().getName() + " ist Wertlos",edelstein.getWert() > 0);

            }
        }

    }


    @Test
    public void getKatalognummer() {
        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        for (Schmuck schmuck : schatz) {
            int katalognummer = schmuck.getKatalognummer();
            Assert.assertTrue("Die Katalognummer von " + schmuck.getClass().getName() + " ist negativ: " + katalognummer, katalognummer >= 0);
        }

        Assert.assertTrue("Die Katalognummern sind nicht eindeutig.", KatalogNummerVergleich(schatz));
    }
    private boolean KatalogNummerVergleich(Collection<Schmuck> schatz) {
        for (Schmuck schmuck1 : schatz) {
            int katalognummer1 = schmuck1.getKatalognummer();

            for (Schmuck schmuck2 : schatz) {
                if (schmuck1 != schmuck2) {
                    int katalognummer2 = schmuck2.getKatalognummer();

                    if (katalognummer1 == katalognummer2) {
                        return false; // Es gibt eine nicht-eindeutige Katalognummer.
                    }
                }
            }
        }

        return true; // Alle Katalognummern sind eindeutig.
    }
}
