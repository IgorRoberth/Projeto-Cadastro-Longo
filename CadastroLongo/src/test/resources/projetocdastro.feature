#Author: igorroberthm@gmail.com


Feature: Cadastro automovel
  Eu como usuatio do site quero cadastrar os dados do veiculo 

  @tag1
  Scenario: Como usuario do site quero realizar o cadastro
    Given que entre no site "http://sampleapp.tricentis.com/"
    And que clico no veiculo desejado
    When informo o desempenho do motor
    When informo a data de fabricacao
    When a quantidade de assentos
    When o tipo de combustivel
    When o preco de tabela
    When numero da placa
    When quilometragem anual
    Then clico em proximo1
    When digito primeiro nome
    When digito sobrenome
    When informo data de nascimento
    When seleciono o genero
    When digito endereco
    When seleciono a nacionalidade
    When digito cep
    When digito a cidade
    When seleciono a ocupacao atual
    When seleciono o Hobbies
    When digito o site
    When clico em proximo2
    When digito a data de inicio
    When informo a soma do seguro
    When realizo avaliacao de merito
    When seleciono seguro de danos
    When seleciono produto desejado
    When Seleciono cortesia
    Then clico em proximo3 
    When seleciono o plano desejado
    When clico em proximo4
    When digito o email
    When digito o celular
    When digito o usuario
    When digito a senha
    When confirmo a senha
    Then clico em mandar
    