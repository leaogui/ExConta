package br.edu.ifsp.spo.lp1a3.sp3013243.contas.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.sp3013243.contas.Conta;

public class Teste {

	@Test
	void criar_conta() {
		
		// 1 - Configuração
		String nome = "Klebin Zikão";
		String numero = "777";
		
		
		// 2 - Execução
		Conta conta = new Conta(numero, nome);
		
		
		// 3 - Asserção
		assertNotNull(conta);
		assertEquals(nome, conta.getTitular());
		assertEquals(numero, conta.getNumeroDaConta());
			
	}


	@Test
	void saldo_igual_zero() {
		
			//1. Configuração
				double saldo_teste = 0;
				Conta conta = new Conta("Jackinho Daorinho", "777777");
				
				//2. Execução
				double saldo = conta.getSaldo();
				
				//3. Validação / Asserção
				assertEquals(saldo_teste,saldo);
				
		
		
	}
	
	 @Test
	 void sacar_funciona(){
		 
		 //1
		 double saldo_teste = 555555;
		 Conta conta = new Conta("Jackinho Daorinho", "777777");
		 
		 //2
		 conta.setSaldo(555555);
		 
		 //3
		 assertEquals(saldo_teste, conta.getSaldo());
		 
		 
		 
		 
		 
	 }
	
	
	
	
	
}
