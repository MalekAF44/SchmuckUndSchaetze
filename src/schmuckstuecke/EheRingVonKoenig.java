package schmuckstuecke;

import stuff.Edelstein;
import stuff.EdelsteinTyp;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EheRingVonKoenig implements Schmuck {


    @Override
    public String getBezeichnung() {
        return "Der Ring des Königs von Spanien, den er von seiner 3. Ehefrau bekommen hat";
    }

    @Override
    public Material getMaterial() {
        return Material.BLECH;
    }

    @Override
    public int getMaterialGewicht() {
        return 500;
    }

    @Override
    public int getKatalognummer() {
        return 546474;
    }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {
        Edelstein stein1 = new Edelstein() {
            @Override
            public int getGewichtInKarat() {
                return 5;
            }

            @Override
            public EdelsteinTyp getTyp() {
                return EdelsteinTyp.DIAMANT;
            }

            @Override
            public int getWert() {
                return 500;
            }
        };
        Edelstein stein2 = new Edelstein() {
            @Override
            public int getGewichtInKarat() {
                return 50;
            }

            @Override
            public EdelsteinTyp getTyp() {
                return EdelsteinTyp.AMETHYST;
            }

            @Override
            public int getWert() {
                return 5000;
            }
        };

        ArrayList<Edelstein> edelsteins = new ArrayList<>();
        edelsteins.add(stein1);
        edelsteins.add(stein2);

        return edelsteins;




    }

    @Override
    public int getGesamtwertInEuro() {

        return 50000;
    }
}
