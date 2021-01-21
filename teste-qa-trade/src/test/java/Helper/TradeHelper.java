package Helper;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TradeHelper {

	WebDriver driver;
	WebDriverWait wait;

	/**
	 * Iniciando aplicação Automation Practice
	 */

	protected void iniciarAplicacaoAutomationPractice() {
		System.setProperty("webdriver.chrome.driver", "C:\\DriverSelenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		// Esperar carregar os elementos na pagina
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	}

	/**
	 * Clicando na opção Best Sellers
	 */

	protected void clicarNaOpcaoBestSellers() {
		WebElement homePageTabs0 = driver.findElement(By.id("home-page-tabs"));
		homePageTabs0.findElement(By.className("blockbestsellers")).click();
	}

	/**
	 * Selecionando o 1º produto Best Sellers
	 */

	protected void clicandoEmAddToCard1ºProduto() {
		// wait = new WebDriverWait(driver, 60);
		driver.findElement(By.xpath("//*[@id=\"blockbestsellers\"]/li[1]")).click();
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//span[@class='continue btn btn-default button exclusive-medium']")).click();
	}

	/**
	 * Validando mensagem de sucesso após adicionar um produto
	 */

	protected void validaProdutoEAdicionadoComSucesso() {
		WebElement mensagemOk = driver.findElement(By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']//h2"));
		String textoNaMensagemOk = mensagemOk.getText();
		assertEquals("Product successfully added to your shopping cart", textoNaMensagemOk);
	}

	/**
	 * Selecionando o restante dos produtos Best Sellers
	 */

	protected void clicandoEmAddToCardRestProdutos() {
		driver.findElement(By.id("header_logo")).click();
		clicarNaOpcaoBestSellers();
		// Adicionando o 2º produto
		driver.findElement(By.xpath("//*[@id=\"blockbestsellers\"]/li[2]")).click();
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//span[@class='continue btn btn-default button exclusive-medium']")).click();

		driver.findElement(By.id("header_logo")).click();
		clicarNaOpcaoBestSellers();
		// Adicionando o 3º produto
		driver.findElement(By.xpath("//*[@id=\"blockbestsellers\"]/li[3]")).click();
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//span[@class='continue btn btn-default button exclusive-medium']")).click();

		driver.findElement(By.id("header_logo")).click();
		clicarNaOpcaoBestSellers();
		// wait = new WebDriverWait(driver, 60);
		// Adicionando o 4º produto
		driver.findElement(By.xpath("//*[@id=\"blockbestsellers\"]/li[4]")).click();
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//span[@class='continue btn btn-default button exclusive-medium']")).click();

		driver.findElement(By.id("header_logo")).click();
		clicarNaOpcaoBestSellers();
		// wait = new WebDriverWait(driver, 60);
		// Adicionando o 5º produto
		driver.findElement(By.xpath("//*[@id=\"blockbestsellers\"]/li[5]")).click();
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//span[@class='continue btn btn-default button exclusive-medium']")).click();

		driver.findElement(By.id("header_logo")).click();
		clicarNaOpcaoBestSellers();
		// wait = new WebDriverWait(driver, 60);
		// Adicionando o 6º produto
		driver.findElement(By.xpath("//*[@id=\"blockbestsellers\"]/li[6]")).click();
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//span[@class='continue btn btn-default button exclusive-medium']")).click();

		driver.findElement(By.id("header_logo")).click();
		clicarNaOpcaoBestSellers();
		// wait = new WebDriverWait(driver, 60);
		// Adicionando o 7º produto
		driver.findElement(By.xpath("//*[@id=\"blockbestsellers\"]/li[7]")).click();
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//span[@class='continue btn btn-default button exclusive-medium']")).click();
	}
	/**
	 * Clicando em Cart e na sequencia no checkout
	 */
	
	protected void clicarEmCartEProceedToCheckout() {
		// wait = new WebDriverWait(driver, 60);
		driver.findElement(By.xpath("//div[@class='shopping_cart']//b")).click();
		driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//span")).click();
	}
	/**
	 * Informando os dados de email na área de criação de conta
	 */

	protected void InformarOsDadosDeEmailParaCriarUmaConta() {
		wait = new WebDriverWait(driver, 60);
		driver.findElement(By.id("email_create")).sendKeys("hleonardosj+teste@gmail.com");
	}
	/**
	 * Clicando em Create An Account na área de criação de conta
	 */

	protected void clicoEmCreateAnAccount() {
		// Não deu tempo de implementar
	}
	/**
	 * Informando os dados de email e senha na área de cliente já registrado
	 */

	protected void informarOsDadosDeEmailESenha(String email, String senha) {
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("passwd")).sendKeys(senha);
	}
	/**
	 * Clicando em Sign In na área de cliente já registrado
	 */
	
	protected void clicarEmSignIn() {
		driver.findElement(By.id("SubmitLogin")).click();
	}
	/**
	 * Validando se estou na Página de Endereços etapa 3
	 */

	protected void ValidaPaginaDeEnderecoCadastradoExibida() {
		WebElement pageAddressOk = driver.findElement(By.xpath("//li[@class='step_current third']//span"));
		String textoPasso3 = pageAddressOk.getText();
		assertEquals("03. Address", textoPasso3);
	}
	/**
	 * Clicando no botão  Proceed to checkout 
	 */

	protected void ClicarEmProceedToCheckout() {
		driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//span")).click();

	}
	/**
	 * Validando se estou na Página de Envio etapa 4 
	 */

	protected void ValidaPaginaDeEnvioExibida() {
		WebElement pageEnvioOk = driver.findElement(By.xpath("//li[@class='step_current four']//span"));
		String textoPasso4 = pageEnvioOk.getText();
		assertEquals("04. Shipping", textoPasso4);
	}
	/**
	 * Marcando o radiobutton dos termos de serviço
	 */

	protected void marcarOsTermosDeServico() {
		driver.findElement(By.id("cgv")).click();
	}
	/**
	 * Validando se estou na Página de Pagamento etapa 5 
	 */

	protected void validaPaginaDePagamentoExibida() {
		WebElement pagePagamentoOk = driver.findElement(By.xpath("//li[@id='step_end']//span"));
		String textoPasso5 = pagePagamentoOk.getText();
		assertEquals("05. Payment", textoPasso5);
	}
	/**
	 * Método para exportar dados da página de resumo etapa 1 
	 */

	protected void exportarDadosDoSummaryEmArquivoJson() {
		// Não deu tempo de implementar
	}
	/**
	 * Informar email na pagina de cadatro etapa 2 
	 */

	protected void informarDadosDeEmailParaCriarUmaConta() {
		driver.findElement(By.id("SubmitCreate"));
	}
	/**
	 * Validar se o formulário de cadastro foi exibido corretamente
	 */

	protected void validarFormularioDeCriacaoDeContaExibido() {
		// Não deu tempo de implementar
	}

}
