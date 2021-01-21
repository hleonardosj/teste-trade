# language: pt
@AutomatizarRotina @Wip
Funcionalidade: como QA da Trade Technology eu quero automatizar a rotina de adiconar produtos


		Esquema do Cenario: Testar todos os fluxos da loja ate chegar em payment
  	Dado que eu acesso o site automationpractice
  	Quando eu clicar na opcao best sellers
  	E clicar em Add to cart em um dos produtos
  	Entao o produto e adicionado com sucesso
  	Entao eu faco isso com todos os outros produtos
  	E eu exporto os dados do summary em um arquivo em formato json
  	Dado que eu clico em Cart e Proceed To Checkout
    Quando informo os dados de email para criar uma conta 
    E clico em create an account
		Entao o formulario de criacao de conta e exibido
		Entao eu preencho os campos obrigatorios do formulario
		E eu clico em Register
		E Valido se foi para a etapa endereco
		Dado eu informo os dados de "<email>" e "<senha>"
    Quando eu clicar em Sign in
    Entao a pagina de cadastro de endereco e exibida
    Dado que eu clico em Proceed To Checkout
    Entao a pagina de envio e exibida
    Dado que eu marco os termos de servico
    Quando eu clicar em Proceed To Checkout
    Entao a pagina de pagamento e exibida
    
    		Exemplos:
    |        email   		  	      | senha |
    | hleonardosj+test@gmail.com  | 12345 |
    | hleonardosj+test1@gmail.com | 56789 |
