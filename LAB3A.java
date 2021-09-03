import java.util.Scanner;
public class LAB3A {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
double amount, APR, mpr, minPayment;
System.out.print("Amount owed: $");
amount=scan.nextDouble();
System.out.print("APR: ");
APR=scan.nextDouble();
minPayment=(amount * APR/12)/100;
        mpr = (minPayment/amount)*100;
        System.out.println("\nMonthly percentge rate: "+String.format("%.5f", mpr));
        System.out.println("Minimum Payment: "+String.format("%.5f", minPayment));
      

    }
}