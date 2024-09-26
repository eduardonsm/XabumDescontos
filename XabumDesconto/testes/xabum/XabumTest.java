package xabum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class XabumTest {
	private XaBuMDescontos xabum;
	@BeforeEach
	public void SetUp() {
		this.xabum = new XaBuMDescontos();
	}
	
	@Test
	void criarUserTest() {
		String res = xabum.adicionaUsuario("duca", "321");
		assertEquals(res,"ok");
		try {
			xabum.adicionaUsuario("", null);
			fail();
		}catch (IllegalArgumentException e) {
			
		}
	}
	@Test
	void CupomFreteGratisTest() {
		xabum.adicionaUsuario("123", "Eduardo");
		xabum.criaCupomFreteGratis();
		xabum.addCupomUsuario("123", 0);

		Compra compra = new Compra(1, "123", 500, 50);
		
		String res = xabum.aplicarDescontoCompra(compra, 0, "123");
		assertEquals(res,"Compra [codigo=1, cpf=123, valor=500.0, valorFrete=0.0]");
	
	}
	@Test
	void CupomDescontoFixoTest() {
		xabum.adicionaUsuario("123", "Eduardo");
		xabum.criaCupomDescontoFixo(20, 30);
		xabum.addCupomUsuario("123", 0);
		
		Compra compra = new Compra(1, "123", 500, 50);
		
		String res = xabum.aplicarDescontoCompra(compra, 0, "123");
		assertEquals(res,"Compra [codigo=1, cpf=123, valor=400.0, valorFrete=50.0]");
	}
	@Test
	void CupomDescontoProgressivoTest() {
		xabum.adicionaUsuario("123", "Eduardo");
		xabum.criaCupomDescontoProgressivo();
		xabum.addCupomUsuario("123", 0);
		xabum.criaCupomDescontoProgressivo();
		xabum.addCupomUsuario("123", 1);
		
		Compra compra = new Compra(1, "123", 500, 50);
		
		String res = xabum.aplicarDescontoCompra(compra, 0, "123");
		assertEquals(res,"Compra [codigo=1, cpf=123, valor=450.0, valorFrete=50.0]");
		
		Compra compra2 = new Compra(1, "123", 200, 50);
		
		String res2 = xabum.aplicarDescontoCompra(compra2, 1, "123");
		assertEquals(res2,"Compra [codigo=1, cpf=123, valor=190.0, valorFrete=50.0]");
	}
}
