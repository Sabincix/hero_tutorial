import java.util.Scanner;

public class HeroApplication {

    public static void main(String[] args) {

    //  Variable initialization

        String heroName;
        String heroCity;

        String heroPower1, heroPower2, heroPower3;

        boolean isEvil;

        double heroSalary;
        String realName;

        String universe;

    //  Variable assignment
        heroName = "CorgiGirl";
        heroCity = "Ogre";
        heroPower1 = "Controls pets";
        heroPower2 = "Can train stubborn pets";
        heroPower3 = "";
        isEvil = false;
        heroSalary = 500.0;
        realName = "Katrina";
        universe = "Ours";

    //  Print out Hero information card
        System.out.println("***********************************");
        System.out.println("*** HERO INFORMATION ***");
        System.out.println("***********************************");

        System.out.println("Hero name:");
        System.out.println(heroName);
        System.out.println("This hero lives in " + heroCity);

        System.out.println("---------------------");
        System.out.println("Hero superpowers");
        System.out.println("----");
        System.out.println("---" +  heroPower1);
        System.out.println("---" +  heroPower2);
        System.out.println("---" +  heroPower3);

        System.out.println("This super hero is evil? " +isEvil);

        System.out.println("This hero earns: " +heroSalary + " EUR");
        System.out.println(realName + " hides his identity");
        System.out.println("Hero live in " + universe + " Universe");

        System.out.println("***********************************");
        System.out.println("*** HERO INFORMATION ***");
        System.out.println("***********************************");


// Math
        // How many cookies can superhero purchase for his/her salary
        // 1 cookie costs = 1.29 euro

        System.out.println("***********************************");
        System.out.println("**************Financials***************");
        int numOfCookies = (int)Math.floor(heroSalary / 1.29);
        System.out.println(" Hero can purchase " + numOfCookies + " Cookies");
        double averageDailySalary = Math.round( heroSalary / 30 * 100) / 100;
        System.out.println(" Hero average daily salary is " + averageDailySalary);

        if(isEvil) {
            System.out.println("Hero is a villain, he is stealing cookies!");
        } else  {
            System.out.println("hero protects the city");
        }


        heroCity = "Metropolis";

        switch ( heroCity) {
            case "New York":
                heroSalary = 2000;
                break;
            case "Riga":
                heroSalary = 1200.91;
                break;
            case "Metropolis":
                heroSalary = 1000000;
                break;
            default:
                heroSalary = 500;
        }
        System.out.println("Hero's new salary: " + heroSalary);

        System.out.println("***********************************");
        System.out.println("**************Financials***************");
        numOfCookies = (int)Math.floor(heroSalary / 1.29);
        System.out.println(" Hero can purchase " + numOfCookies + " Cookies");
        averageDailySalary = Math.round( heroSalary / 30 * 100) / 100;
        System.out.println(" Hero average daily salary is " + averageDailySalary);


//        char A, B, C, D, E, F, G, H, I, K, L, M, N, O, P, Q, R, S, T, V, X, Y, Z;
//        String evalutionGrades;

        // Superhero work evaluation. A, B, C, D. User inputs grade in the console.

        System.out.println("Please enter the grade: ");
        Scanner scanner = new Scanner(System.in);

        char grade = scanner.next().charAt(0);

        // grade = 'A';  // Can be used to enter grade from here

        switch (grade) {
            // Case A or B using switch
            case 'A':
                case 'B':
                    System.out.println(" Perfect! You are so brave!");
                break;
            case 'C':
                System.out.println("Good! But You can do better!");
                break;
            case 'D':
                case 'E':
                System.out.println("It is not good! You should choose your bad or good side!");
                break;
            case 'F':
                case 'G':
                    System.out.println("Bad, you are true villain");
                break;
            default:
                System.out.println("Please stop lying!");
        }


    }
}
