package week4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Utils {

//değerlerden ötürü getirme ücreti adet başına 5 TL olmaktadır su anda

    public static boolean LoginFunction(UserInformation[] users) {
        boolean isValid = false;
        int counter = 0;
        String userName, password;

        Scanner scanner = new Scanner(System.in);

        while (!isValid && counter < 3) {
            System.out.println("Please enter username");
            userName = scanner.nextLine();
            System.out.println("Please enter password");
            password = scanner.nextLine();

            for (int i = 0; i < 5; i++) {
                if (users[i].getUserName().equals(userName) && users[i].getPassword().equals(password)) {
                    isValid = true;
                    System.out.println("/////////////////////");
                    System.out.println("Username is: " + users[i].getUserName());
                    System.out.println("Name is: " + users[i].getName());
                    System.out.println("Address is: " + users[i].getAddress());
                    System.out.println("Phonenumber is: " + users[i].getPhoneNumber());
                    System.out.println("Password is: " + users[i].getPassword());
                    System.out.println("/////////////////////");

                }
            }

            if (!isValid && counter < 2) {
                System.out.println("tekrar dene");
            }

            counter++;
        }

        return isValid;
    }


    public static int DisplayProducts(Product[] products) {
        int menuNumber, menuNumber2, menuNumber3;
        int totalPrice = 0;
        int feeCounter = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Press 1 to display all of the products");
        System.out.println("Press 2 to display categories and continue through there");
        System.out.println("Press 3 to payment");

        menuNumber = scanner.nextInt();
        switch (menuNumber) {
            case 1:
                for (int i = 0; i < 20; i++) {
                    System.out.println(products[i].getName() + " Price: " + products[i].getPrice() + "TL Discounted Price " + products[i].getDiscountPrice());
                }
                break;
            case 2:
                System.out.println("1. Meyve ve Sebze");
                System.out.println("2. Atıştırmalık");
                System.out.println("3. Kahvaltılık");
                menuNumber2 = scanner.nextInt();
                switch (menuNumber2) {
                    case 1:
                        System.out.println("1. Meyve");
                        System.out.println("2. Sebze");
                        menuNumber3 = scanner.nextInt();
                        if (menuNumber3 == 1) {

                                    System.out.println("----------");
                                    System.out.println(products[0].getName());
                                    System.out.println(products[1].getName());
                                    System.out.println(products[2].getName());
                                    System.out.println("Which Product do you want to buy?");

                                    int z;
                                    z = scanner.nextInt();
                                    switch(z){
                                        case 1:
                                            int a, parsed;
                                            System.out.println(products[0].getName() + "  " + products[0].getPrice() + "  " + products[6].getExplanation());

                                            System.out.println("How many " + products[0].getName());
                                            a = scanner.nextInt();
                                            feeCounter += a;
                                            parsed = Integer.parseInt(products[0].getDiscountPrice()) * a;
                                            totalPrice += parsed;
                                            System.out.println("Current total price is: " + totalPrice);
                                            break;
                                        case 2:
                                            int b ,parsedb;
                                            System.out.println(products[1].getName() + "  " + products[1].getPrice() + "  " + products[6].getExplanation());

                                            System.out.println("How many" + products[1].getName());
                                            b = scanner.nextInt();
                                            feeCounter += b;
                                            parsedb = Integer.parseInt(products[1].getDiscountPrice()) * b;
                                            totalPrice += parsedb;
                                            System.out.println("Current total price is: " + totalPrice);
                                            break;
                                        case 3:
                                            int c, parsedc;
                                            System.out.println(products[2].getName() + "  " + products[2].getPrice() + "  " + products[2].getExplanation());

                                            System.out.println("How many" + products[2].getName());
                                            c = scanner.nextInt();
                                            feeCounter += c;
                                            parsedc = Integer.parseInt(products[2].getDiscountPrice()) * c;
                                            totalPrice += parsedc;
                                            System.out.println("Current total price is: " + totalPrice);
                                            break;



                            }
                        }

                        else if (menuNumber3 == 2) {

                                    System.out.println("----------");
                                    System.out.println("Which Product do you want to buy?");
                                    System.out.println(products[3].getName());
                                    System.out.println(products[4].getName());
                                    System.out.println(products[5].getName());
                                    int z;
                                    z = scanner.nextInt();
                                    switch(z){
                                        case 1:
                                            int a, parsed;
                                            System.out.println(products[3].getName() + "  " + products[3].getPrice() + "  " + products[3].getExplanation());

                                            System.out.println("How many " + products[3].getName());
                                            a = scanner.nextInt();
                                            feeCounter += a;
                                            parsed = Integer.parseInt(products[3].getDiscountPrice()) * a;
                                            totalPrice += parsed;
                                            System.out.println("Current total price is: " + totalPrice);
                                            break;
                                        case 2:
                                            int b ,parsedb;
                                            System.out.println(products[4].getName() + "  " + products[4].getPrice() + "  " + products[4].getExplanation());

                                            System.out.println("How many" + products[4].getName());
                                            b = scanner.nextInt();
                                            feeCounter += b;
                                            parsedb = Integer.parseInt(products[4].getDiscountPrice()) * b;
                                            totalPrice += parsedb;
                                            System.out.println("Current total price is: " + totalPrice);
                                            break;
                                        case 3:
                                            int c, parsedc;
                                            System.out.println(products[5].getName() + "  " + products[5].getPrice() + "  " + products[5].getExplanation());

                                            System.out.println("How many" + products[5].getName());
                                            c = scanner.nextInt();
                                            feeCounter += c;
                                            parsedc = Integer.parseInt(products[5].getDiscountPrice()) * c;
                                            totalPrice += parsedc;
                                            System.out.println("Current total price is: " + totalPrice);
                                            break;
                                    }



                        }
                        break;
                    case 2:
                        System.out.println("1. Cips");
                        System.out.println("2. Çikolata");
                        menuNumber3 = scanner.nextInt();
                        if (menuNumber3 == 1) {

                                    System.out.println("----------");
                                    System.out.println("Which Product do you want to buy?");
                                    System.out.println(products[6].getName());
                                    System.out.println(products[7].getName());
                                    System.out.println(products[8].getName());
                                    int z;
                                    z = scanner.nextInt();
                                    switch(z){
                                        case 1:
                                            int a, parsed;
                                            System.out.println(products[6].getName() + "  " + products[6].getPrice() + "  " + products[6].getExplanation());
                                            System.out.println("How many " + products[6].getName());
                                            a = scanner.nextInt();
                                            feeCounter += a;
                                            parsed = Integer.parseInt(products[6].getDiscountPrice()) * a;
                                            totalPrice += parsed;
                                            System.out.println("Current total price is: " + totalPrice);
                                            break;
                                        case 2:
                                            int b ,parsedb;
                                            System.out.println(products[7].getName() + "  " + products[7].getPrice() + "  " + products[7].getExplanation());

                                            System.out.println("How many" + products[7].getName());
                                            b = scanner.nextInt();
                                            feeCounter += b;
                                            parsedb = Integer.parseInt(products[7].getDiscountPrice()) * b;
                                            totalPrice += parsedb;
                                            System.out.println("Current total price is: " + totalPrice);
                                            break;
                                        case 3:
                                            int c, parsedc;
                                            System.out.println(products[8].getName() + "  " + products[8].getPrice() + "  " + products[8].getExplanation());

                                            System.out.println("How many" + products[8].getName());
                                            c = scanner.nextInt();
                                            feeCounter += c;
                                            parsedc = Integer.parseInt(products[10].getDiscountPrice()) * c;
                                            totalPrice += parsedc;
                                            System.out.println("Current total price is: " + totalPrice);
                                            break;



                            }
                        } else if (menuNumber3 == 2) {

                                    System.out.println("----------");
                                    System.out.println("Which Product do you want to buy?");
                                    System.out.println(products[9].getName());
                                    System.out.println(products[10].getName());
                                    System.out.println(products[11].getName());
                                    int z;
                                    z = scanner.nextInt();
                                    switch(z){
                                        case 1:
                                            int a, parsed;
                                            System.out.println(products[9].getName() + "  " + products[9].getPrice() + "  " + products[9].getExplanation());

                                            System.out.println("How many " + products[9].getName());
                                            a = scanner.nextInt();
                                            feeCounter += a;
                                            parsed = Integer.parseInt(products[9].getDiscountPrice()) * a;
                                            totalPrice += parsed;
                                            System.out.println("Current total price is: " + totalPrice);
                                            break;
                                        case 2:
                                            int b ,parsedb;
                                            System.out.println("How many" + products[10].getName());
                                            b = scanner.nextInt();
                                            feeCounter += b;
                                            parsedb = Integer.parseInt(products[10].getDiscountPrice()) * b;
                                            totalPrice += parsedb;
                                            System.out.println("Current total price is: " + totalPrice);
                                            break;
                                        case 3:
                                            int c, parsedc;
                                            System.out.println("How many" + products[11].getName());
                                            c = scanner.nextInt();
                                            feeCounter += c;
                                            parsedc = Integer.parseInt(products[11].getDiscountPrice()) * c;
                                            totalPrice += parsedc;
                                            System.out.println("Current total price is: " + totalPrice);
                                            break;


                            }
                        }
                        break;
                    case 3:
                        System.out.println("1. Süt");
                        System.out.println("2. Şarküteri");
                        menuNumber3 = scanner.nextInt();
                        if (menuNumber3 == 1) {
                                    System.out.println("----------");
                                    System.out.println("Which Product do you want to buy?");
                                    System.out.println(products[12].getName());
                                    System.out.println(products[13].getName());
                                    System.out.println(products[14].getName());
                                    int z;
                                    z = scanner.nextInt();
                                    switch(z){
                                        case 1:
                                            int a, parsed;
                                            System.out.println(products[12].getName() + "  " + products[12].getPrice() + "  " + products[12].getExplanation());
                                            System.out.println("How many " + products[12].getName());
                                            a = scanner.nextInt();
                                            feeCounter += a;
                                            parsed = Integer.parseInt(products[12].getDiscountPrice()) * a;
                                            totalPrice += parsed;
                                            System.out.println("Current total price is: " + totalPrice);
                                        case 2:
                                            int b ,parsedb;
                                            System.out.println(products[13].getName() + "  " + products[13].getPrice() + "  " + products[13].getExplanation());

                                            System.out.println("How many" + products[13].getName());
                                            b = scanner.nextInt();
                                            feeCounter += b;
                                            parsedb = Integer.parseInt(products[13].getDiscountPrice()) * b;
                                            totalPrice += parsedb;
                                            System.out.println("Current total price is: " + totalPrice);
                                            break;
                                        case 3:
                                            int c, parsedc;
                                            System.out.println(products[14].getName() + "  " + products[14].getPrice() + "  " + products[14].getExplanation());
                                            System.out.println("How many" + products[14].getName());
                                            c = scanner.nextInt();
                                            feeCounter += c;
                                            parsedc = Integer.parseInt(products[14].getDiscountPrice()) * c;
                                            totalPrice += parsedc;
                                            System.out.println("Current total price is: " + totalPrice);
                                            break;

                            }
                        }
                        else if (menuNumber3 == 2) {
                                    System.out.println("----------");
                                    System.out.println("Which Product do you want to buy?");
                                    System.out.println(products[15].getName());
                                    System.out.println(products[16].getName());
                                    System.out.println(products[17].getName());
                                    System.out.println(products[18].getName());
                                    int z;
                                    z = scanner.nextInt();
                                    switch(z){
                                        case 1:
                                            int a, parsed;
                                            System.out.println(products[15].getName() + "  " + products[15].getPrice() + "  " + products[15].getExplanation());
                                            System.out.println("How many " + products[15].getName());
                                            a = scanner.nextInt();
                                            feeCounter += a;
                                            parsed = Integer.parseInt(products[15].getDiscountPrice()) * a;
                                            totalPrice += parsed;
                                            System.out.println("Current total price is: " + totalPrice);
                                            Utils.AdditionalSwitch(products);
                                            break;

                                        case 2:
                                            int b ,parsedb;
                                            System.out.println(products[16].getName() + "  " + products[16].getPrice() + "  " + products[16].getExplanation());
                                            System.out.println("How many" + products[16].getName());
                                            b = scanner.nextInt();
                                            feeCounter += b;
                                            parsedb = Integer.parseInt(products[16].getDiscountPrice()) * b;
                                            totalPrice += parsedb;
                                            System.out.println("Current total price is: " + totalPrice);
                                            Utils.AdditionalSwitch(products);
                                            break;
                                        case 3:
                                            int c, parsedc;
                                            System.out.println(products[17].getName() + "  " + products[17].getPrice() + "  " + products[17].getExplanation());

                                            System.out.println("How many" + products[17].getName());
                                            c = scanner.nextInt();
                                            feeCounter += c;
                                            parsedc = Integer.parseInt(products[17].getDiscountPrice()) * c;
                                            totalPrice += parsedc;
                                            System.out.println("Current total price is: " + totalPrice);
                                            Utils.AdditionalSwitch(products);
                                            break;
                                        case 4:
                                            int d, parsedd;
                                            System.out.println(products[18].getName() + "  " + products[18].getPrice() + "  " + products[18].getExplanation());
                                            System.out.println("How many" + products[18].getName());
                                            d = scanner.nextInt();
                                            feeCounter += d;
                                            parsedd = Integer.parseInt(products[18].getDiscountPrice()) * d;
                                            totalPrice += parsedd;
                                            System.out.println("Current total price is: " + totalPrice);
                                            Utils.AdditionalSwitch(products);
                                            break;

                                    }
                        }
                        break;
                }

            case 3:

                System.out.println("Your current cart is costs: " + totalPrice  + " TL");
                System.out.println("1 to proceed");
                System.out.println("2 to cancel");
                int u;
                u = scanner.nextInt();
                switch (u) {
                    case 1:
                        if (totalPrice > 100) {
                            System.out.println("FREE SHIPPING!");
                            System.out.println("Glad to serve you");

                        } else if (totalPrice <= 100) {
                            totalPrice += (feeCounter * 5);
                            System.out.println("Glad to serve you the cost of " + totalPrice + " TL is taken from your credit cart");
                        break;
                        }
                        System.exit(0);
                    case 2:
                        System.out.println("Returning to main menu with an empty basket");
                        totalPrice = 0;
                        break;
                }



        }
        return totalPrice;

    }

    public static void ProductSearch(Product products[]) {
        String userSearch;
        Scanner scanner = new Scanner(System.in);
        boolean searching = true;
        userSearch = scanner.nextLine();

        while(searching){

        if (userSearch.length() < 3) {
            System.out.println("Please enter at least 3 String length input");
            userSearch = scanner.nextLine();
        }
        else if(userSearch == "0")
        {
            searching = false;
        }
        else {
            for (int i = 0; i < 20; i++) {
                if (products[i].getName().toLowerCase().contains(userSearch.toLowerCase())) {
                    System.out.println(products[i].getName() + " Price is: " + products[i].getPrice() + " TL  Discounted " + products[i].getDiscountPrice());
                }
                searching = false;
            }
        }

        }
    }

    public static void AdditionalSwitch(Product products[]){
        int a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. To main menu");
        System.out.println("2. To Quit");

        a = scanner.nextInt();
        switch(a){
            case 1:
                Utils.DisplayProducts(products);
                break;
            case 2:
                System.exit(0);
                break;
        }
    }






}




