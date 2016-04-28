package com.leaf.clips.model.dataaccess.dao;
/**
 * @author Marco Zanella
 * @version 0.01
 * @since 0.01
 *
 *
 */

/**
 *Classe che rappresenta una ennupla della tabella PointOfInterest del database locale
 */
public class PointOfInterestTable {

    /**
     * Identificativo della categoria a cui appartiene il POI
     */
    private int categoryId;

    /**
     * Descrizione del POI
     */
    private String description;

    /**
     * Identificativo del POI
     */
    private int id;

    /**
     * Nome del POI
     */
    private String name;

    /**
     * Costruttore della classe PointOfInterestTable
     * @param description Descrizione del POI
     * @param id Identificativo del POI
     * @param name Nome del POI
     * @param category Identificativo della categoria a cui appartiene il POI
     */
    public PointOfInterestTable(String description, int id, String name, int category) {
        // TODO: 28/04/16
    }

    /**
     * Metodo che ritorna l'identificativo del POI
     * @return  int
     */
    public int getCategoryId() {
        // TODO: 28/04/16
        return 0;
    }

    /**
     * Metodo che ritorna la descrizione del POI
     * @return  String
     */
    public String getDescription() {
        // TODO: 28/04/16
        return null;
    }

    /**
     * Metodo che ritorna l'identificativo del POI
     * @return  int
     */
    public int getId() {
        // TODO: 28/04/16
        return 0;
    }

    /**
     * Metodo che ritorna il nome dell'edificio
     * @return  String
     */
    public String getName() {
        // TODO: 28/04/16
        return null;
    }

}
