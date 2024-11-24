
import java.util.Scanner;

public class IT24104249Lab3Q3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

          System.out.print("Enter the Rupee Amount(Rs): ");
          int amount = scanner.nextInt();

       
        int notes5000 =amount / 5000;
        int remainder1 = amount % 5000;

        
        int notes1000= remainder1 / 1000;
        int remainder2 = remainder1 % 1000;

        int notes500 = remainder2 / 500;
        int remainder3 = remainder2 % 500;

        int notes100 = remainder3 / 100;
        int remainder4 = remainder3 % 100;

        int notes50 = remainder4 / 50;
        int remainder5 = remainder4 % 50;
 
        int notes20 = remainder5 / 20;
        int remainder6 = remainder5 % 20;
   
        int notes10 = remainder6 / 10;
        int remainder7 = remainder6 % 10;
        
        int notes5 = remainder7 / 5;
        int remainder8 = remainder7 % 5;
            
        int notes2 = remainder8 / 2;
        int remainder9 = remainder8 % 2;

        int notes1 = remainder9 / 1;
        int remainder10 = remainder9 % 1;

        System.out.print("5000 notes= " + notes5000 );
        System.out.print("\n1000 notes= " + notes1000);
        System.out.print("\n500 notes= " + notes500);
        System.out.print("\n100 notes= " + notes100);
        System.out.print("\n50_notes= " + notes50);
        System.out.print("\n20 notes= " + notes20);
        System.out.print("\n10 notes= " + notes10);
        System.out.print("\n5 notes= " + notes5);
        System.out.print("\n2 notes= " + notes2);
        System.out.print("\n1 notes= " + notes1);
        System.out.print("\ncents= " + remainder10);

        
     }
  
  }
        
          
	 
        
        
       
       
       
    
