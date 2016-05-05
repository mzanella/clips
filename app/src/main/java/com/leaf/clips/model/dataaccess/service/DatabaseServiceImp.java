package com.leaf.clips.model.dataaccess.service;

import com.leaf.clips.model.dataaccess.dao.BuildingTable;
import com.leaf.clips.model.navigator.BuildingMap;

import java.util.Collection;

/**
 * @author Marco Zanella
 * @version 0.01
 * @since 0.01
 */
public class DatabaseServiceImp implements DatabaseService {
    @Override
    public void deleteBuilding(BuildingMap buildingMap) {

    }

    @Override
    public Collection<BuildingTable> findAllBuildings() {
        return null;
    }

    @Override
    public Collection<BuildingTable> findAllRemoteBuildings() {
        return null;
    }

    @Override
    public BuildingMap findBuildingByMajor(int major) {
        return null;
    }

    @Override
    public BuildingMap findRemoteBuildingByMajor(int major) {
        return null;
    }

    @Override
    public boolean isBuildingMapPresent(int major) {
        return false;
    }

    @Override
    public boolean isBuildingMapUpdated(int major) {
        return false;
    }

    @Override
    public void updateBuildingMap(int major) {

    }
}
