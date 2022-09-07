package ExercicioDois.entities.exception;

public class CheckOutException extends RuntimeException {

	private static final long serialVersionUID = 1L;
    
	public CheckOutException(String MSG) {
		super(MSG);
	}
}
