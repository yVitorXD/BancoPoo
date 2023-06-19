package src.model;

import java.util.Date;

import src.utils.DataUtil;

public class ContaPoupanca extends ContaBancaria{

	public ContaPoupanca(String agencia, String conta, int digito, Double saldoInicial) {
		super(agencia, conta, digito, saldoInicial);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		
		System.out.println("****************************");
		System.out.println("***** Extrato Poupança *****");
		System.out.println("****************************");
		System.out.println();
		
		System.out.println("Gerado em: " + DataUtil.converterDateParaDataEHora(dataAbertura));
		System.out.println();
		
		for (Movimentacao movimentacao : this.movimentacoes ) {
			System.out.println(movimentacao);
			System.out.println();
		}
		
		System.out.println();
		System.out.println("****************************");
		System.out.println("****************************");
		System.out.println("****************************");
		
	}

}
