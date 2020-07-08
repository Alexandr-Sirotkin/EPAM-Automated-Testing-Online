package EpamLearn.FundamentalsModule;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OptionalTask1FundamentalsModule {

  static int number;
  static int[] array;

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
      reader.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void findShortestAndLongestNumber() {
    System.out.println(
        "1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");
    int shortestNumber = array[0];
    int lengthMin = (array[0] + "").length();
    int longestNumber = array[0];
    int lengthMax = (array[0] + "").length();
    for (int i = 0; i < number; i++) {
      if ((array[i] + "").length() < lengthMin) {
        shortestNumber = array[i];
        lengthMin = (array[i] + "").length();
      }
      if ((array[i] + "").length() > lengthMax) {
        longestNumber = array[i];
        lengthMax = (array[i] + "").length();
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
      lengtharray[i] = (array[i]+"").length();
    }
    for (int i = 0; i < lengtharray.length-1; i++) {
      for (int j = lengtharray.length-1; j > i; j--) {
        if (lengtharray[j] < lengtharray[j-1]){
          int tmp1 = lengtharray[j];
          lengtharray[j] = lengtharray[j-1];
          lengtharray[j-1] = tmp1;
          int tmp2 = array[j];
          array[j] = array[j-1];
          array[j-1] = tmp2;
        }
      }
    }
    System.out.println("Числа в порядке возрастания значений их длины:");
    for (int element:array) {
      System.out.println(element);
    }
    System.out.println("Числа в порядке убывания значений их длины:");
    for (int i = array.length-1; i >= 0; i--) {
      System.out.println(array[i]);
    }
    System.out.println();
  }

  public void printNumbersWhoseLengthLessOrGreaterThanAverageLength(){

    System.out.println("3.Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.");
    int[] lengtharray = new int[number];
    for (int i = 0; i < number; i++) {
      lengtharray[i] = (array[i]+"").length();
    }
    int sum = 0;
    for (int i = 0; i < lengtharray.length; i++) {
      sum = sum + lengtharray[i];
    }
    double medium = sum/(number*1.0);
    System.out.println("Числа, длина которых, меньше средней длины по всем числам:");
    boolean flag1 = true;
    for (int i = 0; i < lengtharray.length; i++) {
      if (lengtharray[i] < medium){
        System.out.println(array[i]);
        flag1 = false;
      }
    }
    if (flag1) {
      System.out.println("Таких чисел нет.");
    }
    System.out.println();
    System.out.println("Числа, длина которых, больше средней длины по всем числам:");
    boolean flag2 = true;
    for (int i = 0; i < lengtharray.length; i++) {
      if (lengtharray[i] > medium){
        System.out.println(array[i]);
        flag2 = false;
      }
    }
    if (flag2) {
      System.out.println("Таких чисел нет.");
    }
    System.out.println();
  }

  public void findNumberInWhichNumberOfDifferentDigitsIsMinimal(){
    System.out.println("4.Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.");
    char[] a = (array[0] + "").toCharArray();
    Arrays.sort(a);
    int differentDigitsCounter = 1;
    for (int j = 0; j < a.length-1; j++) {
      if (a[j] != a[j+1]){
        differentDigitsCounter++;
      }
    }
    int x = array[0];
    for (int i = 1; i < array.length; i++) {
      char[] b = (array[i] + "").toCharArray();
      Arrays.sort(b);
      int counter = 1;
      for (int j = 0; j < b.length-1; j++) {
        if (b[j] != b[j+1]){
          counter++;
        }
      }
      if (counter < differentDigitsCounter){
        differentDigitsCounter = counter;
        x = array[i];
      }
    }
    System.out.println("Число, в котором количество различных цифр минимально: " + x);
    System.out.println();
  }

}
