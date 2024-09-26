package cupom;

import xabum.Compra;

public class CupomDescontoFixo implements Cupom{
	private double percentualDesconto;
	private double maxDesconto;
	public CupomDescontoFixo(double percentualDesconto, double maxDesconto) {
		this.percentualDesconto = percentualDesconto/100;
		this.maxDesconto = maxDesconto;
	}
	@Override
	public String toString() {
		return "Desconto Fixo de "
				+ percentualDesconto
				+ " %, até no máximo R$ "
				+ maxDesconto;
	}
	@Override
	public double calculardesconto(Compra compra) {
		double desconto = Math.max(percentualDesconto*compra.getValor(),maxDesconto);
		compra.setValor(compra.getValor()-desconto);
		return desconto;
		
	}
	
}
