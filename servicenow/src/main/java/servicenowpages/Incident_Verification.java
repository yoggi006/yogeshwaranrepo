package servicenowpages;

import org.openqa.selenium.Keys;

	public class Incident_Verification extends loadURL {
		
		public Incident_Verification searchIncident() throws InterruptedException {
			Thread.sleep(5000);
		 driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys(idnos,Keys.ENTER);
		 Thread.sleep(5000);
		 return this;
		}
	    public Incident_Verification incidentVerification() throws InterruptedException{
	    	Thread.sleep(2000);
	    	String retID = driver.findElementByXPath("//a[@class='linked formlink']").getText();
	    	System.out.println("This is the retrieved id: "+retID);
	    	
	    	if(retID.equals(idnos)) {
	    		System.out.println("Incident creation successful");
	    	}
	    	else {
	    		System.out.println("Incident creation failed");
	    	}
	    	return this;
	    }
	}

