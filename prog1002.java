import java.io.IOException;
import java.util.Scanner;

public class prog1002 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double area = 3.14159 * Math.pow(sc.nextDouble(), 2);
		System.out.printf("A=%.4f\n", area);
	}
}
