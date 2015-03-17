package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Luhn_TestFile extends Luhn_Algorithm {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void ut_test_AccountNumber() {
		String correctAccount = "79927398713";
		int correctCheck = 3;
		int correctsumNum = 67;
		int correcttempVar = 67;
		
		
		// Checks to see if the correctaccount  matches what getCard returns 
		
		equals(correctAccount == getCard() );
		
		// Checks to see if checkdigit returns the correct digit
		
		equals(getcheckDigit(correctAccount) == correctCheck);
		
		//Checks if the sum of the account numbers are good.
		
		equals(calculateSum(correctAccount) == correctsumNum);
		
		// Compares the checksum to the tempvar.
		
		equals(calculateCheckSum(correctsumNum) == correcttempVar);
			
	}
	
	@Test
	public void ut_test_FalseAccountNumber(){
		String falseAccount = "79927398712";		
		String correctAccount = "79927398713";
		int correctCheck = 3;
		int correctsumNum = 67;
		int correcttempVar = 67;		
		
		
		// Makes sure the false account is not the same thing as correct.  Please enter 79927398713 when prompted.
		assertFalse(falseAccount == getCard());
		
		//Checks the check digit against the correct check.
		
		assertFalse(getcheckDigit(falseAccount) == correctCheck);
		
		//Checks the sum of the false account to the correct sum.
		
		assertFalse(calculateSum(falseAccount) == correctsumNum);
		
		//Checks the checksum to the correct tempvar.
		
		assertFalse(calculateCheckSum(correctsumNum) == correcttempVar);
		
// You will be prompted to enter two different credit card numbers.  Please enter 79927398713 first to test the correct credit card.
// Then type in 79927398712 to test the invalid credit card
		
		
		
		
		
		
		
		
		
		
		
	}

}
