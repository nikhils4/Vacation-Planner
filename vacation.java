import java.util.Scanner;

public class vacation {
    public static void main(String[] args){
        greet();
        mid();
        time();
        end();
    }

    public static void greet() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String place = input.nextLine();
        System.out.println("Great! " + place + " sounds like a great trip");
        System.out.println("**********\n\n\n");
    }

    public static void mid() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double money = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String sym = input.next();
        System.out.print("How many "+sym+" are there in 1 USD? ");
        double conv = input.nextDouble();
        System.out.println("\n\n\n");
        System.out.println("If you are travelling for "+days+" days that is the same as "+days*24+" hours or "+days*24*60+" minutes");
        System.out.println("If you are going to spend $"+ (int) money +" USD that means per day you can spend up to $"+ money/days+" USD");
        System.out.println("Your total budget in "+sym+" is "+ money*conv + " " + sym + ", which oer day is " + (money*conv)/days + " " + sym);
        System.out.println("**********\n\n\n");
    }

    public static void time() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int diff = input.nextInt();
        int extra = 12 + diff;
        System.out.println("That means that when it is midnight at home it will be " + diff + ":00 in your travel destination and when it is noon at home it will be " + extra + ":00");
        System.out.println("**********\n\n\n");
    }

    public static void end() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2? ");
        int km = input.nextInt();
        System.out.println("In miles2 that is " + 0.386*km);
        System.out.println("**********\n\n\n");
    }


}
