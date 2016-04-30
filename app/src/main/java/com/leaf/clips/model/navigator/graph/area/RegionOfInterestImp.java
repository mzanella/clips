package com.leaf.clips.model.navigator.graph.area;

/**
 * @author Oscar Elia Conti
 * @version 0.01
 * @since 0.00
 */

// TODO: 4/30/16 codify

import com.leaf.clips.model.beacon.MyBeacon;
import com.leaf.clips.model.navigator.graph.vertex.VertexImp;

import java.util.Collection;

/**
 *Classe che rappresenta una ROI, area coperta da un beacon che può contenere uno o più POI. Implementa la classe VertexImp
 */
public class RegionOfInterestImp extends VertexImp implements RegionOfInterest {

    /**
     * Identificativo numerico di un oggetto RegionOfInterestImp
     */
    private final int id = 0;

    /**
     * Identificativo Major del beacon associato alla ROI rappresentata dall'oggetto
     */
    private final int major = 0;

    /**
     * Identificativo Minor del beacon associato alla ROI rappresentata dall'oggetto
     */
    private final int minor = 0;

    /**
     * Collezione degli oggetti PointOfInterest appartenenti all'oggetto
     */
    private Collection<PointOfInterest> pois;

    /**
     * Identificativo UUID del beacon associato alla ROI rappresentata dall'oggetto
     */
    private final String uuid = null;

    /**
     * Costruttore della classe RegionOfInterestImp
     * @param id  Identificativo numerico di un RegionOfInterestImp.
     * @param uuid Identificativo UUID del beacon associato alla ROI rappresentata dall'oggetto
     * @param major Identificativo Major del beacon associato alla ROI rappresentata dall'oggetto
     * @param minor Identificativo Minor del beacon associato alla ROI rappresentata dall'oggetto
     */
    public RegionOfInterestImp(int id , String uuid, int major, int minor){
        super(0);
    }

    /**
     * Metodo utilizzato per verificare se il beacon passato come paramentro è il beacon associato alla RegionOfInterest
     * @param beacon Beacon di cui si vuole verificare l'associazione con la RegionOfInterest
     * @return  boolean
     */
    @Override
    public boolean contains(MyBeacon beacon){
        return false;
    }

    /**
     * Metodo che ritorna la collezione di PointOfInterest appartenenti a tale RegionOfInterestImp
     * @return  Collection<PointOfInterest>
     */
    @Override
    public Collection<PointOfInterest> getAllNearbyPOIs(){
        return null;
    }

    /**
     * Metodo che ritorna il piano dell'edificio nel quale la ROI rappresentata da tale oggetto si trova
     * @return  int
     */
    @Override
    public int getFloor() {
        return 0;
    }

    /**
     * Metodo che ritorna l'identificativo Major del beacon associato al ROI rappresentato da tale RegionOfInterestImp
     * @return  int
     */
    @Override
    public int getMajor() {
        return 0;
    }

    /**
     * Metodo che ritorna l'identificativo Minor del beacon associato al ROI rappresentato da tale RegionOfInterestImp
     * @return  int
     */
    @Override
    public int getMinor() {
        return 0;
    }

    /**
     * Metodo che ritorna l'identificativo UUID del beacon associato al ROI rappresentato da tale RegionOfInterestImp
     * @return  String
     */
    @Override
    public String getUUID() {
        return null;
    }

    /**
     * Metodo utilizzato per settare l'insieme di PointOfInterest associato a tale RegionOfInterestImp
     * @return  void
     */
    @Override
    public void setNearbyPOIs(Collection<PointOfInterest> pois) {

    }

}

