package Edelsteine;

import stuff.Edelstein;
import stuff.EdelsteinTyp;

public class titanium implements Edelstein {
    @Override
    public int getGewichtInKarat() {
        return 700;
    }

    @Override
    public EdelsteinTyp getTyp() {
        return EdelsteinTyp.AMETHYST;
    }

    @Override
    public int getWert() {
        return 444444;
    }
}
