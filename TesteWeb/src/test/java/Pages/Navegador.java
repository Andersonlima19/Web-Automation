package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegador {
	
	WebDriver driver;

	public void abrirNavegador(String site) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		try {
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(" ------ Erro no metodo -----" + e.getMessage());
			System.out.println(" ------ Causa do erro -----" + e.getCause());
		}

	}

	
}

