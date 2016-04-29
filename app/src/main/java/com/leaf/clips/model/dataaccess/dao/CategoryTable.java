package com.leaf.clips.model.dataaccess.dao;
/**
 * @author Marco Zanella
 * @version 0.01
 * @since 0.01
 *
 *
 */

/**
 *Classe che rappresenta una ennupla della tabella Category del database locale
 */
public class CategoryTable {

    /**
     * Nome della categoria
     */
    private String description;

    /**
     * Identificativo numerico dell'oggetto CategoryTable
     */
    private int id;

    /**
     * Costruttore della classe CategoryTable
     * @param id Identificativo numerico dell'oggetto CategoryTable
     * @param description Nome della categoria
     */
    public CategoryTable(int id, String description);

    /**
     * Metodo che restituisce il nome della categoria
     * @return  String
     */
    public String getDescription();

    /**
     * Metodo che restituisce l'identificativo numerico dell'oggetto CategoryTable
     * @return  int
     */
    public int getId();

}
