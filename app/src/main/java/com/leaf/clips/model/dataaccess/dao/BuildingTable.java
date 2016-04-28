package com.leaf.clips.model.dataaccess.dao;
/**
 * @author
 * @version 0.00
 * @since 0.00
 *
 *
 */

/**
 *Classe che rappresenta una ennupla della tabella Building del database locale
 */
public class BuildingTable {

    /**
     * Indirizzo dell'edificio
     */
    private String address;

    /**
     * Descrizione dell'edificio
     */
    private String description;

    /**
     * Identificativo dell'edificio
     */
    private int id;

    /**
     * Major dell'edificio
     */
    private int major;

    /**
     * Dimensione della mappa (in MB)
     */
    private String mapSize;

    /**
     * Versione corrente della mappa
     */
    private int mapVersion;

    /**
     * Nome dell'edificio
     */
    private String name;

    /**
     * Orario dell'apertura dell'edificio
     */
    private String openingHours;

    /**
     * Identificativo dell'applicazione
     */
    private String uuid;

    /**
     * Costruttore della classe BuildingTable
     * @param id Identificativo numerico dell'oggetto BuildingTable
     * @param uuid Identificativo univoco
     * @param major Major dell'edificio
     * @param name Nome dell'edificio mappato
     * @param description Descrizione dell'edificio mappato
     * @param openingHours Orari di apertura dell'edificio mappato
     * @param address Indirizzo dell'edificio mappato
     * @param mapVersion Versione della mappa
     * @param mapSize Dimensione della mappa (espressa in MB)
     */
    public BuildingTable(int id, String uuid, int major, String name, String description, String openingHours, String address, int mapVersion, String mapSize) {
        // TODO: 28/04/16
    }

    /**
     * Metodo che ritorna l'indirizzo dell'edificio
     * @return  String
     */
    public String getAddress() {
        // TODO: 28/04/16
        return null;
    }

    /**
     * Metodo che ritorna la descrizione dell'edificio
     * @return  String
     */
    public String getDescription() {
        // TODO: 28/04/16
        return null;
    }

    /**
     * Metodo che ritorna l'identificativo dell'edificio
     * @return  int
     */
    public int getId() {
        // TODO: 28/04/16
        return 0;
    }

    /**
     * Metodo che ritorna il major dell'edificio
     * @return  int
     */
    public int getMajor() {
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

    /**
     * Metodo che ritorna l'orario di apertura dell'edificio
     * @return  String
     */
    public String getOpeningHours() {
        // TODO: 28/04/16
        return null;
    }

    /**
     * Metodo che ritorna la dimensione della mappa (in MB)
     * @return  String
     */
    public String getSize() {
        // TODO: 28/04/16
        return null;
    }

    /**
     * Metodo che ritorna l'identificativo dell'applicazione
     * @return  String
     */
    public String getUUID() {
        // TODO: 28/04/16
        return null;
    }

    /**
     * Metodo che ritorna la versione della mappa dell'edificio
     * @return  int
     */
    public int getVersion() {
        // TODO: 28/04/16
        return 0;
    }

}
