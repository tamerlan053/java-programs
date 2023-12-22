package packages.package9;

public class PersoonApp {
    public static void main(String[] args) {
        Person person = new Person("Tamerlan", "Aslakhanov");
        person.setBirthYear(2004);
        person.setWeight(89);
        person.setHeight(2);
        System.out.println(person);

        String[] namesToAdd = {"klot"};
        person.addFirstNames(namesToAdd);
        System.out.println(person);
        System.out.println("He is " + person.getAge() + " years old");


    }
}
