package br.edu.ifsp.spo.lp1a3.sp3013243.contas.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.sp3013243.contas.Conta;


import br.edu.ifsp.spo.lp1a3.sp3013243.contas.ContaPoupanca;

public class TestePoupanca {
	
	@Test
	void criar_conta() {
		
		// 1 - Configuração
		String nome = "Klebin Zikão";
		String numero = "777";
		
		
		// 2 - Execução
		ContaPoupanca conta = new ContaPoupanca(numero, nome);
		
		
		// 3 - Asserção
		assertNotNull(conta);
		assertEquals(nome, conta.getTitular());
		assertEquals(numero, conta.getNumeroDaConta());
			
	}
	
	@Test
	void testar_rendimento() {
		//1 
		double taxa = 0.1;
		double saldoTeste = 1100;
		String nome = "Klebin Zikão";
		String numero = "777";
		
		//2
		ContaPoupanca conta = new ContaPoupanca(numero, nome);
		conta.setSaldo(1000);
		conta.aplicarRendimento(taxa);
		
		//3
		assertEquals(saldoTeste, conta.getSaldo());
		
		
		
	}


}
