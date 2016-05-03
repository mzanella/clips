package com.leaf.clips.model.navigator;
/**
 * @author Eduard Bicego
 * @version 0.01
 * @since 0.00
 *
 *
 */

import com.leaf.clips.model.compass.Compass;
import com.leaf.clips.model.navigator.algorithm.DijkstraPathFinder;
import com.leaf.clips.model.navigator.algorithm.PathFinder;

import java.util.List;

/**
 *Classe che si occupa della navigazione
 */
public class NavigatorImp implements Navigator {

    /**
     * Grafo dell'edificio in cui si desidera navigare
     */
    private MapGraph buildingGraph;

    /**
     * Sensore di tipo Compass utilizzato all'avvio della navigazione
     */
    private Compass compass;

    /**
     * Lista di EnrichedEdge rappresentanti le indicazioni da seguire per raggiungere la destinazione
     */
    private List<EnrichedEdge> path;

    /**
     * Campo dati che si occupa del calcolo del percorso
     */
    private PathFinder pathFinder;

    /**
     * Iteratore rappresentante il punto che è stato raggiunto durante la navigazione
     */
    private Iterator progress;

    /**
     * Costruttore della classe NavigatorImp
     * @param compass Sensore di tipo Compass utilizzato durante la navigazione
     */
    public NavigatorImp(Compass compass) {
        this.compass = compass;
        this.path = new List<EnrichedEdge>(); // lista vuota
        this.pathFinder = new DijkstraPathFinder();
        //TODO: attributi inizializzati a null ???
        this.buildingGraph = null;
        this.progress = null;

    }

    /**
     * Metodo che calcola un percorso tra due RegionOfInterest viste come vertici di un grafo MapGraph utilizzando un oggetto PathFinder. Il punto di partenza e il punto di arrivo sono i parametri richiesti in input dal metodo mentre il grafo è un campo dati. Viene lanciata un eccezione di tipo NoGraphSetException nel caso in cui non sia settato alcun grafo
     * @param startRoi Punto di partenza del percorso
     * @param endRoi Punto di arrivo del percorso
     * @return  void
     */
    @Override
    public void calculatePath(RegionOfInterest startRoi, RegionOfInterest endRoi) {
        this.path = pathFinder.calculatePath(buildingGraph, startRoi, endRoi);
    }

    /**
     * Metodo che crea le ProcessedInformation in base al tipo di arco e in base alle informazioni provenienti dal beacon e da eventuali sensori utilizzati
     * @param edge Edge di cui devono essere recuperate le informazioni
     * @return  ProcessedInformation
     */
    private ProcessedInformation createInformation(EnrichedEdge edge) {
        return new ProcessedInformationImp(edge);
    }

    /**
     * Metodo che ritorna la lista completa delle ProcessedInstruction da seguire per percorrere un percorso calcolato
     * @return  List<ProcessedInformation>
     */
    @Override
    public List<ProcessedInformation> getAllInstructions() {
        return null;
    }

    /**
     * Metodo che ritorna il beacon con potenza maggiore tra quelli rilevati
     * @param beacons Queue dei beacon rilevati
     * @return  MyBeacon
     */
    private MyBeacon getMostPowerfulBeacon(PriorityQueue<MyBeacon> beacons) {
        return null;
    }

    /**
     * Metodo per ottenere la lista di EnrichedEdge rappresentanti un percorso
     * @return  List<EnrichedEdge>
     */
    public List<EnrichedEdge> getPath() {
        return this.path;
    }

    /**
     * Metodo che ritorna le prime informazioni utili alla navigazione
     * @return  String
     */
    private String getStarterInformation() {
        return null;
    }

    /**
     * Metodo per determinare se un percorso è più lungo o più breve di un altro percorso
     * @param firstPath Lista di EnrichedEdge rappresentante un percorso
     * @param secondPath Lista di EnrichedEdge rappresentante un percorso
     * @return  boolean
     */
    private boolean isShorter(List<EnrichedEdge> firstPath, List<EnrichedEdge> secondPath) {
        return null;
    }

    /**
     * Metodo per settare il grafo sul quale calcolare il percorso
     * @param graph Grafo sul quale si vogliono calcolare dei percorsi
     * @return  void
     */
    @Override
    public void setGraph(MapGraph graph) {
        this.buildingGraph = graph;
    }

    /**
     * Metodo che ritorna le informazioni da seguire per raggiungere la prossima RegionOfInterest. Le informazioni fornite dipendono dalla lista di beacon passata come parametro in ingrasso e dal beacon più potente tra quelli in essa contenuti. Viene lanciata una eccezione di tipo NoNavigationInformationException nel caso in cui si cerchi di accedere a tale metodo senza prima aver calcolato un percorso di navigazione. Viene lanciata una eccezione di tipo PathException nel caso in cui il beacon più potente nella lista di beacon in ingrasso sia associato ad una RegionOfInterest non appartenente ad una di quelle presenti nel percorso calcolato
     * @param visibleBeacons Insieme di beacon visibili al momento della chiamata al metodo
     * @return  ProcessedInformation
     */
    @Override
    public ProcessedInformation toNextRegion(PriorityQueue<MyBeacon> visibleBeacons) {
        return null;
    }

}
