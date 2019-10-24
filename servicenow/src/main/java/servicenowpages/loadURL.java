package servicenowpages;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class loadURL {
	
		public static String idnos;
		public static String excelFileName;

		public static  ChromeDriver driver;
		@BeforeMethod   
		public void start() {
			System.setProperty("webdriver.chrome.driver", "C:/Users/yramesh/eclipse-workspace/servicenow/driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://dev77567.service-now.com");
		}

		/*@AfterMethod
		public void close() {
			driver.close();
		}
*/
		@DataProvider(name="SNData")
		public String[][] dataCentre() throws IOException {
			String[][] data = SN_readExcel.readExcel(excelFileName);
			return data;
		}

}
