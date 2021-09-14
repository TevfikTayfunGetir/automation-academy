package week2;

import java.util.Random;

public class DiceGame {

    public static void main(String args[])
    {

        int diceSum = 0;
        while( diceSum <= 50)
        {
            System.out.println("Rolling the die");

            Random random = new Random();
            int die = random.nextInt(6) + 1;

            if(die == 1)
            {
                System.out.println("Game is over. You have rolled 1 or 2");
                break;
            }

            else {
                diceSum = diceSum + die;
                System.out.println("Current sum is: " + diceSum);
            }

        }
        if(diceSum >= 50)
        System.out.println("Congratz you have earned " + diceSum + " amount of money");


    }



    }



