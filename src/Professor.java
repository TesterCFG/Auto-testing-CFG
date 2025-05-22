public class Professor {
String name;
String surname;
int experiense;

Professor(String name, String surname, int experiense){
    this.name = name;
    this.surname = surname;
    this.experiense = experiense;

}
void mail(){
    System.out.println(name + "Відправка");
}

}
