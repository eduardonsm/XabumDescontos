package xabum;

import java.util.ArrayList;

public class XaBuMDescontos {
	
	private ArrayList<Usuario> usuarios;
	private ArrayList<Cupom> cupons;
	
	public XaBuMDescontos(ArrayList<Usuario> usuarios) {
		this.usuarios = new ArrayList<Usuario>();
		this.cupons = new ArrayList<Cupom>();
	}


	public String adicionaUsuario(String cpf, String nome) {
		Usuario novoUsuario = new Usuario(cpf,nome);
		usuarios.add(novoUsuario);
		return "ok";
	}
}
