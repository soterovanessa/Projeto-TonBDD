package br.vanessas.steps;

import org.junit.Assert;

import br.vanessas.entidades.Total;
import br.vanessas.entidades.ValorExbido;
import br.vanessas.servico.CalcularJuros;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class Step1 {
	private Total total;	
	private CalcularJuros juros = new CalcularJuros();
	private ValorExbido exibido;

	@Dado("estou no app ton")
	public void estouNoAppTon() {
		total = new Total();
		
	}

	@Quando("digitar o valor que eu quero receber R$ {int}")
	public void digitarOValorQueEuQueroReceberR$(Integer int1) {
		  total.setValor(int1);
		 exibido = juros.juros(total);
	}

	@Então("será exibido o valor a cobrar R$ {int}")
	public void seráExibidoOValorACobrarR$(Integer int1) {
		Assert.assertEquals(int1, exibido);
		
	}

	@E("informo que o pagamento vai ser realizado em duas vezez")
	public void informoQueOPagamentoVaiSerRealizadoEmDuasVezez() {
	    
	}

	@Então("será exibido o valor correto a cobrar")
	public void seráExibidoOValorCorretoACobrar() {
	   
	}

	@Quando("informo o prazo de recebimento de trinta dias")
	public void informoOPrazoDeRecebimentoDeTrintaDias() {
	    
	}

	@Então("será exibido o valor a receber")
	public void seráExibidoOValorAReceber() {
	    
	}
	
	

}
