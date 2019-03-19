package br.edu.ifsp.spo.lp1a3.sp3013243.contas;

public class Conta {

	

	public String numeroDaConta;
	public String titular;
	public double saldo;
	
	
	public Conta (String numeroDaConta, String titular) {
		
		this.numeroDaConta = numeroDaConta;
		this.titular = titular;
		this.saldo = 0;
		
		
		
	}
	
	public String getNumeroDaConta() {
		return numeroDaConta;
	}



	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
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
