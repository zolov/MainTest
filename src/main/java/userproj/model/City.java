package userproj.model;

/**
 * City.
 *
 * @author Igor_Zolov
 */
public enum City {
    MSC("Moscow"),
    SPB("Saint-peterburg"),
    ERN("Erevan"),
    TBL("Tbilisi");

    private final String alias;

    City(String alias) {
        this.alias = alias;
    }
}
