import java.io.IOException;
import java.util.Scanner;

public class prog1006 {
	static Scanner sc = new Scanner(System.in);
	
	public static double media(double A, double B, double C) {
		return (A*2 + B*3 + C*5) / 10;
	}
	
	public static void main(String[] args) {
		System.out.printf("MEDIA = %.1f\n", media(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
	}
}
