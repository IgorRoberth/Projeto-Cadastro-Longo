#Author: igorroberthm@gmail.com

Feature: Como usuario quero realizar o cadastro de seguro do caminhao
  Eu como usuario quero concluir cadastro de caminhao

  @tag2
  Scenario: Como usuario do site quero realizar o cadastro de caminhao
    Given que entre no site e clico em caminhao "http://sampleapp.tricentis.com/"
    When seleciono a marca desejada
    When informo o desempenho do motor do caminhao
    When informo a data de fabricacao do caminhao
    When a quantidade de assentos do caminhao
    When o tipo de combustivel do caminhao
    When o preco de tabela do caminhao
    When numero da placa do caminhao
    When quilometragem anual do caminhao
    Then clico em next1
    When digito o nome 
    When digito o sobrenome 
    When informo a data de nascimento 
    When seleciono o genero desejado
    When digito endereco desejado
    When seleciono o pais
    When digito o	cep local
    When insiro a cidade desejada
    When seleciono ocupacao melhor para o momento
    When escolho os Hobbies preferidos
    When insiro o site escolhido
    When clico no botao next2
    When digito a data de inicio do seguro
    When informo o valor total do seguro
    When escolho o seguro de danos
    When seleciono o produtos opcionais que desejo
    Then clico em next3 
    When seleciono o plano desejado para o caminhao
    When clico em next4
    When digito o email escolhido
    When digito o celular escolhido
    When digito o usuario desejado
    When digito a senha desejada
    When confirmo a senha desejada
    Then clico em next5 
