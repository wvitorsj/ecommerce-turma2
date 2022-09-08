package com.wvitorcorp.ecommerceaula.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProdutoTests {

	@Test
	void validarPropriedades() {
		var produto = new Produto();

		produto.setNome("Mouse Colorido");
		produto.setDescricao("Um produto de alta qualidade");
		produto.setValor(5.50);
		produto.setQuantidade(100);

		assertEquals("Mouse Colorido", produto.getNome());
		assertEquals("Um produto de alta qualidade", produto.getDescricao());
		assertEquals(5.50, produto.getValor());
		assertEquals(100, produto.getQuantidade());
	}

	@Test
	void geraCodigoAoSetarNome() {
		var produto = new Produto();
		produto.setNome("Bicicleta");

		assertEquals("BIC-9", produto.getCodigo());

	}

	@Test
	void geraCodigoAoSetarNome2() {
		var produto = new Produto();
		produto.setNome("Cachorro Vermelho");

		assertEquals("CAC-17", produto.getCodigo());

	}

	@Test
	void geraCodigoAoSetarNome3() {
		var produto = new Produto();
		produto.setNome("Banana Nanica");

		assertEquals("BAN-13", produto.getCodigo());

	}

	@Test
	void casoDigiteCodigoDepoisAltereNomeOCodigoFicaOMesmo() {
		var produto = new Produto();
		produto.setCodigo("TTT-21");
		produto.setNome("Banana Nanica");
		assertEquals("TTT-21", produto.getCodigo());
	}

}
