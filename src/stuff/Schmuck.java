package stuff;

import java.util.Collection;

/**
 * Verschiedene Wertgegenstände können dieses Interface implementieren, um Teil des Programms zu werden.
 * Die unitTests benutzen dieses Interface, um bereits vor der Erstellung der eigentlichen stuff.Schmuck-Klassen
 * geschrieben werden zu können.
 */
public interface Schmuck {

    /**
     * Die korrekte Bezeichnung des Gegenstandes wird hier zurück gegeben
     * @return darf nicht null sein und sollte mindestens aus drei Zeichen (Buchstaben) bestehen.
     */
    public String getBezeichnung();

    /**
     * Gibt Auskunft über das stuff.Material, aus welchem der stuff.Schmuck besteht.
     * @return ein Wert der entsprechenden Enumeration (nicht null).
     */
    public Material getMaterial();

    /**
     * Zum Feststellen des Gewichts des Materials in Gramm.
     * @return eine positive ganze Zahl.
     */
    public int getMaterialGewicht();

    /**
     * Die eindeutige Identifikationsnummer, mit deren Hilfe man sich in unserem Museumskatalog jedes Artefakt
     * heraussuchen kann.
     * @return eine positive ganze Zahl. Sollte im Katalog einmalig sein.
     */
    public int getKatalognummer();

    /**
     * Zu benutzen, wenn man die Edelsteine, die in diesem Schmuckstück verbaut wurden, untersuchen möchte.
     * @return Eine Sammlung von Edelsteinen, die zwar leer, aber nicht null sein darf.
     */
    public Collection<Edelstein> getVerbauteEdelsteine();

    /**
     * Der Preis des Ausstellungsstücks in Euro (Cent-Beträge sind bei so großen Summen nicht wichtig).
     * @return eine positive ganze Zahl, deren Wert nicht unter 1000 €liegen sollte. Und auch nicht über
     * 10 Million €, denn sowas dürfen wir nicht ausstellen, deckt unsere Versicherung nicht ab.
     * Der Gesamtwert des Gegenstands berechnet sich aus dem Wert des Materials und der evtl. enthaltenen Edelsteine.
     */
    public int getGesamtwertInEuro();
}
