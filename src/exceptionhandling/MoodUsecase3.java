package exceptionhandling;

import exceptionhandling.MoodAnalysisException.Level;

public class MoodUsecase3 {

	private String moodMsg;

	
	// private String moodMsg1;
	public MoodUsecase3(String moodMsg) {
		this.moodMsg = moodMsg;

	}

	public MoodUsecase3() {
//		this.moodMsg = null;
	}

	public String analyzeMood() throws MoodAnalysisException {
		
		if(this.moodMsg == null)
			throw new MoodAnalysisException(Level.NULL);
		if (this.moodMsg.toLowerCase().contains("sad"))
				return "sad";
		if(this.moodMsg == "") 
			throw new MoodAnalysisException(Level.EMPTY);
		return "happy";

	}
		
}
