package com.leaf.clips.model.dataaccess.dao;
/**
 * @author Marco Zanella
 * @version 0.01
 * @since 0.01
 *
 *
 */

import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 *Classe di utility per la conversione da JSON a CategoryTable
 */
public class RemoteCategoryDao {

    // TODO: 29/04/16 chiedere modifica alla classe
    private static final Gson gson = new Gson();

    /**
     * Costruttore di default per la classe RemoteCategoryDao
     */
    public RemoteCategoryDao(){}

    /**
     * Metodo utilizzato per la conversione di un oggetto JsonObject in un oggetto CategoryTable, che viene ritornato
     * @param object Oggetto JSON che rappresenta un oggetto di tipo CategoryTable
     * @return  CategoryTable
     */
    public CategoryTable fromJSONToTable(JsonObject object){
        CategoryTable categoryTable;
        categoryTable = gson.fromJson(object, CategoryTable.class);
        return categoryTable;
    }

}
