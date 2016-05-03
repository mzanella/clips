package com.leaf.clips.model.dataaccess.dao;
/**
 * @author Marco Zanella
 * @version 0.00
 * @since 0.00
 *
 *
 */

import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 *Classe di utility per la conversione da JSON a PhotoTable
 */
public class RemotePhotoDao {

    // TODO: 29/04/16 chiedere modifica classe 
    private static final Gson gson = new Gson();
    
    /**
     * Costruttore di default per la classe RemotePhotoDao
     */
    public RemotePhotoDao(){}

    /**
     * Metodo utilizzato per la conversione di un oggetto JsonObject in un oggetto PhotoTable, che viene ritornato
     * @param object Oggetto JSON che rappresenta un oggetto di tipo PhotoTable
     * @return  PhotoTable
     */
    public PhotoTable fromJSONToTable(JsonObject object) {
        PhotoTable photoTable;
        photoTable = gson.fromJson(object, PhotoTable.class);
        return photoTable;
    }

}
