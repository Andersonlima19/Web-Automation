package ElementosWeb;

import org.openqa.selenium.By;

public class DadosCarro {
	
	//ElementosWeb
	
	private By automovel = By.id("nav_automobile");
	private By marca = By.cssSelector("#make > option:nth-child(3)");
	private By motor = By.id("engineperformance");
	private By data = By.name("Date of Manufacture");
	private By assentos = By.cssSelector("#numberofseats > option:nth-child(2)");
	private By combustivel = By.cssSelector("#fuel > option:nth-child(5)");
	private By tabela = By.id("listprice");
	private By placa = By.id("licenseplatenumber");
	private By Quilometragem = By.id("annualmileage");
	private By ProximaTela = By.id("nextenterinsurantdata");
	
	
	//Metodos publicos dos elementos 	
	
	public By getProximaTela() {
		return ProximaTela;
	}
	public By getAutomovel() {
		return automovel;
	}
	public By getMarca() {
		return marca;
	}
	public By getMotor() {
		return motor;
	}
	public By getData() {
		return data;
	}
	public By getAssentos() {
		return assentos;
	}
	public By getCombustivel() {
		return combustivel;
	}
	public By getTabela() {
		return tabela;
	}
	public By getPlaca() {
		return placa;
	}
	public By getQuilometragem() {
		return Quilometragem;
	}
	
	
	
	
	
	
	
	
	
	
	

}
