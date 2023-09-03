import java.io.IOException;
import java.util.Scanner;

public class prog1010 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double valorTotal = 0;
		sc.nextInt();
		valorTotal += sc.nextDouble() * sc.nextDouble();
		sc.nextInt();
		valorTotal += sc.nextDouble() * sc.nextDouble();
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
	}
}
