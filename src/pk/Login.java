
package pk;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String userName;

	private String password;

	public String getUserName()
	{

		return userName;
	}

	public void setUserName(String userName)
	{

		this.userName = userName;
	}

	public String getPassword()
	{

		return password;
	}

	public void setPassword(String password)
	{

		this.password = password;
	}

	public String execute()
	{

		return SUCCESS;
	}

	public void validate()
	{

		if (getUserName().length() == 0) {
			addFieldError("userName", "User Name is Required");
		} else if (!getUserName().equalsIgnoreCase("amsidhl")) {
			addFieldError("userName", "User not found");
		}
		if (getPassword().length() == 0) {
			addFieldError("password", getText("Password.required"));
		} else if (getPassword().length() < 6) {
			addFieldError("password", "Password is not small");
		}

	}

}
