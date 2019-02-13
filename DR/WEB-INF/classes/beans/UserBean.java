package beans;

public class UserBean{
	
	private int user_id;
	private String user_name;
  private String user_pass;
  private int user_age;
  private int user_sex;

  public UserBean(){}
    

	public String getUser_id(){
		return user_id;
    }
    public void setUser_id(String user_id){
		this.user_id = user_id;
	}
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
    public String getUser_age() {
        return user_age;
    }
    public void setUser_age(String user_age){
		this.user_age = user_age;
    }
    public String getUser_sex() {
        return user_sex;
    }
    public void setUser_sex(String user_sex){
		this.user_sex = user_sex;
    }

}


