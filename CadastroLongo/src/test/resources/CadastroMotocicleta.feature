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
    Then clicar em proximo1
    When informar o primeiro nome
    When informar o sobrenome
    When informar data de nascimento
    When seleciono o genero do cliente
    When informar endereco 
    When selecionar nacionalidade
    When informar codigo postal
    When informar cidade
    When informar a ocupacao
    When selecionar os hobbies
    When informar local na rede
    Then clicar em proximo2
    When digitar data de inicio seguro moto 
    When informar soma total do seguro moto
    When informar seguro de danos moto
    When opcao do produto moto
    Then clicar em proximo3
    When selecionar plano da moto
    Then clicar em proximo4
    When digitar email cliente moto
    When digitar telefone cliente moto
    When digitar usuario cliente moto
    When criar senha cliente moto
    When confirmar senha cliente moto
    When clicar em proximo5
    Then clicar em ok encerrando o cadastro


