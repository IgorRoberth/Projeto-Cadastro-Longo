#Author: igorroberthm@gmail.com
@todos
Feature: Cadastro seguro
  Eu como usuario desejo cadastrar veiculo no site

  @carro 
  Scenario: Como usuario do site quero realizar o cadastro de carro
  
  Given que entre no site para cadastrar carro
    And clico em automobile
   When realizar cadastro
   Then finalizar cadastro

  @caminhao
  Scenario: Como usuario do site quero realizar o cadastro de caminhao
    
    Given que entre no site para cadastrar caminhao
    And clicar em truck
    When realizar cadastro caminhao
    Then finallizar cadastro caminhao
      
  @motocicleta
  Scenario: Cadastrando seguro de moto
   
   Given que entre no site para cadastrar moto
     And clicar em motorcycle
    When executar cadastro
    Then confirmar cadastro
    
  @camper
  Scenario: Como usuario quero realizar um cadastro campista
    
   Given que entre no site para cadastrar camper
     And clico em seguro campista
    When realizo o cadastro
    Then finalizar cadastro