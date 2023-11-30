package MavenTestPrograms;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class MavenTestOne {
	public static  void main(String[] args) {
		System.out.println("MAVEN PROJECT");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Personal\\Downloads\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	}

}
