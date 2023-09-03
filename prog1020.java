import java.io.IOException;
import java.util.Scanner;

public class prog1020 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int dias = sc.nextInt(), anos, meses;
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dias = (dias % 365) % 30;
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);
	}
}
