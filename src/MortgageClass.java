import java.util.Scanner;
public class MortgageClass {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double loan = 0;
        double rate= 0;
        double mainResultMethod = 0;
        double balance = 0;
        int year;

        System.out.printf("Enter the loan amount: ");
        loan = keyboard.nextDouble();


        System.out.printf("Enter the interest rate on the loan: ");
        rate = keyboard.nextDouble();

        System.out.printf("Enter the term (years) for the loan payment: ");
        year = keyboard.nextInt();

        System.out.printf("\n======================================");
        keyboard.close();

        mainResultMethod = getMonthlyPayment(loan, rate, year);
       balance = -(mainResultMethod*(year*12));
       System.out.format("Balance owed to bank: ");
        System.out.format("Minimum monthly payment: ");
    }

    public static double getMonthlyPayment(double loan, double ratemain, int year) {
        double rate = (loan / 100) / 12;
        double base = (rate + ratemain);
        double months = year * 12;
        double result = 0.0;
        result = ratemain* (rate * (Math.pow(base, months)) / Math.pow(base, months));
        return result;
    }

}