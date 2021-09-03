import java.util.Scanner;

public class LAB3C {
    public static void main(String[] args){
Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of quarters: ");
        int quarters = in.nextInt();
        System.out.print("Enter the number of dimes: ");
        int dimes = in.nextInt();
        System.out.print("Enter the number of nickels: ");
        int nickels = in.nextInt();
        System.out.print("Enter the number of pennies: ");
        int pennies = in.nextInt();

        System.out.println();
        System.out.println("You entered " + quarters + " quarters.");
        System.out.println("You entered " + dimes + " dimes.");
        System.out.println("You entered " + nickels + " nickels.");
        System.out.println("You entered " + pennies + " pennies.");

        int totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
        System.out.println();
        System.out.println("Your total is " + (totalCents / 100) + " dollars and " + (totalCents % 100) + " cents.");}
}