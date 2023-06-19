import src.model.ContaBancaria;

public class App {

	public static void main(String[] args) {
		System.out.println("Criando nosso Banco Digital");
		System.out.println();
		
		
		ContaBancaria conta = new ContaBancaria("0001", "7542", 5, 100.0);
		
		System.out.println("Saldo conta1 de R$" + conta.getSaldo());
		System.out.println();
		
		conta.depositar(250.0);
		
		System.out.println("Saldo conta1 de R$" + conta.getSaldo());
		System.out.println();
		
		var saque = conta.sacar(150.0);
		System.out.println("Saldo conta1 de R$" + conta.getSaldo());
		System.out.println();
		
		
		
		ContaBancaria conta2 = new ContaBancaria("0001", "4738", 6, 200.0);
		
		conta2.transferir(100.0, conta);
		System.out.println("conta2 transferiu");
		System.out.println("Saldo Conta2 de R$" + conta.getSaldo());
		System.out.println();
		
		System.out.println("Saldo Conta1 de R$" + conta.getSaldo());
		System.out.println();
		
		
		
	}
	
}
