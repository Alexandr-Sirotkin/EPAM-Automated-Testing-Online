package EpamLearn.ClassesModule;

public enum Faculty {
  ENERGY("Энергетический"), IN_ABSENTIA("Заочный"), FAIS("ФАИС"), MACHINE_BUILDING(
      "Машиностроительный"), MECHANICAL_TECHNOLOGICAL("Механико-технологический");
  private String realNameFaculty;

  Faculty(String realNameFaculty) {
    this.realNameFaculty = realNameFaculty;
  }

  Faculty() {
  }

  public String getRealNameFaculty() {
    return realNameFaculty;
  }
}
