package com.leaf.clips.model;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta l'etichetta di un messaggio scambiato all'interno dell'applicazione contenente una lista di beacon
*/ 
public enum MessageSendType {
    VISIBLE_BEACON;
    
    public static MessageSendType fromInt(int i){
        switch(i){
            case 0 : 
                return VISIBLE_BEACON;
            
        }
        return VISIBLE_BEACON; // TODO: 02/05/2016 decidere cosa fare in caso di errore
    }
    
    public static int toInt(MessageSendType messageSendType){
        switch (messageSendType){
            case VISIBLE_BEACON:
                return 0;
        }
        return -1;// TODO: 02/05/2016  decidere cosa fare in caso di errore
    }
}

