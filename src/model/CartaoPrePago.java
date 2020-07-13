package model;

public class CartaoPrePago {

	protected String numero;
	protected String nomeTitular;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;
	
	public CartaoPrePago(String numero, String nomeTitular, int anoValidade, int mesValidade) {
		setNumero(numero);
		setNomeTitular(nomeTitular);
		setAnoValidade(anoValidade);
		setMesValidade(mesValidade);
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	public int getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void adicionarCredito(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		}
	}
	
	public boolean comprar(double valorCompra) {
		if(valorCompra <= this.saldo) {
			this.saldo -= valorCompra;
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Número: " + numero + " - Titular: " + nomeTitular + "\n" +
				"Validade (ano) " + anoValidade + " / (mês) " + mesValidade + "\n" +
				"Saldo: " + this.saldo;
				
	}
	
}
