package stuff;

public interface Edelstein {

    /**
     * Das Gewicht des Edelsteins in Karat (ein Karat entspricht ca. 0.2g).
     * @return Sinnvoll sind nur Werte zwischen 1 und 3000
     */
    public int getGewichtInKarat();


    /**
     * Hier muss der Typ des Edelsteins zurück gegeben werden.
     * @return ein Wert der entsprechenden enum. Darf nicht null sein.
     */
    public EdelsteinTyp getTyp();

    /**
     * Der Wert des Edelsteins in Euro.
     * @return darf nicht null sein. Als einzig negative Zahl ist die -1 erlaubt, die darauf hindeutet, dass der Wert
     * nicht bestimmt werden kann (somit kann auch der Preis des Schmuckstücks, in welchem dieser Stein steckt, nicht
     * ermittelt werden).
     */
    public int getWert();
}
