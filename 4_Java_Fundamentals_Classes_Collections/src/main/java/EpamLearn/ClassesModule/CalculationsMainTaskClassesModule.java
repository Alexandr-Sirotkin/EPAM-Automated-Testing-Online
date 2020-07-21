package EpamLearn.ClassesModule;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculationsMainTaskClassesModule {

  private final int MAX_COURSE = 5;
  private static Student[] students = new Student[6];

  static {
    students[0] = new Student(123456, "Шевчук", "Николай", "Сергеевич", "12.08.1988",
        "Гомель. Советский район", "3750295634562", Faculty.ENERGY, 2, "ТЭ21");
    students[1] = new Student(153753, "Богуш", "Максим", "Максимович", "23.05.1989",
        "Гомель. Новобелица", "3750335634668", Faculty.IN_ABSENTIA, 4, "АГ41");
    students[2] = new Student(173742, "Ковалев", "Егор", "Игоревич", "01.03.1986",
        "Гомель. Сельмаш", "3750295645828", Faculty.MACHINE_BUILDING, 5, "МС51");
    students[3] = new Student(174782, "Якушев", "Сергей", "Александрович", "02.04.1989",
        "Гомель. Волотова", "3750335745832", Faculty.MECHANICAL_TECHNOLOGICAL, 3, "МТ31");
    students[4] = new Student(164832, "Чуешков", "Евгений", "Сергеевич", "13.09.1987",
        "Гомель. Новобелица", "3750295735781", Faculty.FAIS, 1, "Э11");
    students[5] = new Student(167824, "Корнеев", "Алексей", "Михайлович", "25.12.1989",
        "Гомель. Новобелица", "3750335682043", Faculty.ENERGY, 3, "ТЭ31");
  }

  public void runAllTasks() {
    CalculationsMainTaskClassesModule calculationsMainTaskClassesModule = new CalculationsMainTaskClassesModule();
    calculationsMainTaskClassesModule.printListOfStudentsOfFaculty();
    calculationsMainTaskClassesModule.printListOfStudentsForEachFacultyAndCourse();
    calculationsMainTaskClassesModule.printListOfStudentsWhoWereBornAfterSpecifiedYear();
    calculationsMainTaskClassesModule.printListOfTrainingGroup();
  }

  public void printListOfStudentsOfFaculty() {
    System.out.println("Вывести: a) список студентов заданного факультета;");
    System.out.println(
        "Введите факультет из следующих: Энергетический, Заочный, ФАИС, Машиностроительный, Механико-технологический.");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      String faculty = reader.readLine();
      String facultyNameInEnglish;
      switch (faculty) {
        case "ФАИС":
          facultyNameInEnglish = "FAIS";
          break;
        case "Энергетический":
          facultyNameInEnglish = "ENERGY";
          break;
        case "Заочный":
          facultyNameInEnglish = "IN_ABSENTIA";
          break;
        case "Машиностроительный":
          facultyNameInEnglish = "MACHINE_BUILDING";
          break;
        case "Механико-технологический":
          facultyNameInEnglish = "MECHANICAL_TECHNOLOGICAL";
          break;
        default:
          facultyNameInEnglish = "Ошибка";
          System.out.println("Неверно задан факультет");
      }
      faculty = facultyNameInEnglish;
      System.out.println("Cписок студентов заданного факультета:");
      boolean thereAreNoStudentsFromTheGivenFaculty = true;
      for (int i = 0; i < students.length; i++) {
        if (students[i].equalsFaculty(faculty)) {
          System.out.println(students[i]);
          thereAreNoStudentsFromTheGivenFaculty = false;
        }
      }
      if (thereAreNoStudentsFromTheGivenFaculty) {
        System.out.println("Студентов из заданного вами факультета нет.");
      }
      System.out.println();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public void printListOfStudentsForEachFacultyAndCourse() {
    System.out.println("Вывести: b) списки студентов для каждого факультета и курса;");
    System.out.println("Cписки студентов для каждого факультета и курса:");
    for (Faculty fac : Faculty.values()) {
      for (int j = 1; j <= MAX_COURSE; j++) {
        int amountOfStudents = 0;
        boolean weAreInTheListHeader = true;
        for (int i = 0; i < students.length; i++) {
          if (students[i].equalsFacultyCourse(fac, j)) {
            if (weAreInTheListHeader) {
              System.out
                  .println("Студенты факультета " + students[i].getFaculty() + " " + j + " курса:");
            }
            weAreInTheListHeader = false;
            System.out.println(students[i]);
            amountOfStudents = amountOfStudents + 1;
          }
          if ((i == students.length - 1) && amountOfStudents == 0) {
            System.out.println(
                "Студентов факультета " + fac.getRealNameFaculty() + " " + j + " курса нет.");
          }
        }
      }
    }
    System.out.println();
  }

  public void printListOfStudentsWhoWereBornAfterSpecifiedYear() {
    System.out.println("Вывести: c) список студентов, родившихся после заданного года;");
    System.out.println("Cписок студентов, родившихся после заданного года:");
    System.out.println("Введите год:");
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String year = reader.readLine();
      boolean thereAreNoStudentsMatchingTheRequest = true;
      for (int i = 0; i < students.length; i++) {
        if (students[i].dataOfBirthAfter(year)) {
          System.out.println(students[i]);
          thereAreNoStudentsMatchingTheRequest = false;
        }
      }
      if (thereAreNoStudentsMatchingTheRequest) {
        System.out.println("Студентов соответствующих запросу нет.");
      }
      System.out.println();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void printListOfTrainingGroup() {
    System.out.println("Вывести: d) список учебной группы.");
    System.out.println("Cписок учебной группы:");
    System.out
        .println("Введите учебную группу из перечисленных: ТЭ21, АГ41, МС51, МТ31, Э11, ТЭ31");
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String group = reader.readLine();
      boolean groupDoesNotExist = true;
      for (int i = 0; i < students.length; i++) {
        if (students[i].equalsGroup(group)) {
          System.out.println(students[i]);
          groupDoesNotExist = false;
        }
      }
      if (groupDoesNotExist) {
        System.out.println("Такой группы нет.");
      }
      System.out.println();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
