package xabum;

public class CupomFreteGratis implements Cupom{
	private double maxDesconto;
	
	public CupomFreteGratis(double maxDesconto) {
		this.maxDesconto = maxDesconto;
	}
	public CupomFreteGratis() {
		this.maxDesconto = 0;
	}

	@Override
	public String toString() {
		return "1. FreteGratis\r\n"+ "2. Desconto de até R$"
				+ maxDesconto
				+ " no Frete";
	}
	@Override
	public int calculardesconto() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
