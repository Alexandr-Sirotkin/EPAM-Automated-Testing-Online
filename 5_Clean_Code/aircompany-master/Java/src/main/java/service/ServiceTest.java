package service;

import Planes.ExperimentalPlane;
import Planes.MilitaryPlane;
import Planes.Plane;
import java.util.List;
import models.ClassificationLevel;
import models.MilitaryType;

public class ServiceTest {

  public boolean checkGetTransportMilitaryPlanes(List<MilitaryPlane> transportMilitaryPlanes) {
    boolean hasTransportMilitaryPlanes = false;
    for (MilitaryPlane militaryPlane : transportMilitaryPlanes) {
      if ((militaryPlane.getType() == MilitaryType.TRANSPORT)) {
        hasTransportMilitaryPlanes = true;
      }
    }
    return hasTransportMilitaryPlanes;
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

  public boolean confirmHasAtLeastOneBomberInMilitaryPlanes(
      List<MilitaryPlane> bomberMilitaryPlanes) {
    boolean hasAtLeastOneBomberInMilitaryPlanes = false;
    for (MilitaryPlane militaryPlane : bomberMilitaryPlanes) {
      if ((militaryPlane.getType() == MilitaryType.BOMBER)) {
        hasAtLeastOneBomberInMilitaryPlanes = true;
      }
    }
    return hasAtLeastOneBomberInMilitaryPlanes;
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
