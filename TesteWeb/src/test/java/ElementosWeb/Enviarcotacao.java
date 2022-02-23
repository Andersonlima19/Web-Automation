package ElementosWeb;

import org.openqa.selenium.By;

public class Enviarcotacao {
	
	//ElementosWeb
	
	private By email = By.id("email");
    private By tel = By.id("phone");
	private By usuario = By.id("username");
	private By senha = By.id("password");
	private By confirsenha = By.id("confirmpassword");
	private By comentarios = By.id("Comments");
	private By finalizar = By.id("sendemail");
	private By msg = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");

	
	//Metodos publicos dos elementos 
	
	public By getMsg() {
		return msg;
	}
	public By getEmail() {
		return email;
	}
	public By getTel() {
		return tel;
	}
	public By getUsuario() {
		return usuario;
	}
	public By getSenha() {
		return senha;
	}
	public By getConfirsenha() {
		return confirsenha;
	}
	public By getComentarios() {
		return comentarios;
	}
	public By getFinalizar() {
		return finalizar;
	}
	
	


}
