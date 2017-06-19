package printing;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Print_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*printing atm  : More printing*/
	       System.out.println("+--------------------------------------+");
	       System.out.println("|      Java Bank ATM Receipt           |");
	       System.out.println("|      Wednesday, December 2, 2015     |");
	       System.out.println("|      ATM Location # 123              |");
	       System.out.println("|                                      |");
	       System.out.println("|                                      |");
	       System.out.println("|      Account Number:      1234567    |");
	       System.out.println("|      Customer:     John Q. Public    |");
	       System.out.println("|      Transaction Type:    Deposit    |");
	       System.out.println("|      Transaction Amount:  $500.00    |");
	       System.out.println("|      Account Balance:   $1,500.00    |");
	       System.out.println("|                                      |");
	       System.out.println("|      Thank you for banking with us   |");
	       System.out.println("|            Have a coffee day         |");
	       System.out.println("|                                      |");
	       System.out.println("+--------------------------------------+");
	       
	       /* A program for yourself*/
	       
	        System.out.println("Lubaba Nuzhat Tasneem");
	        System.out.println("27");
	        
	        /* Debug this program */
	        
	        /*
	         public class DebugProg {
 public static void main(String[] args) {
 double x, y;
 
 x = 3.1415;
 y = 3.64;
 
 System.out.println("pi is approximately " + x);
 System.out.println("My GPA was " + y);
 }
}
	         */
	        
	        
	        /*Math Two*/
	        
	        double mynumber=1.7938 ,myothernumber;
	        myothernumber=mynumber;
	        
	        /* Change Program*/
	        
	        /*
	         public class ChangeProgram {
 public static void main(String[] args) {
 int x;
 double y,z;
 
 x = 5;
 y = 9;
 
 z = x * y;

 System.out.println("The product is " + z);
 }
} 
	         
	         
	  
	         * */
	        
	 /*  Getting and Storing User Input */
	 
	        //Scanner keyboard = new Scanner(System.in); 
	        String myAnswer =  "P Sherman 42 Wallaby Way Sydney"; 
	        String firstInitial,lastName, houseNumber,streetName,streetType,city;
	        
	        Scanner scannerAgain = new Scanner( myAnswer).useDelimiter(" ");
	        firstInitial=scannerAgain.next();
	        lastName=scannerAgain.next();
	        houseNumber = scannerAgain.next();
	        streetName= scannerAgain.next();
	        streetType=scannerAgain.next();
	        city=scannerAgain.next();
	        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " "); 
	        System.out.println(streetName + " " + streetType + " " + city);
	        
	        
	        /*String completion assignment*/
	        
	        /*String name;
	        String breed;
	        int age;
	        Scanner keyboard = new Scanner(System.in);
	        System.out.print( "Greetings. What is your pet's name? " );
	        name = keyboard.next();
	 
	        System.out.print( "What kind of animal is " + name + "? " );
	        breed = keyboard.next();
	        System.out.print( "How old is " + name + "? ");
	       
	       age =keyboard.nextInt();

	       System.out.println( name + " is your " + breed + " and it is " + age );*/
	        
	        
	        
	       
	       /*Escape Sequences in Java   Cost      Quantity   Total $1,000.00   4       $4,000.00
$   50.00   8         $400.00
______________________________
TOTAL:      12      $4,400.00*/
	        
	        System.out.println("Cost" + "\t"+ "Quantity"+"\t"+ "Total");
	        System.out.println("$1,000.00" + "\t"+ "4"+"\t"+ "$4,000.00");
	        System.out.println("$50.00.00" + "\t"+ "8"+"\t"+ "$400.00");
	        System.out.println("________________________________________");
	        System.out.println("TOTAL" + "\t"+ "12"+"\t"+ "$4,400.00");
	        
	        /*Special Characters Assignment*/
	        
	        String message1 = "\\/\\/\\/\\/\\/\r\t\b";
	        String message2 = "\"";
	        System.out.println(message1 + message2);
	       
	}

}
