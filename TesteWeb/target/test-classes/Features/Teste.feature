#language: en
#Author: anderson.ferlima9@gmail.com

@executa
Feature: Acessar o site 
 Como usuario quero realizar cadastro do meu carro no seguro
 
 Background: Site
 Given que eu esteja no "http://sampleapp.tricentis.com/101/index.php"


Scenario: CT01 - Cadastrar automovel no seguro
When preencher todas as informacoes 
And Enviar a cotacao 
Then valido a mensagem de sucesso no final do cadastro 


Scenario: CT02 - Validar campo pesquisa
When digitar por "cadastro" no campo
Then valido se o site me redireciona para a pagina de ajudaFs