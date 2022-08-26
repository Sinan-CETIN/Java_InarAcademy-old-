package sinan03;


import java.util.Scanner;

public class Exercise03_02 {

        public static void main(String[] args) { 
        
        	int number1 = (int)(System.currentTimeMillis() % 10);
        	int number2 = (int)(System.currentTimeMillis() / 7  % 10);
        	int number3 = (int)(System.currentTimeMillis() / 8  % 10);

        	Scanner input = new Scanner(System.in);

        	System.out.print("What is " + number1 + "+ " + number2 + "+ " + number3 + "? " );
        	int result = input.nextInt();

        	if(result == number1 + number2 + number3)
	                System.out.println("Correct answer.");
	        else
                System.out.println(number1 + " +" + number2 + " +" + number3 + " is " + (number1 + number2 + number3));
        }
}
               
       



~                                                                                                                                                                                            
~                                                                                                                                                                                            
~                                                                                                                                                                                            
~                          