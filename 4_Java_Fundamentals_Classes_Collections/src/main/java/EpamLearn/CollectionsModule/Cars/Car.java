package EpamLearn.CollectionsModule.Cars;

import EpamLearn.CollectionsModule.Type.Species;

public abstract class Car {

  private String brand;
  private String model;
  private int yearOfManufacture;
  private int maxSpeed;
  private double fuelConsumption;
  private int price;
  private Species species;

  public Car(String brand, String model, int yearOfManufacture, int maxSpeed,
      double fuelConsumption,
      int price, Species species) {
    this.brand = brand;
    this.model = model;
    this.yearOfManufacture = yearOfManufacture;
    this.maxSpeed = maxSpeed;
    this.fuelConsumption = fuelConsumption;
    this.price = price;
    this.species = species;
  }

  public Car() {
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Car car = (Car) o;

    if (yearOfManufacture != car.yearOfManufacture) {
      return false;
    }
    if (maxSpeed != car.maxSpeed) {
      return false;
    }
    if (Double.compare(car.fuelConsumption, fuelConsumption) != 0) {
      return false;
    }
    if (price != car.price) {
      return false;
    }
    if (brand != null ? !brand.equals(car.brand) : car.brand != null) {
      return false;
    }
    if (model != null ? !model.equals(car.model) : car.model != null) {
      return false;
    }
    return species == car.species;
  }

  public int getPrice() {
    return price;
  }

  public double getFuelConsumption() {
    return fuelConsumption;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = brand != null ? brand.hashCode() : 0;
    result = 31 * result + (model != null ? model.hashCode() : 0);
    result = 31 * result + yearOfManufacture;
    result = 31 * result + maxSpeed;
    temp = Double.doubleToLongBits(fuelConsumption);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + price;
    result = 31 * result + (species != null ? species.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "brand='" + brand + '\'' +
        ", model='" + model + '\'' +
        ", yearOfManufacture=" + yearOfManufacture +
        ", maxSpeed=" + maxSpeed +
        ", fuelConsumption=" + fuelConsumption +
        ", price=" + price +
        ", species=" + species +
        '}';
  }
}
