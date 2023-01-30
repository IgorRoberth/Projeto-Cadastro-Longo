#Author: igorroberthm@gmail.com

Feature: Cadastro seguro camper 
    Eu como usuario desejo realizar cadastro de seguro campista  

  @tag4
  Scenario: Como usuario quero realizar um cadastro campista
    
   Given que entre no site tricents "http://sampleapp.tricentis.com"
     And clico em seguro campista
    When seleciono a marca do veiculo
    When digito desempenho do motor do veiculo
    When digito a data de fabricacao
    When seleciono a quantidade de assentos do veiculo
    When informo se o volante esta a direita
    When seleciono o tipo de combustivel do veiculo
    When digito a carga util do veiculo
    When digito o peso total do veiculo
    When informo preco de tabela 
    When digito o numero da placa
    When informo a quilometragem anual do veiculo
    Then clico em proximo