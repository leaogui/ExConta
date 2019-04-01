package br.edu.ifsp.spo.lp1a3.sp3013243.contas;

import br.edu.ifsp.spo.lp1a3.sp3013243.contas.exceptions.RendimentoEx;
import br.edu.ifsp.spo.lp1a3.sp3013243.contas.exceptions.SaldoEx;

public class ContaPoupanca extends Conta {

	
	
	
	public ContaPoupanca(String numeroDaConta, String titular) {
		super(numeroDaConta, titular);

	}






	public static double taxaRendimento;
	

	
	public void aplicarRendimento(double taxaRendimento) {
		
		if(taxaRendimento == 0) {
			throw new RendimentoEx("A taxa não pode ser 0.");
			
		}
		else {
		
		
		
		
		this.saldo = this.saldo + (this.saldo*taxaRendimento);
		}
		
	}
	
	
	
}
