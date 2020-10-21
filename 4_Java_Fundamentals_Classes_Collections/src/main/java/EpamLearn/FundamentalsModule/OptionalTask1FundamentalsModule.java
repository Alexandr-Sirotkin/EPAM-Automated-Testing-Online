package EpamLearn.FundamentalsModule;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OptionalTask1FundamentalsModule {

  private static int number;
  private static int[] array;

  public void runAllTasks() {
    OptionalTask1FundamentalsModule task = new OptionalTask1FundamentalsModule();
    task.enterNumbersConsole();
    task.findShortestAndLongestNumber();
    task.printNumbersInAscendingAndDescendingValuesLength();
    task.printNumbersWhoseLengthLessOrGreaterThanAverageLength();
    task.findNumberInWhichNumberOfDifferentDigitsIsMinimal();
  }

  public void enterNumbersConsole() {
    try {
      System.out.println("Введите количество чисел:");
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      number = Integer.parseInt(reader.readLine());
      array = new int[number];
      System.out.println("Введите числа:");
      for (int i = 0; i < number; i++) {
        array[i] = Integer.parseInt(reader.readLine());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void findShortestAndLongestNumber() {
    System.out.println(
        "1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");
    int shortestNumber = array[0];
    String shortestNumberAsString = String.valueOf(array[0]);
    int lengthMin = shortestNumberAsString.length();
    int longestNumber = shortestNumber;
    int lengthMax = lengthMin;
    for (int i = 0; i < number; i++) {
      String numberAsString = String.valueOf(array[i]);
      if (numberAsString.length() < lengthMin) {
        shortestNumber = array[i];
        lengthMin = numberAsString.length();
      }
      if (numberAsString.length() > lengthMax) {
        longestNumber = array[i];
        lengthMax = numberAsString.length();
      }
    }
    System.out.println(
        "Самое короткое число: " + shortestNumber + "." + " Его длина: " + lengthMin + ".");
    System.out
        .println("Самое длинное число: " + longestNumber + "." + " Его длина: " + lengthMax + ".");
    System.out.println();
  }

  public void printNumbersInAscendingAndDescendingValuesLength() {
    System.out.println("2.Вывести числа в порядке возрастания (убывания) значений их длины.");
    int[] lengtharray = new int[number];
    for (int i = 0; i < number; i++) {
      lengtharray[i] = String.valueOf(array[i]).length();
    }
    for (int i = 0; i < lengtharray.length - 1; i++) {
      for (int j = lengtharray.length - 1; j > i; j--) {
        if (lengtharray[j] < lengtharray[j - 1]) {
          int temp1 = lengtharray[j];
          lengtharray[j] = lengtharray[j - 1];
          lengtharray[j - 1] = temp1;
          int temp2 = array[j];
          array[j] = array[j - 1];
          array[j - 1] = temp2;
        }
      }
    }
    System.out.println("Числа в порядке возрастания значений их длины:");
    for (int element : array) {
      System.out.println(element);
    }
    System.out.println("Числа в порядке убывания значений их длины:");
    for (int i = array.length - 1; i >= 0; i--) {
      System.out.println(array[i]);
    }
    System.out.println();
  }

  public void printNumbersWhoseLengthLessOrGreaterThanAverageLength() {
    System.out.println(
        "3.Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.");
    int[] lengthArray = new int[number];
    for (int i = 0; i < number; i++) {
      lengthArray[i] = String.valueOf(array[i]).length();
    }
    int sum = 0;
    for (int i = 0; i < lengthArray.length; i++) {
      sum = sum + lengthArray[i];
    }
    double medium = sum / (number * 1.0);
    System.out.println("Числа, длина которых, меньше средней длины по всем числам:");
    boolean thereArenotNumbersWhoseLengthIsLessThanAverageLengthForAllNumbers = true;
    for (int i = 0; i < lengthArray.length; i++) {
      if (lengthArray[i] < medium) {
        System.out.println(array[i]);
        thereArenotNumbersWhoseLengthIsLessThanAverageLengthForAllNumbers = false;
      }
    }
    if (thereArenotNumbersWhoseLengthIsLessThanAverageLengthForAllNumbers) {
      System.out.println("Таких чисел нет.");
    }
    System.out.println();
    System.out.println("Числа, длина которых, больше средней длины по всем числам:");
    boolean thereArenotNumbersWhoseLengthIsGreaterThanAverageLengthForAllNumbers = true;
    for (int i = 0; i < lengthArray.length; i++) {
      if (lengthArray[i] > medium) {
        System.out.println(array[i]);
        thereArenotNumbersWhoseLengthIsGreaterThanAverageLengthForAllNumbers = false;
      }
    }
    if (thereArenotNumbersWhoseLengthIsGreaterThanAverageLengthForAllNumbers) {
      System.out.println("Таких чисел нет.");
    }
    System.out.println();
  }

  public void findNumberInWhichNumberOfDifferentDigitsIsMinimal() {
    System.out.println(
        "4.Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.");
    char[] arrayOfTheFirstNumber = String.valueOf(array[0]).toCharArray();
    Arrays.sort(arrayOfTheFirstNumber);
    int differentDigitsCounterOfRequiredNumber = 1;
    for (int j = 0; j < arrayOfTheFirstNumber.length - 1; j++) {
      if (arrayOfTheFirstNumber[j] != arrayOfTheFirstNumber[j + 1]) {
        differentDigitsCounterOfRequiredNumber++;
      }
    }
    int numberInWhichAmountOfDifferentDigitsMinimum = array[0];
    for (int i = 1; i < array.length; i++) {
      char[] arrayOfNumber = String.valueOf(array[i]).toCharArray();
      Arrays.sort(arrayOfNumber);
      int differentDigitsCounter = 1;
      for (int j = 0; j < arrayOfNumber.length - 1; j++) {
        if (arrayOfNumber[j] != arrayOfNumber[j + 1]) {
          differentDigitsCounter++;
        }
      }
      if (differentDigitsCounter < differentDigitsCounterOfRequiredNumber) {
        differentDigitsCounterOfRequiredNumber = differentDigitsCounter;
        numberInWhichAmountOfDifferentDigitsMinimum = array[i];
      }
    }
    System.out.println("Число, в котором количество различных цифр минимально: "
        + numberInWhichAmountOfDifferentDigitsMinimum);
    System.out.println();
  }
}
