package schmuckstuecke;

import stuff.Edelstein;
import stuff.EdelsteinTyp;

public class Halskette implements Edelstein {
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
        return 4000;
    }
}
