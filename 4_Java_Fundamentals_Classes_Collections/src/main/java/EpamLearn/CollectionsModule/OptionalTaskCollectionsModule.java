package EpamLearn.CollectionsModule;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class OptionalTaskCollectionsModule {

  private static String verse = "Уж небо осенью дышало,\n" +
      "Уж реже солнышко блистало,\n" +
      "Короче становился день,\n" +
      "Лесов таинственная сень\n" +
      "С печальным шумом обнажалась,\n" +
      "Ложился на поля туман,\n" +
      "Гусей крикливых караван\n" +
      "Тянулся к югу: приближалась\n" +
      "Довольно скучная пора;\n" +
      "Стоял ноябрь уж у двора.";


  public void runAllTasks() {
    OptionalTaskCollectionsModule task = new OptionalTaskCollectionsModule();
    task.inputLinesFromFileAndOutputToReverseOrder();
    task.printNumberWithNumeralsInReverseOrder();
    task.printVerseSortedByLineLength();
  }

  public void inputLinesFromFileAndOutputToReverseOrder() {
    System.out.println(
        "Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.");
    System.out
        .println("Смотрите файл fileForOptionalTaskInTheCollectionsSection.txt в папке resources.");
    System.out.println();
    String separator = File.separator;
    String path =
        "src" + separator + "main" + separator + "java" + separator + "resources" + separator
            + "fileForOptionalTaskInTheCollectionsSection.txt";
    File file = new File(path);
    List<String> list = new ArrayList<>();
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      String lineFromFile;
      while ((lineFromFile = reader.readLine()) != null) {
        list.add(lineFromFile);
      }
      PrintWriter writer = new PrintWriter(file);
      for (int i = list.size() - 1; i >= 0; i--) {
        writer.println(list.get(i));
      }
      writer.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void printNumberWithNumeralsInReverseOrder() {
    System.out.println(
        "Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.");
    Stack<String> stack = new Stack<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите число:");
    try {
      String number = reader.readLine();
      reader.close();
      char[] arrayOfNumerals = number.toCharArray();
      for (char numeral : arrayOfNumerals) {
        stack.push(String.valueOf(numeral));
      }
      String numberInReverseOrderOfNumerals = "";
      while (!stack.isEmpty()) {
        numberInReverseOrderOfNumerals += stack.pop();
      }
      System.out.println("Число, у которого цифры идут в обратном порядке:");
      System.out.println(numberInReverseOrderOfNumerals);
      System.out.println();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void printVerseSortedByLineLength() {
    System.out
        .println("Занести стихотворение в список. Провести сортировку по возрастанию длин строк.");
    System.out.println("Стихотворение с сортировкой по возрастанию длин строк:");
    List<String> lines = Arrays.asList(verse.split("\n"));
    Collections.sort(lines, ((o1, o2) -> o1.length() - o2.length()));
    for (String line : lines) {
      System.out.println(line);
    }
  }

}
