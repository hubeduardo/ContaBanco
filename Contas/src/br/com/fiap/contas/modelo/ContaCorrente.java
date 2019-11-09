package br.com.fiap.contas.modelo;

import br.com.fiap.contas.main.Conta;

public class ContaCorrente extends Conta implements Tributavel  {
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor < 0) {
			throw new IllegalArgumentException("Voc� tentou sacar um valor negativo");
		}
		
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}
			 
		this.saldo -= (valor + 0.10);
	 }
	
	 public String getTipo() {
		 return "Conta Corrente";
	 }

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;

	}

	private double getSaldo() {
		return this.saldo;
	}
}
