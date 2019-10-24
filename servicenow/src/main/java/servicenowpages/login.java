package servicenowpages;

public class login extends loadURL {
	public login entertheUserName(String username)
	{
		//driver.switchTo().frame(0);
		driver.findElementByXPath("//input[@id='username']").sendKeys(username);
		return this;
		
	}
	public login clickSubmit(String submit)
	{
		driver.findElementByXPath("//button[@id='usernameSubmitButton']").click();
		return this;
	}
	
	//enter password
	public login enterPassword(String password)
	{
		driver.findElementByXPath("//input[@id='user_password']").sendKeys(password);
		return this;
		
	}

	//click login button
	public SN_Admin_page clickLogin()

	{
		//driver.switchTo().frame(1);
		driver.findElementByXPath("//button[@id='sysverb_login']").click();
		return new SN_Admin_page();
	}

}
