package StepDefinitions;

import Helper.TradeHelper;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AutomatizarRotinas extends TradeHelper{

	@Dado("^que eu acesso o site automationpractice$")
	public void queEuAcessoOSiteAutomationpractice() {
		iniciarAplicacaoAutomationPractice();
	}

	@Quando("^eu clicar na opcao best sellers$")
	public void euClicarNaOpcaoBestSellers() {
	   clicarNaOpcaoBestSellers();
	}

	@E("^clicar em Add to cart em um dos produtos$")
	public void clicarEmAddToCardEmUmDosProdutos()  {
	    clicandoEmAddToCard1ºProduto();
	}
	
	@Entao("^o produto e adicionado com sucesso$")
	public void oProdutoEAdicionadoComSucesso() {
		validaProdutoEAdicionadoComSucesso();
	}
	@Entao("^eu faco isso com todos os outros produtos$")
	public void euFacoIssoComTodosOsOutrosProdutos() {
		clicandoEmAddToCardRestProdutos();
	}

	@Dado("^que eu clico em Cart e Proceed To Checkout$")
	public void queEuClicoEmCartEProceedToCheckout()  {
	    clicarEmCartEProceedToCheckout();
	}
	
	@Entao("^eu exporto os dados do summary em um arquivo em formato json$")
	public void euExportoOsDadosDoSummaryEmUmArquivoEmFormatoJson() {
		//Não deu tempo de implementar
	}
	
	@Quando("^informo os dados de email para criar uma conta$")
	public void informoOsDadosDeEmailParaCriarUmaConta() {
		//informarDadosDeEmailParaCriarUmaConta();
	}

	@E("^clico em create an account$")
	public void clicoEmCreateAnAccount()  {
		//Não deu tempo de implementar
	}

	@Entao("^o formulario de criacao de conta e exibido$")
	public void oFormularioDeCriacaoDeContaEExibido() {
		//Não deu tempo de implementar
	}
	
	@Entao("^eu preencho os campos obrigatorios do formulario$")
	public void euPreenchoOsCamposObrigatoriosDoFormulario()  {
		//Não deu tempo de implementar
	}

	@Entao("^eu clico em Register$")
	public void euClicoEmRegister()  {
		//Não deu tempo de implementar
	}

	@Entao("^Valido se foi para a etapa endereco$")
	public void validoSeFoiParaAEtapaEndereco()  {
		//Não deu tempo de implementar
	}
	
	@Dado("^eu informo os dados de \"([^\"]*)\" e \"([^\"]*)\"$")
	public void euInformoOsDadosDeE(String email, String senha)  {
		informarOsDadosDeEmailESenha(email , senha);
	}

	@Quando("^eu clicar em Sign in$")
	public void euClicarEmSignIn()  {
		clicarEmSignIn();
	}

	@Entao("^a pagina de cadastro de endereco e exibida$")
	public void aPaginaDeCadastroDeEnderecoEExibida()  {
	    ValidaPaginaDeEnderecoCadastradoExibida();
	}
	
	@Dado("^que eu clico em Proceed To Checkout$")
	public void queEuClicoEmProceedToCheckout()  {
	   ClicarEmProceedToCheckout();
	}

	@Entao("^a pagina de envio e exibida$")
	public void aPaginaDeEnvioEExibida()  {
	   ValidaPaginaDeEnvioExibida();
	}
	
	@Dado("^que eu marco os termos de servico$")
	public void queEuMarcoOsTermosDeServico()  {
		marcarOsTermosDeServico();
	}

	@Quando("^eu clicar em Proceed To Checkout$")
	public void euClicarEmProceedToCheckout()  {
		ClicarEmProceedToCheckout();
	}

	@Entao("^a pagina de pagamento e exibida$")
	public void aPaginaDePagamentoEExibida()  {

	}

}