package webapp;

public class ValidateUserService {

	private UserClass user = new UserClass();
	
	//this should be done via the database
	public boolean isUserValid(String fname, String pass) {
		
		user.setFname(fname);
		user.setPassword(pass);
		
		return user.getFname().equals("user1")&& user.getPassword().equals("password1") ||
				fname.equals("user2")&& user.getPassword().equals("password2");
		
	}
	
	public boolean isAdmin(String fname, String pass) {
		if(user.getFname().equals("user3") && pass.equals("password3"))
			user.setRole("admin");
		return true;
	}
}
