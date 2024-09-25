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
}
