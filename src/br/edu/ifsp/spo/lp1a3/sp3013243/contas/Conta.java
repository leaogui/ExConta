package br.edu.ifsp.spo.lp1a3.sp3013243.contas;

import exceptions.NumContaEx;
import exceptions.SaldoEx;
import exceptions.TitularEx;

public class Conta {

	

	public String numeroDaConta;
	public String titular;
	public double saldo;
	
	
	public Conta (String numeroDaConta, String titular) {
		
		if (numeroDaConta == null || numeroDaConta.isEmpty()) {
			throw new NumContaEx("O número da conta não pode ser nulo");
		}
		else {
		this.numeroDaConta = numeroDaConta;
		}
		
		
		if (titular == null || titular.isEmpty()) {
			throw new TitularEx("O titular da conta não pode ser nulo");
		}
		else {
		this.titular = titular;
		}
		
		
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
	
		this.sacar(valor);
		outraConta.depositar(valor);
		
		return valor;
	}
	
	
	public double depositar(double valor) {
		
		this.saldo = valor;
		
		return saldo;
	}
	
	
	
	public double sacar(double valor) {
		
		if(valor > this.saldo) {
			throw new SaldoEx("Você não tem esse saldo.");
			
		}
		else {
		
		
		this.saldo = saldo - valor;
		
		
		}
		return saldo;
	}
	
	
}
