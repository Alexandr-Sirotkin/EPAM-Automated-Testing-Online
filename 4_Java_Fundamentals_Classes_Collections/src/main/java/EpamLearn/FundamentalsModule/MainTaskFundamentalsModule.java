package EpamLearn.FundamentalsModule;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainTaskFundamentalsModule {

  public void runAllTasks(String[] args) {

    MainTaskFundamentalsModule task = new MainTaskFundamentalsModule();
    task.welcomeUser();
    task.showCommandLineArgumentsInReverseOrder(args);
    task.printNumbersWithLineBreak();
    task.printNumbersWithoutNewline();
    task.sumAndMultiplyOfCommandLineArguments(args);
    task.printNameMonthCorrespondingNumber();

  }


  public void welcomeUser() {

    System.out.println(
        "1. Приветствовать любого пользователя при вводе его имени через командную строку.");
    System.out.println("Введите ваше имя:");

    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String name = reader.readLine();
      System.out.println("Доброго времени суток, " + name + ".");
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println();
  }

  public void showCommandLineArgumentsInReverseOrder(String[] args) {

    System.out
        .println("2.Отобразить в окне консоли аргументы командной строки в обратном порядке.");

    if (args.length != 0) {
      for (int i = args.length - 1; i >= 0; i--) {
        System.out.print(args[i] + " ");
      }
    } else {
      System.out.println("args=0!");
    }
    System.out.println();
    System.out.println();
  }

  public void printNumbersWithLineBreak() {

    System.out
        .println("3.1. Вывести заданное количество случайных чисел с переходом на новую строку.");
    System.out.println("Введите количество случайных чисел:");

    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int numbers = Integer.parseInt(reader.readLine());
      int arrayNum[] = new int[numbers];
      for (int i = 0; i < arrayNum.length; i++) {
        arrayNum[i] = (int) (Math.random() * 10);
        System.out.println(arrayNum[i]);
      }
      System.out.println();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void printNumbersWithoutNewline() {

    System.out
        .println("3.2. Вывести заданное количество случайных чисел без перехода на новую строку.");
    System.out.println("Введите количество случайных чисел:");

    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int numbers = Integer.parseInt(reader.readLine());
      int arrayNum[] = new int[numbers];
      for (int i = 0; i < arrayNum.length; i++) {
        arrayNum[i] = (int) (Math.random() * 10);
        System.out.print(arrayNum[i] + " ");
      }
      System.out.println();
      System.out.println();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public void sumAndMultiplyOfCommandLineArguments(String[] args) {
    System.out
        .println(
            "4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.");
    int sum = 0;
    int multip;
    if (args.length != 0) {
      multip = 1;
    } else {
      multip = 0;
    }
    for (int i = 0; i < args.length; i++) {
      sum += Integer.parseInt(args[i]);
      multip *= Integer.parseInt(args[i]);
    }
    System.out.println("Сумма: " + sum);
    System.out.println("Произведение: " + multip);
    System.out.println();
  }

  public void printNameMonthCorrespondingNumber() {
    System.out.println(
        "5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.");
    System.out.println("Введите число от 1 до 12:");

    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int number = Integer.parseInt(reader.readLine());
      switch (number) {
        case 1:
          System.out.println("Январь.");
          break;
        case 2:
          System.out.println("Февраль.");
          break;
        case 3:
          System.out.println("Март.");
          break;
        case 4:
          System.out.println("Апрель.");
          break;
        case 5:
          System.out.println("Май.");
          break;
        case 6:
          System.out.println("Июнь.");
          break;
        case 7:
          System.out.println("Июль.");
          break;
        case 8:
          System.out.println("Август.");
          break;
        case 9:
          System.out.println("Сентябрь.");
          break;
        case 10:
          System.out.println("Октябрь.");
          break;
        case 11:
          System.out.println("Ноябрь.");
          break;
        case 12:
          System.out.println("Декабрь.");
          break;
        default:
          System.out.println("Неверно задано число.");
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println();

  }

}
