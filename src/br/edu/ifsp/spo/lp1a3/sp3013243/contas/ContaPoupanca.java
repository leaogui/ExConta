package br.edu.ifsp.spo.lp1a3.sp3013243.contas;

public class ContaPoupanca extends Conta {

	
	
	
	public ContaPoupanca(String numeroDaConta, String titular) {
		super(numeroDaConta, titular);

	}






	public static double taxaRendimento;
	

	
	public void aplicarRendimento(double taxaRendimento) {
		
		
		this.saldo = this.saldo + (this.saldo*taxaRendimento);
		
		
	}
	
	
	
}
