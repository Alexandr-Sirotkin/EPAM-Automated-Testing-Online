package EpamLearn.ClassesModule;

public class Student {

  private int id;
  private String surname;
  private String name;
  private String patronymic;
  private String dataOfBirth;
  private String address;
  private String phone;
  private Faculty faculty;
  private int course;
  private String group;

  public Student() {
  }

  public Student(int id, String surname, String name, String patronymic, String dataOfBirth,
      String address, String phone, Faculty faculty, int course, String group) {
    this.id = id;
    this.surname = surname;
    this.name = name;
    this.patronymic = patronymic;
    this.dataOfBirth = dataOfBirth;
    this.address = address;
    this.phone = phone;
    this.faculty = faculty;
    this.course = course;
    this.group = group;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public String getDataOfBirth() {
    return dataOfBirth;
  }

  public void setDataOfBirth(String dataOfBirth) {
    this.dataOfBirth = dataOfBirth;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getFaculty() {
    return this.faculty.getRealNameFaculty();
  }

  public void setFaculty(Faculty faculty) {
    this.faculty = faculty;
  }

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    this.course = course;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  @Override
  public String toString() {
    return "Student: " + "\n" +
        "id: " + id + "; " + "\n" +
        "surname: " + surname + "; " + "\n" +
        "name: " + name + "; " + "\n" +
        "patronymic: " + patronymic + "; " + "\n" +
        "dataOfBirth: " + dataOfBirth + "; " + "\n" +
        "address: " + address + "; " + "\n" +
        "phone: " + phone + "; " + "\n" +
        "faculty: " + getFaculty() + "; " + "\n" +
        "course: " + course + "; " + "\n" +
        "group: " + group + "."+ "\n";
  }

  public boolean equalsFaculty(String faculty) {
    return faculty.equals(this.faculty.toString());
  }

  public boolean equalsFacultyCourse(Faculty faculty, int course) {
    return faculty.equals(this.faculty) && course == this.course;
  }

  public boolean dataOfBirthAfter(String year) {
    return Integer.parseInt(this.dataOfBirth.substring(6)) > Integer.parseInt(year);
  }

  public boolean equalsGroup(String group) {
    return group.equalsIgnoreCase(this.group);
  }

}
