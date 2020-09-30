package exceptionhandling;

public class Driver {

	
	public static void main(String args[]) throws MoodAnalysisException {
//		
		MoodAnalyser mObj = new MoodAnalyser();
		
		System.out.println(mObj.analyzeMoodUseCase1("I am Happy!!"));
		
		System.out.println(mObj.analyzeMoodUseCase1("I am Sad")); //UseCase 1
		
		System.out.println(mObj.analyzeMood()); //USECASE 2
		
		
		//Use case 3 
		try {
			MoodUsecase3 moodUsecase3Obj = new MoodUsecase3();
			System.out.println(moodUsecase3Obj.analyzeMood());
		} catch (MoodAnalysisException e) {
			System.out.println(e.getClass()+", "+e.getMessage());
		}
		
	}
}