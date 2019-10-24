package servicenowpages;

public class SN_Admin_page extends loadURL {
	public SN_Admin_page searchFilter(String filterData) throws InterruptedException {
		driver.findElementByXPath("//input[@id='filter']").sendKeys(filterData);
		Thread.sleep(3000);
		return this;
	}
	
	public ServicenNew_newRecord clickCreate() throws InterruptedException {
		driver.findElementByXPath("(//div[@class='sn-widget-list-title'])[43]").click();
		Thread.sleep(3000);
		return new ServicenNew_newRecord();
	}
}

