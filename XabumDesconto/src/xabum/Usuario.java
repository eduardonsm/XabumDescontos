package xabum;

import java.util.ArrayList;
import java.util.Objects;

public class Usuario {
	private String cpf;
	private String nome;
	private ArrayList<Cupom> cupons;

	
	public Usuario(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
		this.cupons = new ArrayList<Cupom>();
	}

	public String getCpf() {
		return cpf;
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
	
}
