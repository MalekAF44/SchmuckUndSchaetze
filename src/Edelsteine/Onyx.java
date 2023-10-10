package Edelsteine;

import stuff.Edelstein;
import stuff.EdelsteinTyp;

public class Onyx implements Edelstein {
    @Override
    public int getGewichtInKarat() {
        return 2;
    }

    @Override
    public EdelsteinTyp getTyp() {
        return EdelsteinTyp.DIAMANT;
    }

    @Override
    public int getWert() {
        return 0;
    }
}
