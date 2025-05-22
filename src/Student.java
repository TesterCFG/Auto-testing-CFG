public class Student {
String name;
String surname;
int yearOfStudy;
int groupNumber;


Student(String name, String surname, int yearOfStudy, int groupNumber){
    this.name = name;
    this.surname = surname;
    this.yearOfStudy = yearOfStudy;
    this.groupNumber = groupNumber;

}
String mail(String message){
    return name + ": " + message;
}
}
