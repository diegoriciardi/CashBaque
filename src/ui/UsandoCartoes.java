package ui;
import model.CartaoCashBack;
import model.CartaoPrePago;
import java.util.Scanner;

public class UsandoCartoes {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		CartaoPrePago cartoes[] = new CartaoPrePago[6];
		cartoes[0] = new CartaoPrePago("123", "Diego Riciardi", 2025, 12);
		cartoes[1] = new CartaoCashBack("456", "Catharina da Silva", 2042, 6, 3);
		cartoes[2] = new CartaoCashBack("789", "Irene Rosa", 2023, 1, 2);
		cartoes[3] = new CartaoCashBack("160", "Luigi", 2030, 12, 1);
		cartoes[4] = new CartaoPrePago("111", "João da Silva", 2042, 3);
		cartoes[5] = new CartaoPrePago("222", "José das Couves", 2029, 5);
		
		for(int i = 0; i < cartoes.length; i++) {
			cartoes[i].adicionarCredito(1000);
			System.out.println(cartoes[i]);
			cartoes[i].comprar(300);
			System.out.println(cartoes[i]);
			System.out.println("\n---------------------------\n");
		}
	}
}
