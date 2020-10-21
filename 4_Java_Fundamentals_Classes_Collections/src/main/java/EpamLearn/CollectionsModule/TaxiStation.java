package EpamLearn.CollectionsModule;

import EpamLearn.CollectionsModule.Cars.Car;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaxiStation {

  private List<? extends Car> cars;

  public TaxiStation(List<? extends Car> cars) {
    this.cars = cars;
  }

  public void runAllTasks(List<? extends Car> cars) {
    TaxiStation taxiStation = new TaxiStation(cars);
    taxiStation.printCostOfCarPark();
    taxiStation.printSortCarByFuelConsumption();
    taxiStation.printCarFromSpecifiedSpeedRange();
  }

  public void printCostOfCarPark() {
    int costOfCarPark = 0;
    for (Car car : cars) {
      costOfCarPark += car.getPrice();
    }
    System.out.println("Стоимость автопарка " + costOfCarPark + "$.");
    System.out.println();
  }

  public void printSortCarByFuelConsumption() {
    Collections.sort(cars, Comparator.comparingDouble(Car::getFuelConsumption));
    System.out.println("Сортировка автомобилей парка по расходу топлива:");
    System.out.println(cars);
    System.out.println();
  }

  public void printCarFromSpecifiedSpeedRange() {
    System.out
        .println("Автомобили, соответствующие заданному диапазону параметров скорости:");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out
          .println("Введите значение, определяющее верхнюю границу максимальной скорости машины:");
      int upperSpeedLimit = Integer.parseInt(reader.readLine());
      System.out
          .println("Введите значение, определяющее нижнюю границу максимальной скорости машины:");
      int lowerSpeedLimit = Integer.parseInt(reader.readLine());
      if (upperSpeedLimit >= lowerSpeedLimit) {
        List<Car> carsSelectedBySpeed = new ArrayList<>();
        for (Car car : cars) {
          if (car.getMaxSpeed() <= upperSpeedLimit && car.getMaxSpeed() >= lowerSpeedLimit) {
            carsSelectedBySpeed.add(car);
          }
        }
        System.out.println(!carsSelectedBySpeed.isEmpty() ? carsSelectedBySpeed
            : "Машины, соответствующей заданному диапазону максимальной скорости, нет.");
      } else {
        System.out.println("Неверно заданы границы скорости.");
      }
      System.out.println();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
