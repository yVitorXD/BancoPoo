import src.model.ContaBancaria;
import src.model.ContaCorrente;
import src.model.ContaPoupanca;
import src.model.Movimentacao;
import src.utils.DataUtil;

public class App {

	public static void main(String[] args) {
		System.out.println("Criando nosso Banco Digital");
		System.out.println();
		
		
		ContaCorrente contaCorrente = new ContaCorrente("0001", "7542", 5, 100.0);
		
		System.out.println("Saldo contaCorrente de R$" + contaCorrente.getSaldo());
		System.out.println();
		
		contaCorrente.depositar(250.0);
		
		System.out.println("Saldo contaCorrente de R$" + contaCorrente.getSaldo());
		System.out.println();
		
		var saque = contaCorrente.sacar(150.0);
		System.out.println("Saldo contaCorrente de R$" + contaCorrente.getSaldo());
		System.out.println();
		
		
		
		ContaPoupanca contaPoupanca = new ContaPoupanca("0001", "4738", 6, 200.0);
		
		contaCorrente.transferir(100.0, contaPoupanca);
		System.out.println("contaPoupanca transferiu");
		System.out.println("Saldo ContaPoupanca de R$" + contaPoupanca.getSaldo());
		System.out.println();
		
		System.out.println("Saldo ContaCorrente de R$" + contaPoupanca.getSaldo());
		System.out.println();
		
		var f1 = DataUtil.converterDateParaDataEHora(contaCorrente.getDataAbertura());
		var f2 = DataUtil.converterDateParaData(contaCorrente.getDataAbertura());
		var f3 = DataUtil.converterDateParaHora(contaCorrente.getDataAbertura());
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		
		// Extrato bancario é composto por movimentaçoes bancarias
		// Ter algo que possa ser a movimentaçao
		// Ter uma lista de movimentaçoes.
		System.out.println();
		Movimentacao movimentacao = new Movimentacao("Saque", 100.0);
		
		contaPoupanca.imprimirExtrato();
		contaCorrente.imprimirExtrato();
		
		
	}
	
}
