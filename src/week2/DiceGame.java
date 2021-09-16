package week2;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String args[])
    {

        int diceSum = 0;
        Scanner scanner = new Scanner(System.in);
        while( diceSum <= 50) {

            System.out.println("Your money is " + diceSum);


            System.out.println("Wanna continue? ");

            String s = scanner.nextLine();

            if (s.equals("Y")){
                System.out.println("Rolling the die");

                Random random = new Random();
                int die = random.nextInt(6) + 1;

                if (die == 1 || die == 2) {
                    System.out.println("Game is over. You have rolled 1 or 2");
                    break;
                } else {
                    diceSum = diceSum + die;
                    System.out.println("Current sum is: " + diceSum);
                }

            }

            else if(s.equals("N")){
                System.out.println("Game Over. Your money is: " + diceSum);
            }

        }
        if(diceSum >= 50)
        System.out.println("Congratz you have earned " + diceSum + " amount of money");

        scanner.close();

    }



    }



