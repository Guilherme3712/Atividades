import java.util.Scanner;

public class Exercicio2 {

// 2: Verificar Número Par ou Ímpar
// Peça ao usuário para inserir um número e determine se é par ou ímpar.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite um numero: ");
		int num = sc.nextInt();
		
		int resto = num % 2;
		
		if(resto == 0) {
			System.out.println("O numero é par");
		}else {
			System.out.println("O numero é impar");
		}
		
		sc.close();

	}	

}
