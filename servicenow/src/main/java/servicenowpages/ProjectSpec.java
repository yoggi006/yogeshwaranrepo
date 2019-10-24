package servicenowpages;
    import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class ProjectSpec extends loadURL  {
		
		@BeforeClass
		public void setData() {
			excelFileName="ServicN";
		}
		
		
		@Test(dataProvider="SNData")
		public void SN_createIncident(String username, String password, String filterData, String callerName, String shortDes) throws InterruptedException {

			{	
				login incident = new login();
			incident.entertheUserName(username)
			.enterPassword(password)
			.clickLogin()
			.searchFilter(filterData)
			.clickCreate()
			.getGId()
			.enterCallerName(callerName)
			.enterShrtDes(shortDes)
			.clickSubmit()
			.searchIncident()
			.incidentVerification();
			
			
		}
	}
		
		
		
	}


