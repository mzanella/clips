package com.leaf.clips.model.usersetting;
/**
* @author Federico Tavella
* @version 0.01
* @since 0.00
* 
* 
*/

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/** 
 * Classe che implementa l'interfaccia Setting. Implementa tutti i metodi per la gestione delle impostazioni dell'utente
 */
public class SettingImp implements Setting { 

    /**
    * Preferenze dell'utente riguardanti le modalità di fruizione delle informazioni per la navigazione
    */
    private InstructionPreference instructionPreference;

    /**
    * Preferenze di percorso dell'utente
    */
    private PathPreference pathPreference;

    /**
    * Metodo che ritorna le preferenze riguardanti la modalità di fruizione delle informazioni
    * @return  InstructionPreference
    */
    @Override
    public InstructionPreference getInstructionPreference(){
        return instructionPreference;
    }

    /**
    * Metodo che ritorna le preferenze di percorso
    * @return  PathPreference
    */
    @Override
    public PathPreference getPathPreference(){
        return pathPreference;
    }

    /**
    * Metodo che verifica se è stato inserito in precedenza un codice sviluppatore valido
    * @return  boolean
    */
    @Override
    public boolean isDeveloper(){
        DeveloperCodeManager developerCodeManager = new DeveloperCodeManager();
        return developerCodeManager.isValid(""); // TODO: 01/05/2016
    }

    /**
    * Metodo che permette di modificare le impostazioni riguardanti le preferenze di fruizione delle istruzioni di navigazione
    * @param instructionPreference Questo parametro richiede il tipo di istruzioni che si vuole ricevere durante la navigazione
    * @return  void
    */
    @Override
    public void setInstructionPreference(InstructionPreference instructionPreference){
        this.instructionPreference = instructionPreference;
    }

    /**
    * Metodo che permette di modificare le impostazioni riguardanti le preferenze sul percorso di navigazione
    * @param pathPreference Questo parametro richiede le preferenze di percorso che un utente vuole impostare
    * @return  void
    */
    @Override
    public void setPathPreference(PathPreference pathPreference){
        this.pathPreference = pathPreference;
    }

    /**
    * Metodo che passato una stringa in ingresso controlla se tale stringa rappresenta un codice sviluppatore valido
    * @param code Stringa rappresentante il codice sviluppatore
    * @return  boolean
    */
    @Override
    public boolean unlockDeveloper(String code){
        DeveloperCodeManager developerCodeManager = new DeveloperCodeManager();
        return developerCodeManager.isValid(code);
    }

}

