package com.wvitorcorp.ecommerceaula.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientesTests {

	@Test
	void validarPropriedades() {
		var cliente = new Cliente();

		cliente.setNome("Welton");
		cliente.setEmail("welton.vitor@email.com.br");
		cliente.setSenha("123456");
		cliente.setEndereco("Rua Dr Silvio de Campos");
		cliente.setNumero("896");
		cliente.setCep("00000-000");
		cliente.setCidade("São Jose dos Campos");
		cliente.setBairro("Ribeirão");
		cliente.setEstado("SP");
		cliente.setComplemento("Casa 4");

		assertEquals("Welton", cliente.getNome());
		assertEquals("welton.vitor@email.com.br", cliente.getEmail());
		assertEquals("123456", cliente.getSenha());
		assertEquals("Rua Dr Silvio de Campos", cliente.getEndereco());
		assertEquals("896", cliente.getNumero());
		assertEquals("00000-000", cliente.getCep());
		assertEquals("São Jose dos Campos", cliente.getCidade());
		assertEquals("Ribeirão", cliente.getBairro());
		assertEquals("SP", cliente.getEstado());
		assertEquals("Casa 4", cliente.getComplemento());

	}

	void numeroNullNaoPodeDarErro() {
		var cliente = new Cliente();
		assertEquals(null, cliente.getNumero());

	}

}
