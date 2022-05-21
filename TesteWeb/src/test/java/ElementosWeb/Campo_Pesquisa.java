package ElementosWeb;

import org.openqa.selenium.By;

public class Campo_Pesquisa {

	private By campo = By.id("search_form");
	private By click = By.id("search_button");
	
	
	public By getCampo() {
		return campo;
	}
	public By getClick() {
		return click;
	}

}
