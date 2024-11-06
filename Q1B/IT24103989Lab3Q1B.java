import java.util.Scanner;
public class IT24103989Lab3Q1B{
   	 public  static void main(String[]args){

   	 Scanner input = new Scanner(System.in);

	 System.out.print("Enter the price of 1kg of rice: ");
	 double pricePerKg = input.nextDouble();

	 System.out.print("Enter the number of kilograms you want to buy:");
 	 double quantity = input.nextDouble();

    	 double totalAmount = pricePerKg*quantity;

 	 double discount = totalAmount-(totalAmount*0.10);

 	 System.out.println("The total amount with 10% discount is : "+discount);


	 }

}




 

