package conta_bancaria_dio_contas;

import conta_bancaria_dio.Cliente;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gerarExtrato() {
		System.out.println("--- Extrato - Conta Poupanca ---");
		super.infosComuns();
	}
	
	
}
