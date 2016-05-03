package com.leaf.clips.model.navigator.algorithm;
/**
 * @author Eduard Bicego
 * @version 0.01
 * @since 0.00
 *
 *
 */

import org.jgrapht.alg.DijkstraShortestPath;

/**
 *Classe che rappresenta un algoritmo per il calcolo del percorso di navigazione
 */
public class DijkstraPathFinder implements PathFinder {

    /**
     * Costruttore di default della classe DijkstraPathFinder
     */
    public DijkstraPathFinder() {
        //TODO: classe con costruttore vuoto ???
    }

    /**
     * Metodo che calcola un percorso tra due RegionOfInterest viste come vertici di un grafo
     * MapGraph. Il grafo, il punto di partenza e il punto di arrivo sono i parametri richiesti in
     * input dal metodo
     * @param graph Grafo sul quale calcolare il percorso
     * @param startROI RegionOfInterest di partenza del percorso. Deve appartenere al grafo passato
     *                 come paramentro.
     * @param endROI RegionOfInterest di arrivo del percorso. Deve appartenere al grafo passato come
     *               paramentro.
     * @return  List<EnrichedEdge>
     */
    @Override
    public List<EnrichedEdge> calculatePath(MapGraph graph, RegionOfInterest startROI,
                                            RegionOfInterest endROI) {
        //TODO: graph not accept ???
        return DijkstraShortestPath.findPathBetween(graph, startROI, endROI);
    }

}

