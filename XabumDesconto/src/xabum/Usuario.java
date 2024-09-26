package xabum;

import java.util.ArrayList;
import java.util.Objects;

import cupom.Cupom;

public class Usuario {
	private String cpf;
	private String nome;
	private ArrayList<Cupom> cupons;

	
	public Usuario(String cpf, String nome) throws IllegalArgumentException {
		if(cpf==null||cpf==""||nome==null||nome=="") {
			throw new IllegalArgumentException();
		}
		this.cpf = cpf;
		this.nome = nome;
		this.cupons = new ArrayList<Cupom>();
	}

	public String getCpf() {
		return cpf;
	}
	public String getNome() {
			return nome;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(cpf, other.cpf);
	}

	@Override
	public String toString() {
		return  nome + " - " + cpf;
	}

	public void addCupom(Cupom cupom) {
		cupons.add(cupom);
		
	}
	public String toStringCupons() {
		return  nome + " - " + cpf + " Total Cupons: "+getTotalCupons();
	}

	public String[] listarCupons() {
		int tamTotal = cupons.size();
		int contaAtivos = 0;
		for(Cupom c : cupons) {
			if (c!=null) {
				contaAtivos+=1;
			}
		}
		String[] resultado = new String[contaAtivos];
		for(int i = 0;i<resultado.length;i++) {
			Cupom cupom = this.cupons.get(i);
			if (cupom!=null) {
				resultado[i] = cupom.toString();
			}
		}
		return resultado;
		
	}

	public int getTotalCupons() {
		return this.cupons.size();
	}
	public String aplicarCupom(Compra compra, int indexCupomUsuario) {
		Cupom cupomBuscado = cupons.get(indexCupomUsuario);
		cupomBuscado.calculardesconto(compra);
		cupons.set(indexCupomUsuario, null);

		return compra.toString();
	}
	
	
}
