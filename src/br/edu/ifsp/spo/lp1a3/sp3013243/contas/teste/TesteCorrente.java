package br.edu.ifsp.spo.lp1a3.sp3013243.contas.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.sp3013243.contas.Conta;
import br.edu.ifsp.spo.lp1a3.sp3013243.contas.ContaCorrente;

public class TesteCorrente {
	
	@Test
	void criar_conta() {
		
		// 1 - Configuração
		String nome = "Klebin Zikão";
		String numero = "777";
		
		
		// 2 - Execução
		ContaCorrente conta = new ContaCorrente(numero, nome);
		
		
		// 3 - Asserção
		assertNotNull(conta);
		assertEquals(nome, conta.getTitular());
		assertEquals(numero, conta.getNumeroDaConta());
			
	}
	
	@Test
	void testar_juros() {
		//1 
		double juros = 0.1;
		double saldoTeste = 900;
		String nome = "Klebin Zikão";
		String numero = "777";
		
		//2
		ContaCorrente conta = new ContaCorrente(numero, nome);
		conta.setSaldo(1000);
		conta.debitarJuros(juros);
		
		//3
		assertEquals(saldoTeste, conta.getSaldo());
		
		

	}
	
 	@Test
 	void sacar_funciona(){
	 
 		//1
 		double saldo_teste = 0;
 		Conta conta = new Conta("Jackinho Daorinho", "777777");
	 
 		//2
 		conta.setSaldo(1000);
 		conta.sacar(1000);
	 
 		//3
 		assertEquals(saldo_teste, conta.getSaldo());
 	}
	
}
