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
}