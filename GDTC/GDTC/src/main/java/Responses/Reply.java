package Responses;

public class Reply {
	
	private boolean isSuccess;
	private String message;
	public Reply() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reply(boolean isSuccess, String message) {
		super();
		this.isSuccess = isSuccess;
		this.message = message;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Reply [isSuccess=" + isSuccess + ", message=" + message + "]";
	}
	

}
