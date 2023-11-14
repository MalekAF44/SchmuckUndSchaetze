package stuff;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class SchmuckTest {
    private String listToString(ArrayList<Schmuck> fehler){
        StringBuilder ausgabe = new StringBuilder();
        for (Schmuck schmuck:fehler) {
            ausgabe.append(" ").append(schmuck.getClass().getName()).append(", ");
        }
        return ausgabe.toString();
    }
    private String listToStringEdel(ArrayList<Edelstein> fehler){
        StringBuilder ausgabe = new StringBuilder();
        for (Edelstein edelstein:fehler) {
            ausgabe.append(" ").append(edelstein.getClass().getName()).append(", ");
        }
        return ausgabe.toString();
    }

    @Test
    public void getBezeichnungNull() {

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        ArrayList<Schmuck> fehler = new ArrayList<>();
        for (Schmuck schmuck : schatz) {
            if (schmuck.getBezeichnung() == null){
                fehler.add(schmuck);
            }

        }
        Assert.assertTrue("die folgenden Schmuckstücke haben als Bezeichnung Null: "+ listToString(fehler),fehler.isEmpty());
    }

    @Test
    public void getBezeichnungZuKurz() {

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        ArrayList<Schmuck> fehlerLen = new ArrayList<>();
        for (Schmuck schmuck : schatz) {

            if (schmuck.getBezeichnung() != null && schmuck.getBezeichnung().length() < 3){
                fehlerLen.add(schmuck);
            }

        }
        Assert.assertTrue("Die bezeichnung bei" + listToString(fehlerLen) + "hat/haben zu wenige Zeichen: ",fehlerLen.isEmpty());
    }

    @Test
    public void getMaterial() {

        ArrayList<Schmuck> fehler = new ArrayList<>();
        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        for (Schmuck schmuck : schatz) {


            if(schmuck.getMaterial() == null){
                fehler.add(schmuck);
            }

        }
        assertTrue("Bei " + listToString(fehler) + " ist Material null", fehler.isEmpty());


    }
    @Test
    public void edelsteineGetGewichtNotNull() {

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();
        ArrayList<Schmuck> fehler = new ArrayList<>();
        for (Schmuck schmuck : schatz) {
            if(schmuck.getVerbauteEdelsteine() == null){
                fehler.add(schmuck);
            }
        }
        Assert.assertTrue("verbaute Edelsteine sind null in:" + listToString(fehler), fehler.isEmpty());

    }
    @Test
    public void edelsteineGetGewichtslos() {

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();
        ArrayList<Edelstein> fehler = new ArrayList<>();

        for (Schmuck schmuck : schatz) {
            if(schmuck.getVerbauteEdelsteine() != null&&!schmuck.getVerbauteEdelsteine().isEmpty()) {
                for (Edelstein edelstein : schmuck.getVerbauteEdelsteine()) {
                    if(edelstein.getGewichtInKarat() < 0){
                        fehler.add(edelstein);
                    }
                }
            }
            Assert.assertTrue("Der Edelstein " + listToStringEdel(fehler) + " ist gewichtslos", fehler.isEmpty());
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


        Assert.assertTrue("Der Schmuck " + schmuck.getClass().getName() + " ist nicht richtig: Erwartet wurde " + i + ", aber es war: " + schmuck.getGesamtwertInEuro(),i == schmuck.getGesamtwertInEuro());

        }
    }


//    @Test
//    public void edelsteineGetWert() {
//
//        Collection<Schmuck> schatz = Schatztruhe.getSchatz();
//        for (Schmuck schmuck : schatz) {
//            for(Edelstein edelstein : schmuck.getVerbauteEdelsteine()){
//
//                Assert.assertTrue("Der Edelstein " + edelstein.getClass().getName() + " ist Wertlos",edelstein.getWert() > 0);
//
//            }
//        }
//
//    }

    public void edelsteineGetWert() {

        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        for (Schmuck schmuck : schatz) {
            for (Edelstein edelstein : schmuck.getVerbauteEdelsteine()) {

                // edelstein.getWert() nicht null ist und größer als 0 ist.
                Assert.assertNotNull("Der Edelstein ist null", edelstein);
                Assert.assertTrue("Der Edelstein " + edelstein.getClass().getName() + " ist wertlos", edelstein.getWert() > 0);

            }
        }
    }




    @Test
    public void getMaterialGewicht() {
        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        for (Schmuck schmuck : schatz) {
            int materialGewicht = schmuck.getMaterialGewicht();
            Assert.assertTrue("Bei " + schmuck.getClass().getName() + " ist das Gewicht vom Material keine positive Zahl", materialGewicht > 0);
        }
    }


        @Test
    public void getKatalognummer() {
        Collection<Schmuck> schatz = Schatztruhe.getSchatz();

        for (Schmuck schmuck : schatz) {
            int katalognummer = schmuck.getKatalognummer();
            Assert.assertTrue("Die Katalognummer von " + schmuck.getClass().getName() + " ist negativ: " + katalognummer, katalognummer >= 0);
        }

        Assert.assertTrue("Die Katalognummer gibt es bereits.", KatalogNummerVergleich(schatz));

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