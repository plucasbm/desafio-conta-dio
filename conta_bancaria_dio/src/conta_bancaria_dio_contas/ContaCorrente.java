package conta_bancaria_dio_contas;

import conta_bancaria_dio.Cliente;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void gerarExtrato() {
		System.out.println("--- Extrato - Conta Corrente ---");
		super.infosComuns();
	}
	
	
	
	
}
