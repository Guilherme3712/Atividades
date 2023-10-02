import java.util.Scanner;

public class Exercicio1 {

//1: Soma de Dois Números
//Peça ao usuário para inserir dois números e exiba a soma deles.

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

        System.out.print("Insira o primeiro numero: ");
		double num1 = sc.nextDouble();

        System.out.print("Insira o segundo numero: ");
		double num2 = sc.nextDouble();
		
		double soma = num1 + num2;

		System.out.println(" -------------------------------");
        System.out.println("|                               |");
		System.out.printf("|   A soma dos numeros e: %.1f   ", soma );
		System.out.println("|                               |");
        System.out.println("|                               |");
		System.out.println(" -------------------------------");
		sc.close();
	}

}
