package com.leaf.clips.model.navigator.graph.Vertex;

/**
 * @author Oscar Elia Conti
 * @version 0.01
 * @since 0.00
 */
/**
 *Classe rappresentante il vertice (o nodo) di un grafo
 */
public class VertexImp implements Vertex {

    /**
     * Identificativo numerico di un VertexImp 
     */
    // TODO: 4/29/16 aggiungere codifica 
    private final int id = 0;

    /**
     * Costruttore della classe VertexImp
     * @param id Identificativo numerico di un oggetto VertexImp
     */
    public VertexImp(int  id){};

    /**
     * Metodo che ritorna l'identificativo numerico associato all'oggetto VertexImp
     * @return  int
     */
    @Override
    public int getId(){
        return 0;
    }

}
