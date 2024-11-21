import java.util.Scanner;
public class IT24104249Lab3Q2 {

    public static void main(String[] args) {
        //inputs-monthlySalary,OT_hours,hourlyRates
        double monthlySalary,OT_hours,hourlyRate;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
         monthlySalary = input.nextDouble();

        System.out.println("Enter the no of OT hours: ");
         OT_hours = input.nextDouble();


        System.out.println("Enter the OT hourly rate: ");
         hourlyRate = input.nextDouble();

        double OTpay = OT_hours * hourlyRate;
        double totalPay = monthlySalary + OTpay;

        System.out.println("The total salary with OT is: " + totalPay);
    }
}