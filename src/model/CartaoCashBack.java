package model;

public class CartaoCashBack extends CartaoPrePago {
	
	private int tipo;
	
	public CartaoCashBack(String numero, String nomeTitular, int anoValidade, int mesValidade, int tipo) {
		super(numero, nomeTitular, anoValidade, mesValidade);
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return this.tipo;
	}
	
	public boolean comprar(double valorCompra) {
		if(valorCompra <= this.saldo) {
			this.saldo = this.saldo - valorCompra;
			switch(this.tipo) {
				case 1: this.saldo = this.saldo + (valorCompra * 0.02); break;
				case 2: this.saldo = this.saldo + (valorCompra * 0.05); break;
				case 3: this.saldo = this.saldo + (valorCompra * 0.08); break;
			}
			return true;
		}
		return false;
	}
	
	public String toString() {
	
		return super.toString() + "\nEsse é um baita cartão CashBack, mano";
	}
}
