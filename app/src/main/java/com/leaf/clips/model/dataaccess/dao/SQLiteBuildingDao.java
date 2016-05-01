package com.leaf.clips.model.dataaccess.dao;

/**
 * @author Marco Zanella
 * @version 0.01
 * @since 0.01
 */

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.Collection;

/**
 *Classe che rappresenta un DAO per la tabella "Building" del database locale
 */

// TODO: 30/04/16 controllare su tracy che ci siano entrambe le interfacce
public class SQLiteBuildingDao implements BuildingDao, CursorConverter {

    /**
     * Permette l'accesso al database locale
     */
    private final SQLDao sqlDao;

    /**
     * Costruttore della classe SQLiteBuildingDao
     * @param database Il database locale
     */
    public SQLiteBuildingDao(SQLiteDatabase database) {
        // TODO: 30/04/16
        sqlDao = new SQLDao(database);
    }

    /**
     * Metodo che viene utilizzato per convertire il risultato della query sulla tabella "Building" del database locale in un oggetto BuildingTable
     * @param cursor Risultato della query sulla tabella "Building" del database locale
     * @return  BuildingTable
     */
    @Override
    public BuildingTable cursorToType(Cursor cursor) {
        // TODO: 30/04/16
        return null;
    }

    /**
     * Metodo che permette la rimozione delle informazioni di un edificio dalla tabella "Building" del database locale
     * @param id Identificativo dell'edificio di cui rimuovere le informazioni dal database locale
     * @return  void
     */
    @Override
    public void deleteBuilding(int id) {
        // TODO: 30/04/16
    }

    /**
     * Metodo che viene utilizzato per recuperare le informazioni di tutti gli edifici presenti nella tabella "Building" del database locale
     * @return  Collection<BuildingTable>
     */
    @Override
    public Collection<BuildingTable> findAllBuildings() {
        // TODO: 30/04/16
        return null;
    }

    /**
     * Metodo per recuperare le informazioni di un edificio dal database locale tramite il suo identificativo, sotto forma di oggetto BuildingTable
     * @param id Identificativo dell'edificio di cui recuperare le informazioni
     * @return  BuildingTable
     */
    @Override
    public BuildingTable findBuildingById(int id) {
        // TODO: 30/04/16
        return null;
    }

    /**
     * Metodo per recuperare le informazioni di un edificio dal database locale tramite il suo major, sotto forma di oggetto BuildingTable
     * @param major Major dell'edificio di cui recuperare le informazioni
     * @return  BuildingTable
     */
    @Override
    public BuildingTable findBuildingByMajor(int major) {
        // TODO: 30/04/16
        return null;
    }

    /**
     * Metodo che permette l'inserimento delle informazioni di un edificio in una entry della tabella "Building" del database locale
     * @param toInsert Oggetto di tipo BuildingTable che contiene le informazioni dell'edificio
     * @return  int
     */
    @Override
    public int insertBuilding(BuildingTable toInsert) {
        // TODO: 30/04/16
        return 0;
    }

    /**
     * Metodo per verificare la presenza nel database locale delle informazioni di un edificio
     * @param major major dell'edificio
     * @return  boolean
     */
    public boolean isBuildingMapPresent(int major) {
        // TODO: 30/04/16
        return false;
    }

    /**
     * Metodo per aggiornare le informazioni di un edificio nella tabella "Building" del database locale
     * @param id Identificativo dell'edificio di cui aggiornare le informazioni
     * @param toUpdate Oggetto che contiene le informazioni aggiornate dell'edificio
     * @return  boolean
     */
    @Override
    public boolean updateBuilding(int id, BuildingTable toUpdate) {
        // TODO: 30/04/16
        return false;
    }

}

