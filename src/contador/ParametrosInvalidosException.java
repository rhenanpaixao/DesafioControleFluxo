package contador;

public class ParametrosInvalidosException extends Exception {
	 public ParametrosInvalidosException() {
	        super("O segundo par�metro deve ser maior que o primeiro");
	    }
}
