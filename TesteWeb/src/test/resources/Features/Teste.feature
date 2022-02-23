#language: en
#Author: anderson.ferlima9@gmail.com

@executa
Feature: Acessar o site 
 Como usuario quero realizar cadastro do meu carro no seguro

Scenario: CT01 - Cadastrar automovel no seguro
Given que eu esteja no "http://sampleapp.tricentis.com/101/index.php"
When preencher todas as informacoes 
And Enviar a cotacao
Then valido a mensagem de sucesso no final do cadastro 