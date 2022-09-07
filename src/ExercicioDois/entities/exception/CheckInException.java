package ExercicioDois.entities.exception;

public class CheckInException extends RuntimeException {

	private static final long serialVersionUID = 1L;
    
	public CheckInException(String MSG) {
		super(MSG);
	}
}
