package xabum;

public class Compra {
	private int codigo;
	private String cpf;
	private double valor;
	private double valorFrete;
	
	public Compra(int codigo, String cpf, double valor, double valorFrete) {
		this.codigo = codigo;
		this.cpf = cpf;
		this.valor = valor;
		this.valorFrete = valorFrete;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}

	@Override
	public String toString() {
		return "Compra [codigo=" + codigo + ", cpf=" + cpf + ", valor=" + valor + ", valorFrete=" + valorFrete + "]";
	}
	
}
