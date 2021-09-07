package week1;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args){

    double hourlySalary = 25;
    double totalWorkHours;
    double totalSalary = 0;
    double weekHours, weekendHours, extraWeekHours;

    System.out.println("Please enter the hours you have worked in this week");
    Scanner scanner = new Scanner(System.in);
    weekHours = scanner.nextInt();

    System.out.println("Please enter the hours you have worked in this weekend");
    weekendHours = scanner.nextInt();
    scanner.close();



    totalWorkHours = weekendHours + weekHours;

    if(weekHours >= 40 && weekendHours >= 10)
    {
        extraWeekHours = weekHours - 40;
        weekHours = weekHours - extraWeekHours;
        totalSalary = (weekHours * hourlySalary) + (weekendHours * hourlySalary) * 2 + (extraWeekHours * hourlySalary) * 1.5;
        totalSalary = totalSalary + 500;
    }

    /*else if(totalWorkHours > 50 && weekHours == 40){
            totalSalary = (weekHours * 25) + (weekendHours * 25) * 2;
            totalSalary = totalSalary + 500;
        }

     */

    else if(totalWorkHours < 50 && weekHours <= 40){
        totalSalary = (weekHours * 25) + (weekendHours * 25) * 2;
    }

        if(weekHours < 0 || weekendHours < 0)
            System.out.println("Please enter proper values");

        else if(weekHours > 65 || weekendHours > 65 )
            System.out.println("Please enter proper values");

        else System.out.println("Your total Salary is: " + totalSalary);
    }

}
