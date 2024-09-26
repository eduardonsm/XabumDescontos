package xabum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import cupom.Cupom;
import cupom.CupomDescontoFixo;
import cupom.CupomDescontoProgressivo;
import cupom.CupomFreteGratis;

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
		cupons.set(indexCupom, null);
		return "adicionado";
	}

	public Usuario pegaUser(String cpf) {
		return this.usuarios.get(cpf);
	}
	public String aplicarDescontoCompra(Compra compra,int indexCupomUsuario, String cpf) {
		return pegaUser(cpf).aplicarCupom(compra,indexCupomUsuario);
	}
	public String[] listarCuponsUsuario(String cpf) {
		 return pegaUser(cpf).listarCupons();
	}
	public String[] listarUsuariosPorNome() {
		ArrayList<Usuario> usuarioOrdenados = new ArrayList<>(usuarios.values());
		Collections.sort(usuarioOrdenados, new UsuarioNomeComparator());
		String[] usuariosArray = new String[usuarios.size()];
		for(int i =0;i<usuarios.size();i++) {
			usuariosArray[i] = usuarioOrdenados.get(i).toString();
		}
		return usuariosArray;
	}
	
		
	public String[] listarUsuariosPorCuponsTotais() {
		ArrayList<Usuario> usuarioOrdenados = new ArrayList<>(usuarios.values());
		Collections.sort(usuarioOrdenados, new UsuarioCuponsComparator());
		String[] usuariosArray = new String[usuarios.size()];
		for(int i =0;i<usuarios.size();i++) {
			usuariosArray[i] = usuarioOrdenados.get(i).toStringCupons();
		}
		return usuariosArray;
	}

}
