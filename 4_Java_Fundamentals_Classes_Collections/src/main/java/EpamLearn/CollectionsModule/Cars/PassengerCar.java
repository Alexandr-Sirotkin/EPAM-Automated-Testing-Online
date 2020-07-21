package EpamLearn.CollectionsModule.Cars;

import EpamLearn.CollectionsModule.Type.CarBodyType;
import EpamLearn.CollectionsModule.Type.Species;

public class PassengerCar extends Car {

  private CarBodyType bodyType;

  public PassengerCar(String brand, String model, int yearOfManufacture, int maxSpeed,
      double fuelConsumption, int price, Species species,
      CarBodyType bodyType) {
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

    PassengerCar that = (PassengerCar) o;

    return bodyType == that.bodyType;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (bodyType != null ? bodyType.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "PassengerCar{" +
        "bodyType=" + bodyType +
        ", " + super.toString();
  }
}
