package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.SaldoInsuficienteException;

public abstract class Conta {
	protected double saldo;
	public String titular;
	public int numero;
	public String agencia;
	
	public void depositar(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou "
					+ "depositar um valor negativo");
		} else {
			this.saldo += valor;
		}
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		} else {
			this.saldo += valor;
		}
	}
	
	 public abstract String getTipo();
	 
	 public void transfere(double valor, Conta conta) throws Exception {
		 
		 this.sacar(valor);
	     conta.depositar(valor);
	 }
	 
	 @Override
	 public String toString() {
	 return "[titular=" + titular + ", numero=" + numero
	 + ", agencia=" + agencia + "]";
	 }
	 
	 public boolean equals(Object obj) {
		 if (obj == null) {
		 return false;
		 }
		 Conta outraConta = (Conta) obj;
		 return this.numero == outraConta.numero &&
		 this.agencia.equals(outraConta.agencia);
	 }
		 
	
}
