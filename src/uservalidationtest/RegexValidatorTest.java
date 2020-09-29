package uservalidationtest;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
class RegexValidatorTest {

	@Test
	public void givenFirstLastName_WhenProper_ShouldReturnTrue() {
			boolean result = RegexValidator.checkRegex(RegexValidator.uc1, "Hrdik");
			boolean result2 = RegexValidator.checkRegex(RegexValidator.uc2, "Pachgade");
			assertEquals(true, result);
			assertEquals(true, result);
	}
	
	@Test
	public void givenFirstLastName_WhenShort_ShouldReturnFalse() {
		boolean result1 = RegexValidator.checkRegex(RegexValidator.uc1, "ik");
		boolean result2 = RegexValidator.checkRegex(RegexValidator.uc2, "pachgade");
		assertEquals(false, result1);
		assertEquals(false, result2);
	}
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		boolean result = RegexValidator.checkRegex(RegexValidator.uc4, "91 9878998701");
		assertEquals(true, result);
	}
	
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean result = RegexValidator.checkRegex(RegexValidator.uc3, "hardik.asd@asdf.co.in");
		assertEquals(true, result);
	}
	
	@Test
	public void givenMobileNumber_WhenLess_ShouldReturnFalse() {
		boolean result = RegexValidator.checkRegex(RegexValidator.uc4, "91 98789901");
		assertEquals(false, result);
	}
	
	@Test
	public void givenPassWord_WhenAllRulesProper_ShouldReturnTrue() {
		boolean result1 = RegexValidator.checkRegex(RegexValidator.uc5, "hardikab");
		boolean result2 = RegexValidator.checkRegex(RegexValidator.uc6,"Hardikab");
		boolean result3 = RegexValidator.checkRegex(RegexValidator.uc7,"HardikAb12");
		boolean result4 = RegexValidator.checkRegex(RegexValidator.uc8, "Hardik@12");
		assertEquals(true, (result1 && result2 && result3 && result4));
	}
	
	@Test
	public void givenPassWord_WhenAllRulesNotProper_ShouldReturnFalse() {
		boolean result1 = RegexValidator.checkRegex(RegexValidator.uc5, "hardik");
		boolean result2 = RegexValidator.checkRegex(RegexValidator.uc6,"hardikab");
		boolean result3 = RegexValidator.checkRegex(RegexValidator.uc7,"HardikAb");
		boolean result4 = RegexValidator.checkRegex(RegexValidator.uc8, "Hardik@@@12");
		assertEquals(false, (result1 && result2 && result3 && result4));
	}
	
	
}
