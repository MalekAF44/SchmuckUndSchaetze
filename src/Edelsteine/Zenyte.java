package Edelsteine;

import stuff.Edelstein;
import stuff.EdelsteinTyp;

public class Zenyte implements Edelstein {
    @Override
    public int getGewichtInKarat() {
        return 60;
    }

    @Override
    public EdelsteinTyp getTyp() {
        return EdelsteinTyp.RUBIN;
    }

    @Override
    public int getWert() {
        return 8700000;
    }
}
