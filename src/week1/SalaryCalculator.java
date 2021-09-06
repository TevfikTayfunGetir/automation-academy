package week1;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args){

    double hourlySalary = 25;
    double totalWorkHours = 0;
    double totalSalary = 0;
    double weekHours, weekendHours, extraWeekHours;

    System.out.println("Please enter the hours you have worked in this week");
    Scanner scanner = new Scanner(System.in);
    weekHours = scanner.nextInt();

    System.out.println("Please enter the hours you have worked in this weekend");
    weekendHours = scanner.nextInt();
    scanner.close();

    totalWorkHours = weekendHours + weekHours;

    if(totalWorkHours >= 50 && weekHours >= 40)
    {
        extraWeekHours = weekHours - 40;
        weekHours = weekHours - extraWeekHours;
        totalSalary = (weekHours * 25) + (weekendHours * 25) * 2 + (extraWeekHours * 25) * 1.5;
        totalSalary = totalSalary + 500;
    }

    else if(totalWorkHours >= 50 && weekHours <= 40){
            totalSalary = (weekHours * 25) + (weekendHours * 25) * 2;
            totalWorkHours = totalWorkHours + 500;
        }

    else if(totalWorkHours <= 50 && weekHours <= 40){
        totalSalary = (weekHours * 25) + (weekendHours * 25) * 2;
    }
        System.out.println("Your total Salary is: " + totalSalary);
    }

}
