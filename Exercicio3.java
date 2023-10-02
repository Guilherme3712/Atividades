import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

//3: Calculadora Simples
//Crie uma calculadora que permita aos usuários realizar operações de adição, subtração, multiplicação e divisão.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int op;
		double num1, num2;
		boolean nova;

		try {
			do {
				System.out.print("Insira o primeiro número: ");
				num1 = sc.nextDouble();

				System.out.println("Escolha a operação: ");
				System.out.println("1. Soma ");
				System.out.println("2. Subtração ");
				System.out.println("3. Multiplicação ");
				System.out.println("4. Divsão");

				do{
					System.out.print("Escolha: ");
					op = sc.nextInt();
					if(op < 1 || op > 4)
						System.out.println("Digite apenas números entre 1 e 4!");
				}while(op < 1 || op > 4);

				System.out.print("Insira o segundo número: ");
				num2 = sc.nextDouble();

				System.out.printf("%.1f%n",calculo(num1,num2,op));

				nova = novaOp();

			}while (nova);
		}catch (InputMismatchException ex) {
			System.out.println("Digite apenas valores numéricos!");
		}


	}
	public  static  boolean novaOp(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Deseja realizar uma nova operação? (S ou N): ");
		return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
	}
	public static  double calculo (double num1, double num2, int op) {
		double resultado = 0;

		switch (op) {
			case 1:
				resultado = num1 + num2;
				System.out.print("A soma dos números e: ");
				break;
			case 2:
				resultado = num1 - num2;
				System.out.print("A subtração dos números e: ");
				break;
			case 3:
				resultado = num1 * num2;
				System.out.print("A multiplicação dos números e: ");
				break;
			case 4:
				if (num2 != 0) {
					resultado = num1 / num2;

					System.out.print("A divisão dos números e: ");
				} else {
					System.out.println("Erro: Número divido por zero!");

				}
				break;
			default:
				System.out.println("Escolha invalida!");
		}

		return resultado;
	}

}
