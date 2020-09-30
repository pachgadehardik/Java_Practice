package exceptionhandling;

public class MoodAnalysisException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3822556390792690110L;


	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	
	public enum Level {
	    NULL,
	    EMPTY
	  }
	
	public MoodAnalysisException(String msg) {
		super(msg);
	}
//	
	public MoodAnalysisException(Level level) {
		super(level.name());
	}
	
}
