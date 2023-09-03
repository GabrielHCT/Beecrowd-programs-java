import java.io.IOException;
import java.util.Scanner;

public class prog1007 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int diferenca = sc.nextInt() * sc.nextInt() - sc.nextInt() * sc.nextInt();
		System.out.println("DIFERENCA = " + diferenca);
	}
}
