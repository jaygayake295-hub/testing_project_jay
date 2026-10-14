package test_1.Automation_project_1;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;

public class screenshot {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.myntra.com/");

		File src = (File)driver.getScreenshotAs(OutputType.File);
		File Dest=new File("C:\\Users\\Lenovo\\testing_workspace\\Automation-project_1\\screenshots"myntra.png");
	}

}
