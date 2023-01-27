#Author: igorroberthm@gmail.com

Feature: Como usuario desejo realizar cadastro do seguro de moto
  Eu como usuario quero executar o cadastro do seguro de moto

  @tag3
  Scenario: Cadastrando seguro de moto
    Given que entre no site de seguros "http://sampleapp.tricentis.com/"
    When clicar em motocicletas
    When selecione a marca da moto
    When escolher o modelo da moto
    When informar a capacidade de cilindro
    When informar o desempenho do motor
    When informar a data de fabricacao da moto
    When informar a quantidade de assentos
    When informar o preco de tabela da moto
    When informar quilometragem anual da moto
    Then clicar em proximo
    


