
public class MyException extends Exception {
	private static final long serialVersionUID = 7718828512143293558L;
	private final int ERR_CODE;
	
	MyException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	
	MyException(String msg) {
		this(msg, 100);
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}

}
