package xabum;

public class CupomFreteGratis implements Cupom{
	private double maxDesconto;
	
	public CupomFreteGratis(double maxDesconto) {
		this.maxDesconto = maxDesconto;
	}

	@Override
	public String toString() {
		return "1. FreteGratis\r\n"+ "2. Desconto de até R$"
				+ maxDesconto
				+ " no Frete";
	}
	

}
