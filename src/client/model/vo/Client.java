package client.model.vo;

public class Client implements java.io.Serializable{
	private static final long serialVersionUID = 12L;
	
	private String userId;
	private String userPwd;
	private String userName;
	
	public Client() {}

	public Client(String userId, String userPwd, String userName) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return this.userId + ", " + this.userPwd + ", " + 
				this.userName;
	}
}








