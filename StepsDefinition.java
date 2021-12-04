package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDefinition {

	public ChromeDriver driver;

	@Given("Open Chrome browser")
	
	public void OpenBrowser() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Given("Load application url")
	public void ApplicationUrl() {

		driver.get("http://leaftaps.com/opentaps/control/login");

	}

	@Given("Enter Username as {string}")
	public void EnterUsername(String uName) {

		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@Given("Enter password as {string}")
		public void EnterPassword(String pwd)
	{

		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click on Login button")
	public void loginbutton() {

		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Home Page should be displayed")
	public void homepage() {

		String title = driver.getTitle();
		
		if (title.equals("Leaftaps - TestLeaf Automation Platform")) {
			
			System.out.println("Login successful");
		}

		else {
			
			System.out.println("Login NOT successful");
		}
	}

	@But("Error message is displayed")
	public void VerifyError() {
		System.out.println("Not valid credentials");

	}
	
	@When("Click on crmsfa link")
	public void clickLink() {
		
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	
	
	@Then("MyHome should be displayed")
	
	public void ValidateMyhome() {
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		
	}
	
	}

	
	
	
