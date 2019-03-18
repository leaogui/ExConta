package br.edu.ifsp.spo.lp1a3.sp3013243.contas;

public class Conta {

	
	public String NumeroDaConta;
	public String Titular;
	public double saldo;
	
	
	
	
	
	
	public double transferirPara(Conta outraConta, double valor) {
		
		
		
		
		
		return valor;
	}
	
	
	public double depositar(double valor) {
		
		this.saldo = valor;
		
		return saldo;
	}
	
	
	
	public double sacar(double valor) {
		
		
		this.saldo = saldo - valor;
		
		return saldo;
	}
	
	
}
