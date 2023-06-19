package src.model;

import src.utils.DataUtil;

public class ContaCorrente extends ContaBancaria {

	public ContaCorrente(String agencia, String conta, int digito, Double saldoInicial) {
		super(agencia, conta, digito, saldoInicial);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("****************************");
		System.out.println("***** Extrato Corrente *****");
		System.out.println("****************************");
		System.out.println();
		
		System.out.println("Gerado em: " + DataUtil.converterDateParaDataEHora(dataAbertura));
		System.out.println();
		
		for (Movimentacao movimentacao : this.movimentacoes ) {
			System.out.println(movimentacao);
			System.out.println();
		}
		
		System.out.println("****************************");
		System.out.println("****************************");
		System.out.println("****************************");
		
	}

}
