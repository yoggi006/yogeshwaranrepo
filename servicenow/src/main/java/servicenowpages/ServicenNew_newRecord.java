package servicenowpages;


	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;

	public class ServicenNew_newRecord extends loadURL {
		// get id
		public ServicenNew_newRecord getGId() throws InterruptedException {
			driver.switchTo().frame(0);
			Thread.sleep(10000);
			idnos = driver.findElementByXPath("//input[@id='incident.number']").getAttribute("value");
			System.out.println("Generated ID: " + idnos);
			Thread.sleep(10000);
			return this;
		}

		public ServicenNew_newRecord enterCallerName(String callerName) throws InterruptedException {
			// driver.switchTo().frame(0);
			Thread.sleep(10000);

			WebElement find = driver.findElementByXPath("//input[@id='sys_display.incident.caller_id']");
			 find.click();
			 find.sendKeys(callerName);
	         Thread.sleep(5000);
			return this;
		}

		public ServicenNew_newRecord enterShrtDes(String des) throws InterruptedException {
			Thread.sleep(10000);

			driver.findElementByXPath("//input[@id='incident.short_description']").sendKeys(des + Keys.ENTER);
			return this;
		}

		public Incident_Verification clickSubmit() throws InterruptedException {
			Thread.sleep(10000);

			driver.findElementByXPath("(//button[@id='sysverb_insert'])[2]").click();
			return new Incident_Verification();
		}

	}
