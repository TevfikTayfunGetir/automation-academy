package week4;


import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);

        String userName, password;
        boolean isValid = false;
        boolean isRunning = true;

        int menuNumber;

        UserInformation[] users;
        users = new UserInformation[5];

        users[0] = new UserInformation("Ahmet", "ahmet", "asdf", "505050500", "adres1");
        users[1] = new UserInformation("Mehmet", "mehmet", "asdf", "505050501", "adres2");
        users[2] = new UserInformation("Kemal", "cemal", "asdf", "505050502", "adres3");
        users[3] = new UserInformation("Hatice", "hatice", "asdf", "505050503", "adres4");
        users[4] = new UserInformation("Tevfik", "tevfik", "asdf", "505050504", "adres5");

        Product[] products;
        products = new Product[20];

        products[0] = new Product("1", "1","Elma","2","1","Taze Elma");
        products[1] = new Product("1", "1", "Armut", "3", "2", "Taze Armut");
        products[2] = new Product("1", "1", "Üzüm", "5", "3", "Taze Üzüm");
        products[3] = new Product("1", "2", "Domates", "3", "1", "Taze Domat");
        products[4] = new Product("1", "2", "Biber", "6", "4", "Taze Biber");
        products[5] = new Product("1", "2", "Patlıcan", "6", "3", "Taze Patlıcan");
        products[6] = new Product("2", "1", "Lays", "3", "1", "LAYS CIPS");
        products[7] = new Product("2", "1", "Doritos", "4", "2", "DORITOS");
        products[8] = new Product("2", "1", "Ruffles", "5", "3", "RUFFLES");
        products[9] = new Product("2", "2", "Tadelle", "3", "1", "TADELLE");
        products[10] = new Product("2", "2", "Albeni", "2", "1", "ALBENI");
        products[11] = new Product("2", "2", "Metro", "2", "1", "METRO");
        products[12] = new Product("3", "1", "Tam Yağlı", "4", "2", "AZ");
        products[13] = new Product("3", "1", "Az Yağlı", "2", "1", "COK");
        products[14] = new Product("3", "1", "Laktozsuz", "3", "1", "LAKTOZSUZ");
        products[15] = new Product("3", "2", "Kaşar", "3", "1", "Kaşar");
        products[16] = new Product("3", "2", "Peynir", "3", "1", "Peynir");
        products[17] = new Product("3", "2", "Salam", "3", "1", "Salam");
        products[18] = new Product("3", "2", "Sucuk", "3", "1", "Sucuk");
        products[19] = new Product("3", "2", "Zeytin", "3", "1", "Zeytin");


        if (!Utils.LoginFunction(users))
        {
            isRunning = false;
            System.out.println("Too many mistakes");
        }

        while (isRunning)
        {
            System.out.println("------------------------------------");
            System.out.println("Press 1 to login with different account");
            System.out.println("Press 2 to go to Landing Page");
            System.out.println("Press 3 to search for specific product");
            System.out.println("Press 0 to exit");
            System.out.println("------------------------------------");


            menuNumber = scanner.nextInt();
            switch(menuNumber){
                case 0:
                    System.exit(0);
                case 1:
                    if (!Utils.LoginFunction(users))
                    {
                        isRunning = false;
                        System.out.println("Closing down");
                    }
                    break;
                case 2:
                    Utils.DisplayProducts(products);
                    break;
                case 3:
                    System.out.println("Please Enter at least 3 words to search");
                    Utils.ProductSearch(products);


            }

        }




    }

}



