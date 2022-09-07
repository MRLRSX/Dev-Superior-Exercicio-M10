package ExercicioTres.entities.exception;

public class WithdrawException extends RuntimeException {
	private static final long serialVersionUID = -7390183272666640654L;
  
	public WithdrawException(String MSG) {
		super(MSG);
	}
	
}
