package week3;

import java.util.Scanner;

public class Student extends Person {

    int year;
    int credits;

    public static void main(String args[])
    {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        Course course = new Course();
        course.setName("English Course");
        course.setCredit(3);
        course.setStudentCount(10);

        System.out.println("Name?");
        student.name = scanner.nextLine();
        System.out.println("Surname?");
        student.surname = scanner.nextLine();
        System.out.println("Years");
        student.year = scanner.nextInt();
        System.out.println("Age?");
        student.age = scanner.nextInt();
        student.gender = scanner.nextLine();
        System.out.println("Gender?");
        student.gender = scanner.nextLine();


        System.out.println("Your name is " + student.name);
        System.out.println("Your surname is " + student.surname);
        System.out.println("Studying for " + student.year + "years");
        System.out.println("Your age is " + student.age);
        System.out.println("Your gender is " + student.gender);

        System.out.println("Do you want to take Math class? Y or N");
        String answer = scanner.nextLine();
        System.out.println("How many credits do you currently have?");
        int credits = scanner.nextInt();

        credits = credits + course.credit;

        if(course.studentCount < 20 && answer.equals("Y") && credits <= 20)
        {
            System.out.println("You can take this class");
        }
        else{
            System.out.println("Can't take the course");
        }


        scanner.close();

    }


}
