package cupom;

import xabum.Compra;

public class CupomDescontoProgressivo implements Cupom{
	private double DescontoPorcentagem;

	@Override
	public String toString() {
		return "Desconto Progressivo, " + DescontoPorcentagem;
	}

	@Override
	public double calculardesconto(Compra compra) {
		double valor = compra.getValor();
		if (valor<100) {
			DescontoPorcentagem = 1;
		} else if(valor <500) {
			DescontoPorcentagem = 5;
		} else {
			DescontoPorcentagem = 10;
		}
		compra.setValor(valor*(1-DescontoPorcentagem/100));
		return DescontoPorcentagem;
	}


	
}
