package conta_bancaria_dio;
import java.util.List;
import conta_bancaria_dio_contas.Conta;

public class Banco {
	private String nomeBanco;
	private List<Conta> contas;

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNome(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
}
