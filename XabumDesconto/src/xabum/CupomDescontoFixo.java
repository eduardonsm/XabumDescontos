package xabum;

public class CupomDescontoFixo {
	private double percentualDesconto;
	private double maxDesconto;
	public CupomDescontoFixo(double percentualDesconto, double maxDesconto) {
		this.percentualDesconto = percentualDesconto;
		this.maxDesconto = maxDesconto;
	}
	@Override
	public String toString() {
		return "Desconto Fixo de "
				+ percentualDesconto
				+ " %, até no máximo R$ "
				+ maxDesconto;
	}
	
}
