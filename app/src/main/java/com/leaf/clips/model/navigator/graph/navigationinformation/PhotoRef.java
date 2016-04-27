package com.leaf.clips.model.navigator.graph.navigationinformation;

import java.net.URI;

/**
 * @author Oscar Elia Conti
 * @version 0.02
 * @since 0.00
 */
public class PhotoRef {
    private final URI photoUrl;

    public PhotoRef(URI photoSource) {
        this.photoUrl = photoSource;
    }

    /**
     * Metodo che restituisce l'URL per accedere alla fotografia che l'oggetto rappresenta
     * @return URI di una foto
     */
    public URI getPhotoUri() {
        return this.photoUrl;
    }
}
