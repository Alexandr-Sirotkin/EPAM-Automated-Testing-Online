package service;

import Planes.ExperimentalPlane;
import Planes.MilitaryPlane;
import Planes.Plane;
import java.util.List;
import models.ClassificationLevel;
import models.MilitaryType;

public class ServiceTest {

  public boolean checkGetTransportMilitaryPlanes(List<MilitaryPlane> transportMilitaryPlanes) {
    boolean onlyTransportInTheList = true;
    if (transportMilitaryPlanes.isEmpty()) {
      onlyTransportInTheList = false;
    } else {
      for (MilitaryPlane militaryPlane : transportMilitaryPlanes) {
        if (militaryPlane.getType() != MilitaryType.TRANSPORT) {
          onlyTransportInTheList = false;
          break;
        }
      }
    }
    return onlyTransportInTheList;
  }

  public boolean confirmSortByMaxLoadCapacity(List<? extends Plane> planesSortedByMaxLoadCapacity) {
    boolean nextPlaneMaxLoadCapacityIsHigherThanCurrent = true;
    for (int i = 0; i < planesSortedByMaxLoadCapacity.size() - 1; i++) {
      Plane currentPlane = planesSortedByMaxLoadCapacity.get(i);
      Plane nextPlane = planesSortedByMaxLoadCapacity.get(i + 1);
      if (currentPlane.getMinLoadCapacity() > nextPlane.getMinLoadCapacity()) {
        nextPlaneMaxLoadCapacityIsHigherThanCurrent = false;
      }
    }
    return nextPlaneMaxLoadCapacityIsHigherThanCurrent;
  }

  public boolean confirmBomberMilitaryPlanes(
      List<MilitaryPlane> bomberMilitaryPlanes) {
    boolean onlyBombersInTheList = true;
    if (bomberMilitaryPlanes.isEmpty()) {
      onlyBombersInTheList = false;
    } else {
      for (MilitaryPlane militaryPlane : bomberMilitaryPlanes) {
        if (militaryPlane.getType() != MilitaryType.BOMBER) {
          onlyBombersInTheList = false;
          break;
        }
      }
    }
    return onlyBombersInTheList;
  }

  public boolean confirmHasUnclassifiedPlanes(
      List<ExperimentalPlane> experimentalPlanes) {
    boolean hasUnclassifiedPlanes = false;
    for (ExperimentalPlane experimentalPlane : experimentalPlanes) {
      if (experimentalPlane.getClassificationLevel() == ClassificationLevel.UNCLASSIFIED) {
        hasUnclassifiedPlanes = true;
      }
    }
    return hasUnclassifiedPlanes;
  }
}
