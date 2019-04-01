package br.edu.ifsp.spo.lp1a3.sp3013243.contas;


import br.edu.ifsp.spo.lp1a3.sp3013243.contas.exceptions.SaldoEx;
import br.edu.ifsp.spo.lp1a3.sp3013243.contas.exceptions.TaxaZeroEx;

public class ContaCorrente extends Conta{

	
	public ContaCorrente(String numeroDaConta, String titular) {
		super(numeroDaConta, titular);

	}



	public double limiteChequeEspecial;
	public static double taxaJurosChequeEspecial;
	
	
	
	
	public void debitarJuros(double taxaJurosChequeEspecial) {
		
		if(taxaJurosChequeEspecial == 0) {
			
			throw new TaxaZeroEx("A taxa não pode ser 0");
			
		}
		else {
		
		this.saldo = this.saldo - (this.saldo * taxaJurosChequeEspecial);
		}
	}
	
	
	
	@Override
	public double sacar(double valor) {
		
		if(valor > this.saldo) {
			throw new SaldoEx("Você não tem esse saldo.");
			
		}
		else {
		
		
		
		this.saldo = (saldo - valor) - (saldo - valor) * 0.01  ;
		
		}
		return saldo;
	}
	
	
}
