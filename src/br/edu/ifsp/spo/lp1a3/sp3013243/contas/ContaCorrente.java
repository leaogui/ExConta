package br.edu.ifsp.spo.lp1a3.sp3013243.contas;

public class ContaCorrente extends Conta{

	
	public double limiteChequeEspecial;
	public static double taxaJurosChequeEspecial;
	
	
	
	
	public void debitarJuros() {
		
		
		
		
		
	}
	
	
	
	@Override
	public double sacar(double valor) {
		
		this.saldo = (saldo - valor) - (saldo - valor) * 0.01  ;
		
		
		return saldo;
	}
	
	
}
