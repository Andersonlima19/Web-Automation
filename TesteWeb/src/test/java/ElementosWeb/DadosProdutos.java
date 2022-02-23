package ElementosWeb;

import org.openqa.selenium.By;

public class DadosProdutos {
	
	//ElementosWeb
	
	private By Dataincio = By.id("startdate");
	private By Somaseguro = By.cssSelector("#insurancesum > option:nth-child(4)");
	private By Avaliacao = By.cssSelector("#meritrating > option:nth-child(4)");
	private By Danos = By.cssSelector("#damageinsurance > option:nth-child(2)");
	private By produtos = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1)");
	private By cortesia = By.cssSelector("#courtesycar > option:nth-child(2)");
	private By ouro = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(2) > span");
	private By ProximaTela = By.id("nextselectpriceoption"); 
	private By proximo = By.name("Next (Send Quote)");
  
	//Metodos publicos dos elementos 

	public By getProximo() {
		return proximo;
	}
	public By getProximaTela() {
		return ProximaTela;
	}
	public By getSomaseguro() {
		return Somaseguro;
	}
	public By getAvaliacao() {
		return Avaliacao;
	}
	public By getDanos() {
		return Danos;
	}
	public By getProdutos() {
		return produtos;
	}
	public By getCortesia() {
		return cortesia;
	}			
	public By getOuro() {
	    return ouro;
				}
	public By getDataincio() {
		return Dataincio;
	}
	}
