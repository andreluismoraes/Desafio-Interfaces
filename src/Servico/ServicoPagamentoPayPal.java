package Servico;

public class ServicoPagamentoPayPal implements Taxa{
	
	@Override
	public double taxa(double valor, int parcela,int indice) {
		double total = valor /= parcela;
		total += total * 0.01 * indice;
		total += total * 0.02;
		return total;
	}

}
