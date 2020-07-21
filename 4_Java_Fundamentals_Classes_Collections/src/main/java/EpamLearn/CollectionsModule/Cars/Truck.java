package EpamLearn.CollectionsModule.Cars;

import EpamLearn.CollectionsModule.Type.Species;
import EpamLearn.CollectionsModule.Type.TruckBodyType;

public class Truck extends Car {

  private TruckBodyType bodyType;

  public Truck(String brand, String model, int yearOfManufacture, int maxSpeed,
      double fuelConsumption, int price, Species species,
      TruckBodyType bodyType) {
    super(brand, model, yearOfManufacture, maxSpeed, fuelConsumption, price, species);
    this.bodyType = bodyType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }

    Truck truck = (Truck) o;

    return bodyType == truck.bodyType;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (bodyType != null ? bodyType.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Truck{" +
        "bodyType=" + bodyType +
        ", " + super.toString();
  }
}
