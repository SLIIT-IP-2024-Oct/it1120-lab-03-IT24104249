import java.util.Scanner;
public class IT24104249Lab3Q1A {

    public static void main(String[] args) {
        //price = price of 1Kg of rice
        //amount = amount of killograms that you want to buy
        double price;
        double amount;


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of 1Kg of rice : ");
        price = input.nextDouble();

        System.out.println("Enter the number of Killograms you want to buy : ");
        amount = input.nextDouble();
        double total = price * amount;

        //"\n" is skipping a line necessarry
        System.out.println("\nThe total amount is: " + total);
        }

}



