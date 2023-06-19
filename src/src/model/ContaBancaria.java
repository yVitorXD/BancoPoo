package src.model;

import java.util.Date;
import java.util.InputMismatchException;


public abstract class ContaBancaria {


	//Atributos
	private String agencia;
	
	private String conta;
	
	private int digito;
	
	private Double saldo;
	
	private Date dataAbertura;
	
	private Double VALOR_MINIMO_DEPOSITO = 10.0;
	
	//metodos
	public void depositar(Double valor) {
		
		//Verifica se o valor de deposito é menor que o valor minimo
		//Se for nao pode acontecer op deposito lançando uma exceptio
		if(valor < VALOR_MINIMO_DEPOSITO) {
			throw new InputMismatchException("O valor minimo de deposito é R$ " + VALOR_MINIMO_DEPOSITO);
		}
		
		// Efetua o deposito somando o valor ao saldo
		this.saldo += valor;
	}
	
	public Double sacar(Double valor) {
		// Verifica se o valor é maior que o saldo da conta
		// se for manda mensagem de saldo insuficiente
		if(valor > this.saldo) {
			throw new InputMismatchException("O saldo é insuficiente");
		}
		
		//aqui removes o valor de saque do saldo atual
		this.saldo -= valor;
		
		// aqui retorna o valor sacado ao usuario
		return valor;
		
	}

	public void transferir(Double valor, ContaBancaria contaDestino) {
		
		//Efetua um saque na conta atual
		this.sacar(valor);
		
		// Efetua o deposito na conta de destino
		contaDestino.depositar(valor);
		
		
	}




	// Construtor personalizado
	public ContaBancaria(String agencia, String conta, int digito, Double saldoInicial) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.digito = digito;
		this.saldo = saldoInicial;
		this.dataAbertura = new Date();		
	}
	
	
	// Getters e Setters
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
