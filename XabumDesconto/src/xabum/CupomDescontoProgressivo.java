package xabum;

public class CupomDescontoProgressivo implements Cupom{
	private double DescontoPorcentagem;

	@Override
	public String toString() {
		return "Desconto Progressivo, " + DescontoPorcentagem;
	}

	@Override
	public int calculardesconto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
