package uservalidationtest;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
class RegexValidatorTest {

	@Test
	public void givenFirstLastName_WhenProper_ShouldReturnTrue() {
			assertEquals(true, RegexValidator.checkRegex(RegexValidator.uc1, "Hrdik"));
			assertEquals(true, RegexValidator.checkRegex(RegexValidator.uc2, "Pachgade"));
	}
	
	@Test
	public void givenFirstLastName_WhenShort_ShouldReturnFalse() {
		assertEquals(false, RegexValidator.checkRegex(RegexValidator.uc1, "ik"));
		assertEquals(false, RegexValidator.checkRegex(RegexValidator.uc2, "pachgade"));
	}
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		assertEquals(true, RegexValidator.checkRegex(RegexValidator.uc4, "91 9878998701"));
	}
	
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		assertEquals(true,  RegexValidator.checkRegex(RegexValidator.uc3, "hardik.asd@asdf.co.in"));
	}
	
	@Test
	public void givenMobileNumber_WhenLess_ShouldReturnFalse() {
		assertEquals(false, RegexValidator.checkRegex(RegexValidator.uc4, "91 98789901"));
	}
	
	
	@Test
	public void givenPassWord_WhenAllRulesProper_ShouldReturnTrue() {
		assertEquals(true, (RegexValidator.checkRegex(RegexValidator.uc5, "hardikab") && RegexValidator.checkRegex(RegexValidator.uc6,"Hardikab") && RegexValidator.checkRegex(RegexValidator.uc7,"HardikAb12") && RegexValidator.checkRegex(RegexValidator.uc8, "Hardik@12")));
	}
	
	@Test
	public void givenPassWord_WhenAllRulesNotProper_ShouldReturnFalse() {
		assertEquals(false, (RegexValidator.checkRegex(RegexValidator.uc5, "hardik") && RegexValidator.checkRegex(RegexValidator.uc6,"hardikab") && RegexValidator.checkRegex(RegexValidator.uc7,"HardikAb") && RegexValidator.checkRegex(RegexValidator.uc8, "Hardik@@@12")));
	}
	
	
}
