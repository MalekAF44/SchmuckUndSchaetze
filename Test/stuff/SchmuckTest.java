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
            Assert.assertTrue("Die bezeichnung bei" + schmuck.getClass().getName() + "hat zu wenige Zeichen",schmuck.getBezeichnung().length() > 3);
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
    public void edelsteineGetGewicht() {

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        for (Schmuck schmuck : schatz) {
            Assert.assertNotNull("verbaute Edelsteine sind null in " + schmuck.getBezeichnung(), schmuck.getVerbauteEdelsteine());

            if(!schmuck.getVerbauteEdelsteine().isEmpty()) {
                for (Edelstein edelstein : schmuck.getVerbauteEdelsteine()) {

                    Assert.assertTrue("Der Edelstein " + edelstein.getClass().getName() + " ist gewichtslos", edelstein.getGewichtInKarat() > 0);

                }
            }
        }

    }

    @Test
    public void gesamtWertTest(){
        Collection<Schmuck> schatz = Schatztruhe.getSchatz();
        for (Schmuck schmuck : schatz) {
            int i = 0;
            Assert.assertNotNull("Die edelsteine in " + schmuck.getBezeichnung() + " sind Null und nicht 0!", schmuck.getVerbauteEdelsteine());
                for (Edelstein edelstein : schmuck.getVerbauteEdelsteine()) {//rechnet den Wert aller Edelsteine zusammen
                    i += edelstein.getWert();
                }
                i += schmuck.getMaterial().getPreisProGramm() * schmuck.getMaterialGewicht();//rechnet das materialgewicht drauf


        Assert.assertTrue("Der Schmuck " + schmuck.getClass().getName() + " ist nicht richtig",i == schmuck.getGesamtwertInEuro());

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
                if (!schmuck1.equals(schmuck2)) {
                    int katalognummer2 = schmuck2.getKatalognummer();

                    if (katalognummer1 == katalognummer2) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    @Test
    public void getGesamtwertInEuro() {
        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        // durchlaufe alle Schmuckstücke
        for (Schmuck schmuck : schatz) {

            // Ruft Methode getGesamtwertInEuro für das aktuelle Schmuckstück auf
            int gesamtwertInEuro = schmuck.getGesamtwertInEuro();

            // überprüfe, ob Gesamtwert mindestens 1000 € beträgt
            Assert.assertTrue("Der Gesamtwert von " + schmuck.getClass().getName() + " ist negativ oder zu niedrig: " + gesamtwertInEuro, gesamtwertInEuro >= 1000);

            // +berprüfe, ob Gesamtwert nicht mehr als 10mio € beträgt
            Assert.assertTrue("Der Gesamtwert von " + schmuck.getClass().getName() + " ist zu hoch: " + gesamtwertInEuro, gesamtwertInEuro <= 10000000);
        }
    }


}