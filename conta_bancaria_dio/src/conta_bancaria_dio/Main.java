package conta_bancaria_dio;

import conta_bancaria_dio_contas.Conta;
import conta_bancaria_dio_contas.ContaCorrente;
import conta_bancaria_dio_contas.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.setNome("Paulo");
		cliente2.setNome("Lucas");
		
		Conta cc = new ContaCorrente(cliente1);
		cc.depostiar(100);
		
		Conta cp = new ContaPoupanca(cliente2);
		cc.transferir(cp, 32.50);
		
		cp.gerarExtrato();
		cc.gerarExtrato();

	}

}
