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

    }

    @Test
    public void gesamtWertTest(){
        Collection<Schmuck> schatz = Schatztruhe.getSchatz();
        for (Schmuck schmuck : schatz) {
            int i = 0;

            for(Edelstein edelstein : schmuck.getVerbauteEdelsteine()){//rechnet den Wert aller Edelsteine zusammen
                i += edelstein.getWert();
            }
            i += schmuck.getMaterial().getPreisProGramm()* schmuck.getMaterialGewicht();//rechnet das materialgewicht drauf

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
}