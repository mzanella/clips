package com.leaf.clips.model;
/**
* @author Federico Tavella
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta l'eccezione lanciata nel caso in cui non siano rilevati beacon
*/ 
public class NoBeaconSeenException extends Exception{

    /**
    * Rappresenta il messaggio di default che viene mostrato quando non viene rilevato nessun beacon
    */
    private final static String DEFAULT_MESSAGE = ""; // TODO: 02/05/2016

    /**
    * Rappresenta un messaggio qualsiasi quando non viene rilevato nessun beacon
    */
    private String message;

    /**
    * Costruttore della classe di default
    */
    public NoBeaconSeenException(){
        message = "";
    }

    /**
    * Costruttore della classe che richiede un messaggio come parametro
    * @param message Questo parametro richiede che un messaggio di tipo  String
    */
    public NoBeaconSeenException(String message){
        this.message = message;
    }

}

