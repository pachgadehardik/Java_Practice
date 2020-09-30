package exceptionhandling;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {

	static MoodAnalyser moodAnalyserObj;
	
	
	@Before
	public void init() {
		moodAnalyserObj = new MoodAnalyser();
	}
	
//	Testcase 1.1
	@Test
	public void givenSadMood_onSad_shouldReturnSad() {
		Assertions.assertEquals("sad", moodAnalyserObj.analyzeMoodUseCase1("I am in Sad Mood!"));
	}
	
	//Testcase 1.2
	@Test
	public void givenAnyMood_ShouldHappy() {
		Assertions.assertEquals("happy"	, moodAnalyserObj.analyzeMoodUseCase1("I am in Any Mood"));
	}
		
	//Repeated TestCase 1.1
	@Test
	public void givenMsgInConstructor_shouldReturnSad() {
		MoodAnalyser obj = new MoodAnalyser("I am in a sad Moood");
		Assertions.assertEquals("sad", obj.analyzeMood());
	}
	
	//Repeated TestCase 1.2
	@Test
	public void givenMsgInConstructor_shouldReturnHappy() {
		Assertions.assertEquals("happy",new MoodAnalyser("I am in a Happy Mood").analyzeMood());
	}
	
	//TestCase 2.1
	@Test
	public void givenNullMood_shouldReturnHappy() {
		Assertions.assertEquals("happy", new MoodAnalyser().analyzeMood());
	}
	
	//TestCase 3.1
	@Test
	public void givenNullMood_ShouldThrow_CustomMoodException() throws MoodAnalysisException {
		MoodUsecase3 obj = new MoodUsecase3();
//		Assertions.assertEquals("happy", obj.analyzeMood());
		assertThrows(MoodAnalysisException.class, ()->obj.analyzeMood());
	}
	
	//TestCase 3.2
	@Test
	public void givenEmptyMood_ShouldThrow_CustomMoodException() throws MoodAnalysisException{
		MoodUsecase3 obj = new MoodUsecase3("");
		assertThrows(MoodAnalysisException.class, ()->obj.analyzeMood());
	}
	
}
