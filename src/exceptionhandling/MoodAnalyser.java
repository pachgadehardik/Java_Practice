package exceptionhandling;

public final class MoodAnalyser {

	private String moodMsg;

	// private String moodMsg1;
	public MoodAnalyser(String moodMsg) {
		this.moodMsg = moodMsg;

	}

	public MoodAnalyser() {

	}

	public String analyzeMoodUseCase1(String msg) {
		if (msg.toLowerCase().contains("sad"))
			return "sad";

		return "happy";
	}

	public String analyzeMood() {

		try {
			if (this.moodMsg.toLowerCase().contains("sad"))
				return "sad";
			return "happy";
		} catch (Exception e) {
			if (this.moodMsg == null) {
				System.out.println("Null Exception");
				return "happy";
			}
			return "happy";
		}

	}

}
