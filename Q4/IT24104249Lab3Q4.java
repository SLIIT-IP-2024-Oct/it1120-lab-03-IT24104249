import java.util.Scanner;
public class IT24104249Lab3Q4 {

    public static void main(String[] args) {
        int number,number1,number2,number3,number4;
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit-number: ");
        number = Scanner.nextInt();
        int digit1 = number / 10000;
        number1 = number % 10000;
        int digit2 = number1 / 1000;
        number2 = number % 1000;
        int digit3 = number2 / 100;
        number4 = number % 100;
        int digit4 = number4 / 10;
        int digit5 = number4 % 10;
        System.out.println("\n"+digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
    }

}