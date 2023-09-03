import java.io.IOException;
import java.util.Scanner;

public class prog1009 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		sc.nextLine(); //ler nome
		double total = sc.nextDouble() + sc.nextDouble() * 0.15;
		System.out.printf("TOTAL = R$ %.2f\n", total);
	}
}
