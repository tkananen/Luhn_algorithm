 package MainPackage;
import java.util.Scanner;

public class Luhn_Algorithm {
	public static void main(String [] args){	
		finalCheck(calculateCheckSum(calculateSum(getCard())),getcheckDigit(getCard()));
		
		
		
			
		
				
			}
	
	public static String getCard(){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your credit card number as one long number :");
		String cNumber = input.nextLine();
		String ccNumber = new StringBuilder(cNumber).reverse().toString();
		
		return ccNumber;
	}
	public static int getcheckDigit(String ccNumber){
		int checkDigit = Character.getNumericValue(ccNumber.charAt(0));	
		return checkDigit;
	}
		
	
	
	public static int calculateSum(String ccNumber){
		int sumNum = 0;
		int tempvar1 = 0;
		for( int i = 1; i < (ccNumber.length()); i++){
			if(i % 2 != 0){
				tempvar1 = ((Character.getNumericValue(ccNumber.charAt(i)) * 2));
				if(tempvar1 > 9){
					sumNum += 1;
					sumNum += (tempvar1 % 10);
					}
				else{
					sumNum +=  (tempvar1);
					}
			}
			else{
				sumNum += Character.getNumericValue(ccNumber.charAt(i));
				}
					
				}

		
		return sumNum;
	}
	public static double calculateCheckSum(int sumNum){
		double tempVar = 0;
		tempVar = (sumNum * 9);
		return tempVar;
	}
	public static void finalCheck(double tempVar, double checkDigit){
		if((tempVar % 10)== checkDigit){
			System.out.print("Your credit card is valid.");
		}
		else{
			System.out.print("Your credit card is not valid.");
		}
		
		
	}
	}