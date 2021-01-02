package museumAccount;

public class Account {
	
	private String email;
	private String password;
	private boolean isLoggedIn;
	
	public Account(String email, String password, boolean isLoggedIn) {
		this.email = email;
		this.password = password;
		this.isLoggedIn = isLoggedIn;
	}
}
