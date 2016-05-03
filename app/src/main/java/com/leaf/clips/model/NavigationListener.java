package com.leaf.clips.model;
/**
 * @author Federico Tavella
 * @version 0.01
 * @since 0.00
 */

import com.leaf.clips.model.navigator.ProcessedInformation;

/**
 * Class Description
 */
public interface NavigationListener {
    // TODO: 02/05/2016 da aggiungere su Tracy

    void informationUpdate(ProcessedInformation info);

    void pathError();
}
