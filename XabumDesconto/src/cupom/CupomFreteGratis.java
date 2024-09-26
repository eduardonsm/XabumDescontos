package cupom;

import xabum.Compra;

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
		if (maxDesconto==0) {
			return "1. FreteGratis\r\n";
		}else {
			return "2. Desconto de até R$" + maxDesconto + " no Frete";
		}
		
	}
	@Override
	public double calculardesconto(Compra compra) {
		if(maxDesconto==0) {
			compra.setValorFrete(0);
		}else {
			compra.setValorFrete(compra.getValorFrete() - maxDesconto);
		}
		return compra.getValorFrete();
	}
	

}
