package Tests;

import java.io.IOException;

import ElementosWeb.Campo_Pesquisa;
import ElementosWeb.DadosCarro;
import ElementosWeb.DadosProdutos;
import ElementosWeb.DadosSegurador;
import ElementosWeb.Enviarcotacao;
import Pages.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroSeguro {

	Metodos metodo = new Metodos();
	DadosCarro dc = new DadosCarro();
	DadosSegurador ds = new DadosSegurador();
	DadosProdutos dp = new DadosProdutos();
	Enviarcotacao ec = new Enviarcotacao();
	Campo_Pesquisa cp = new Campo_Pesquisa();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) throws InterruptedException {
		metodo.abrirNavegador(site);
		metodo.esperar(4000);
	  
	}

	@When("preencher todas as informacoes")
	public void preencher_todas_as_informacoes() throws IOException, InterruptedException {
		metodo.clicar(dc.getAutomovel());
		metodo.clicar(dc.getMarca());
		metodo.escrever("1111", dc.getMotor());
		metodo.escrever("01/02/2002", dc.getData());
		metodo.clicar(dc.getAssentos());
		metodo.clicar(dc.getCombustivel());
		metodo.escrever("11111", dc.getTabela());
		metodo.escrever("111", dc.getPlaca());
		metodo.escrever("1111", dc.getQuilometragem());
		metodo.screenShot("Tela 1");
		metodo.clicar(dc.getProximaTela());
		metodo.esperar(2000);
		metodo.escrever("Lionel", ds.getNome());
		metodo.escrever("Messi", ds.getSobrenome());
		metodo.escrever("01/02/1999", ds.getNascimento());
		metodo.clicar(ds.getGenero());
		metodo.escrever("Rua Manoel Raimundo,s/n", ds.getEndereco());
		metodo.clicar(ds.getPais());
		metodo.escrever("68973970", ds.getCep());
		metodo.escrever("Cutias", ds.getCidade());
		metodo.clicar(ds.getOcupacao());
		metodo.clicar(ds.getHobbies());
		metodo.escrever("http://sampleapp.tricentis.com/101/app.php", ds.getInternet());
		metodo.screenShot("Tela 2");
		metodo.clicar(ds.getProximaTela());
		metodo.esperar(2000);
		metodo.escrever("01/02/2029", dp.getDataincio());
		metodo.clicar(dp.getSomaseguro());
		metodo.clicar(dp.getAvaliacao());
		metodo.clicar(dp.getDanos());
		metodo.clicar(dp.getProdutos());
		metodo.clicar(dp.getCortesia());
		metodo.screenShot("Tela 3");
		metodo.clicar(dp.getProximaTela());
		metodo.esperar(2000);
		metodo.clicar(dp.getOuro());
		metodo.esperar(2000);
		metodo.screenShot("Tela 4");
		metodo.clicar(dp.getProximo());
		metodo.esperar(2000);

	}

	@When("Enviar a cotacao")
	public void enviar_a_cotacao() throws IOException {

		metodo.escrever("teste@teste.com.br", ec.getEmail());
		metodo.escrever("11999999999", ec.getTel());
		metodo.escrever("Lionelmessi", ec.getUsuario());
		metodo.escrever("W4Woc4FA", ec.getSenha());
		metodo.escrever("W4Woc4FA", ec.getConfirsenha());
		metodo.escrever("Teste Finalizado com sucesso.", ec.getComentarios());
		metodo.screenShot("Tela 5");
		metodo.clicar(ec.getFinalizar());

	}

	@Then("valido a mensagem de sucesso no final do cadastro")
	public void valido_a_mensagem_de_sucesso_no_final_do_cadastro() throws InterruptedException {
		metodo.esperar(9000);
		metodo.validarTexto("Sending e-mail success!", ec.getMsg());
		metodo.fecharNavegador();

	}

	@When("digitar por {string} no campo")
	public void digitar_por_no_campo(String texto) throws InterruptedException, IOException {
		metodo.escrever(texto,cp.getCampo() );
		metodo.esperar(2000);
		metodo.screenShot(texto);
		metodo.clicar(cp.getClick());

	}

	@Then("valido se o site me redireciona para a pagina de ajudaFs")
	public void valido_se_o_site_me_redireciona_para_a_pagina_de_ajuda_fs() {
		metodo.fecharNavegador();

	}

}
