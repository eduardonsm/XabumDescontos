package xabum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class XaBuMDescontos {
	
	private Map<String,Usuario> usuarios;
	private ArrayList<Cupom> cupons;
	
	public XaBuMDescontos() {
		this.usuarios = new HashMap<String,Usuario>();
		this.cupons = new ArrayList<Cupom>();
	}

	public String adicionaUsuario(String cpf, String nome) {
		Usuario novoUsuario = new Usuario(cpf,nome);
		usuarios.put(cpf,novoUsuario);
		return "ok";
	}
	public String criaCupomFreteGratis(double maxDesconto){
		Cupom novoCupom = new CupomFreteGratis(maxDesconto);
		cupons.add(novoCupom);
		return "criado cupom";
		
	}
	public String criaCupomFreteGratis(){
		Cupom novoCupom = new CupomFreteGratis();
		cupons.add(novoCupom);
		return "criado cupom";
		
	}
	public String criaCupomDescontoFixo(double percentualDesconto, double maxDesconto){
		Cupom novoCupom = new CupomDescontoFixo(percentualDesconto,maxDesconto);
		cupons.add(novoCupom);
		return "criado cupom";
		
	}
	public String criaCupomDescontoProgressivo(){
		Cupom novoCupom = new CupomDescontoProgressivo();
		cupons.add(novoCupom);
		return "criado cupom";
		
	}
	public String addCupomUsuario(String cpf, int indexCupom) {
		Usuario user = pegaUser(cpf);
		Cupom cupom = cupons.get(indexCupom);
		user.addCupom(cupom);
		return "adicionado";
	}

	private Usuario pegaUser(String cpf) {
		return usuarios.get(cpf);
	}
	public void aplicarDescontoCompra(Compra compra,int indexCupomUsuario) {
		
	}

}
