package src.model;
import src.model.Movimentacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;


public abstract class ContaBancaria {


	//Atributos
	protected String agencia;
	
	protected String conta;
	
	protected int digito;
	
	protected Double saldo;
	
	protected Date dataAbertura;
	
	protected ArrayList<Movimentacao> movimentacoes;
	
	protected Double VALOR_MINIMO_DEPOSITO = 10.0;
	
	//metodos
	public void depositar(Double valor) {
		
		//Verifica se o valor de deposito é menor que o valor minimo
		//Se for nao pode acontecer op deposito lançando uma exceptio
		if(valor < VALOR_MINIMO_DEPOSITO) {
			throw new InputMismatchException("O valor minimo de deposito é R$ " + VALOR_MINIMO_DEPOSITO);
		}
		
		// Efetua o deposito somando o valor ao saldo
		this.saldo += valor;
		
		// aqui faço uma movimentacao no extrato
		Movimentacao movimentacao = new Movimentacao("Deposito", valor);
		this.movimentacoes.add(movimentacao);
	}
	
	public Double sacar(Double valor) {
		// Verifica se o valor é maior que o saldo da conta
		// se for manda mensagem de saldo insuficiente
		if(valor > this.saldo) {
			throw new InputMismatchException("O saldo é insuficiente");
		}
		
		//aqui removes o valor de saque do saldo atual
		this.saldo -= valor;
		
		// Movimentacao no extrato.
		Movimentacao movimentacao = new Movimentacao("Deposito", valor);
		this.movimentacoes.add(movimentacao);
		
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
		
		// se nao instanciar, vai dar uma exception de nullPointerException
		this.movimentacoes = new ArrayList<Movimentacao>();
		
		// Criando a primeira movimentacao;
		Movimentacao movimentacao = new Movimentacao("Abertura de Conta", saldoInicial);
		
		
		// Aqui estou salvando a movimentacao dentro do meu array de movimentacoes
		//Aqui estou iniciando o meu extrato bancario
		this.movimentacoes.add(movimentacao);
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

	public abstract void imprimirExtrato();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
