package week3;

public class Person {
    String name;
    String surname;
    String gender;
    int age;

    void defaultVariables()
    {
        name = "PersonName";
        surname = "PersonSurname";
        gender = "PersonGender";
        age = 25;

        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println(gender);
    }
}
