package br.edu.ifsp.spo.lp1a3.sp3013243.contas.app;

import br.edu.ifsp.spo.lp1a3.sp3013243.contas.Conta;
import br.edu.ifsp.spo.lp1a3.sp3013243.contas.ContaCorrente;

public class Controller {

	public String num = null;
	public String titu = null;
	
	
		
	public void comeco(){
	
	
	Conta continha = new Conta("01","Clebin");
	
	System.out.println(continha.getSaldo());
	
	
	}
	
	
}
