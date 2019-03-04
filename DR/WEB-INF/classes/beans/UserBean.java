package beans;

public class UserBean{

	private String user_name;
  private String user_pass;

  public UserBean(){}

	public String getUser_name(){
		return user_name;
	}
	public void setUser_name(String user_name){
		this.user_name = user_name;
    }
    public String getUser_pass() {
        return user_pass;
    }
    public void setUser_pass(String user_pass){
		this.user_pass = user_pass;
    }

}


