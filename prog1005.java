import java.io.IOException;
import java.util.Scanner;

public class prog1005 {
	static Scanner sc = new Scanner(System.in);
	
	public static double media(double A, double B) {
		return (A*3.5 + B*7.5) / 11;
	}
	
	public static void main(String[] args) {
		System.out.printf("MEDIA = %.5f\n", media(sc.nextDouble(), sc.nextDouble()));
	}
}
