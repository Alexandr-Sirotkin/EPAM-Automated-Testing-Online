import Planes.ExperimentalPlane;
import models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.*;

public class Airport {

  private List<? extends Plane> planes;

  public Airport(List<? extends Plane> planes) {
    this.planes = planes;
  }

  public List<PassengerPlane> getPassengerPlane() {
    List<PassengerPlane> PassengerPlanes = new ArrayList<>();
    for (Plane plane : planes) {
      if (plane instanceof PassengerPlane) {
        PassengerPlanes.add((PassengerPlane) plane);
      }
    }
    return PassengerPlanes;
  }

  public List<MilitaryPlane> getMilitaryPlanes() {
    List<MilitaryPlane> militaryPlanes = new ArrayList<>();
    for (Plane plane : planes) {
      if (plane instanceof MilitaryPlane) {
        militaryPlanes.add((MilitaryPlane) plane);
      }
    }
    return militaryPlanes;
  }

  public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
    List<PassengerPlane> passengerPlanes = getPassengerPlane();
    PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
    for (int i = 0; i < passengerPlanes.size(); i++) {
      if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity
          .getPassengersCapacity()) {
        planeWithMaxCapacity = passengerPlanes.get(i);
      }
    }
    return planeWithMaxCapacity;
  }

  public List<MilitaryPlane> getTransportMilitaryPlanes() {
    List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
    List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
    for (int i = 0; i < militaryPlanes.size(); i++) {
      if (militaryPlanes.get(i).getType() == MilitaryType.TRANSPORT) {
        transportMilitaryPlanes.add(militaryPlanes.get(i));
      }
    }
    return transportMilitaryPlanes;
  }

  public List<MilitaryPlane> getBomberMilitaryPlanes() {
    List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
    List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
    for (int i = 0; i < militaryPlanes.size(); i++) {
      if (militaryPlanes.get(i).getType() == MilitaryType.BOMBER) {
        bomberMilitaryPlanes.add(militaryPlanes.get(i));
      }
    }
    return bomberMilitaryPlanes;
  }

  public List<ExperimentalPlane> getExperimentalPlanes() {
    List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
    for (Plane plane : planes) {
      if (plane instanceof ExperimentalPlane) {
        experimentalPlanes.add((ExperimentalPlane) plane);
      }
    }
    return experimentalPlanes;
  }

  public Airport sortByMaxDistance() {
    Collections.sort(planes, new Comparator<Plane>() {
      public int compare(Plane o1, Plane o2) {
        return o1.getMaxFlightDistance() - o2.getMaxFlightDistance();
      }
    });
    return this;
  }

  public Airport sortByMaxSpeed() {
    Collections.sort(planes, new Comparator<Plane>() {
      public int compare(Plane o1, Plane o2) {
        return o1.getMaxSpeed() - o2.getMaxSpeed();
      }
    });
    return this;
  }

  public Airport sortByMaxLoadCapacity() {
    Collections.sort(planes, new Comparator<Plane>() {
      public int compare(Plane o1, Plane o2) {
        return o1.getMinLoadCapacity() - o2.getMinLoadCapacity();
      }
    });
    return this;
  }

  public List<? extends Plane> getPlanes() {
    return planes;
  }

  @Override
  public String toString() {
    return "Airport{" +
        "Planes=" + planes.toString() +
        '}';
  }

}
