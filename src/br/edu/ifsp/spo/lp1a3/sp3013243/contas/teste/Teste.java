package br.edu.ifsp.spo.lp1a3.sp3013243.contas.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.sp3013243.contas.Conta;

public class Teste {

	@Test
	void criar_conta() {
		
		// 1 - Configura��o
		String nome = "Klebin Zik�o";
		String numero = "777";
		
		
		// 2 - Execu��o
		Conta conta = new Conta(numero, nome);
		
		
		// 3 - Asser��o
		assertNotNull(conta);
		assertEquals(nome, conta.getTitular());
		assertEquals(numero, conta.getNumeroDaConta());
			
	}


	@Test
	void saldo_igual_zero() {
		
			//1. Configura��o
				double saldo_teste = 0;
				Conta conta = new Conta("Jackinho Daorinho", "777777");
				
				//2. Execu��o
				double saldo = conta.getSaldo();
				
				//3. Valida��o / Asser��o
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