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
		
		
		
		equals(correctAccount == getCard() );
		
		equals(getcheckDigit(correctAccount) == correctCheck);
		
		equals(calculateSum(correctAccount) == correctsumNum);
		
		equals(calculateCheckSum(correctsumNum) == correcttempVar);
			
	}
	
	@Test
	public void ut_test_FalseAccountNumber(){
		String falseAccount = "79927398712";		
		String correctAccount = "79927398713";
		int correctCheck = 3;
		int correctsumNum = 67;
		int correcttempVar = 67;		
		assertFalse(falseAccount == getCard());
		
		assertFalse(getcheckDigit(falseAccount) == correctCheck);
		
		assertFalse(calculateSum(falseAccount) == correctsumNum);
		
		assertFalse(calculateCheckSum(correctsumNum) == correcttempVar);
		
// You will be prompted to enter two different credit card numbers.  Please enter 79927398713 first to test the correct credit card.
// Then type in 79927398712 to test the invalid credit card
		
		
		
		
		
		
		
		
		
		
		
	}

}
