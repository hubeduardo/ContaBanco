package br.com.fiap.contas.modelo;

import br.com.fiap.contas.main.Conta;

public class TesteConta {
	public static void main(String[] args) throws Exception  {
		
		ContaCorrente c1 = new ContaCorrente();
		c1.agencia = "10";
		c1.numero = 10;
		c1.titular = "Ze";
		
		c1.depositar(100);
		
		c1.sacar(20);
		
		System.out.println(c1.getTipo());
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.agencia = "10";
		c2.numero = 10;
		c2.titular = "Orlando";
			
		c2.depositar(10);
		
		c2.sacar(20);
		
		System.out.println(c2.getTipo() + "Saldo na conta: " +  c2.toString());
		
		SeguroDeVida seg = new SeguroDeVida();
		seg.setTitular("Mario");
		seg.setNumeroApolice(9);
		
		System.out.println("Nome: " + seg.getTitular() +  " numero do seguro: " + seg.getNumeroApolice());
		
		

		ContaCorrente c4 = new ContaCorrente();
		c4.agencia = "111";
		c4.numero = 222;
		c4.titular = "joao";
		
		c4.depositar(100);
		c4.sacar(20);
		
		
		
		System.out.println(c4.getTipo());
		
		
		
	}
}
