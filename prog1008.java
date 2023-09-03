import java.io.IOException;
import java.util.Scanner;

public class prog1008 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero = sc.nextInt(), horasTrabalhadas = sc.nextInt();
		double valorPorHora = sc.nextDouble();
		double salario = horasTrabalhadas * valorPorHora;
		System.out.printf("NUMBER = %d\n" + "SALARY = U$ %.2f\n", numero, salario);
	}
}
