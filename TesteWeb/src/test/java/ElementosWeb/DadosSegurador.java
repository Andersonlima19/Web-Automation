package ElementosWeb;

import org.openqa.selenium.By;

public class DadosSegurador {
	
	//ElementosWeb
	
	private By nome = By.id("firstname");
	private By sobrenome = By.id("lastname");
	private By nascimento = By.id("birthdate");
	private By genero = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]");
	private By endereco = By.id("streetaddress");
	private By pais = By.cssSelector("#country > option:nth-child(11)");
	private By cep = By.id("zipcode");
	private By cidade = By.id("city");
	private By ocupacao = By.cssSelector("#occupation > option:nth-child(3)");
	private By Hobbies = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(5)");
	private By Internet = By.id("website");
	private By ProximaTela = By.id("nextenterproductdata");
	
	//Metodos publicos dos elementos 
	
	public By getProximaTela() {
		return ProximaTela;
	}
	public By getNome() {
		return nome;
	}
	public By getSobrenome() {
		return sobrenome;
	}
	public By getNascimento() {
		return nascimento;
	}
	public By getGenero() {
		return genero;
	}
	public By getEndereco() {
		return endereco;
	}
	public By getPais() {
		return pais;
	}
	public By getCep() {
		return cep;
	}
	public By getCidade() {
		return cidade;
	}
	public By getOcupacao() {
		return ocupacao;
	}
	public By getHobbies() {
		return Hobbies;
	}
	public By getInternet() {
		return Internet;
	}
	
	
	
	
	
	
	
	
	

}
