package EpamLearn;

import EpamLearn.ClassesModule.CalculationsMainTaskClassesModule;
import EpamLearn.CollectionsModule.Cars.Car;
import EpamLearn.CollectionsModule.Cars.PassengerCar;
import EpamLearn.CollectionsModule.Cars.Truck;
import EpamLearn.CollectionsModule.OptionalTaskCollectionsModule;
import EpamLearn.CollectionsModule.TaxiStation;
import EpamLearn.CollectionsModule.Type.CarBodyType;
import EpamLearn.CollectionsModule.Type.Species;
import EpamLearn.CollectionsModule.Type.TruckBodyType;
import EpamLearn.FundamentalsModule.MainTaskFundamentalsModule;
import EpamLearn.FundamentalsModule.OptionalTask1FundamentalsModule;
import java.util.Arrays;
import java.util.List;

public class Runner {

  static List<? extends Car> cars = Arrays.asList(
      new PassengerCar("BMW", "3 series", 2010, 240, 8.9, 10_000, Species.PASSENGER_CAR,
          CarBodyType.SEDAN),
      new PassengerCar("Mazda", "6", 2018, 207, 8.4, 24_500, Species.PASSENGER_CAR,
          CarBodyType.SEDAN),
      new PassengerCar("Lexus", "LS", 2015, 250, 13.1, 52_000, Species.PASSENGER_CAR,
          CarBodyType.SEDAN),
      new PassengerCar("Volkswagen", "Touareg", 2015, 220, 10.9, 27_500, Species.PASSENGER_CAR,
          CarBodyType.SUV),
      new PassengerCar("BMW", "1 series", 2018, 204, 7.6, 16_000, Species.PASSENGER_CAR,
          CarBodyType.HATCHBACK),
      new PassengerCar("Ford", "Mustang", 2016, 233, 12.2, 26_800, Species.PASSENGER_CAR,
          CarBodyType.COUPE),
      new PassengerCar("Audi", "A6", 2014, 250, 8.3, 23_800, Species.PASSENGER_CAR,
          CarBodyType.STATION_WAGON),
      new PassengerCar("Mercedes-Benz", "SLC-Class", 2016, 250, 10.7, 36_500, Species.PASSENGER_CAR,
          CarBodyType.CABRIOLET),
      new Truck("Hyundai", "Porter", 2007, 160, 13.2, 9_800, Species.TRUCK, TruckBodyType.VAN),
      new Truck("Scania", "S500", 2017, 85, 39.8, 130_100, Species.TRUCK, TruckBodyType.MEGA),
      new Truck("MAN", "TGX", 2015, 100, 36.1, 119_300, Species.TRUCK, TruckBodyType.JUMBO),
      new Truck("MAN", "TGS", 2013, 100, 32.6, 104_900, Species.TRUCK,
          TruckBodyType.EIGHTEEN_WHEELER)
  );


  public static void main(String[] args) {

    MainTaskFundamentalsModule mainTaskFundamentalsModule = new MainTaskFundamentalsModule();
    mainTaskFundamentalsModule.runAllTasks(args);
    OptionalTask1FundamentalsModule optionalTask1FundamentalsModule = new OptionalTask1FundamentalsModule();
    optionalTask1FundamentalsModule.runAllTasks();

    CalculationsMainTaskClassesModule calculationsMainTaskClassesModule = new CalculationsMainTaskClassesModule();
    calculationsMainTaskClassesModule.runAllTasks();

    TaxiStation taxiStation = new TaxiStation(cars);
    taxiStation.runAllTasks(cars);
    OptionalTaskCollectionsModule optionalTaskCollectionsModule = new OptionalTaskCollectionsModule();
    optionalTaskCollectionsModule.runAllTasks();

  }
}
