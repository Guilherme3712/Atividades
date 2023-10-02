import java.util.Scanner;

public class Exercicio4 {

//4: Fatorial de um Número
//	Peça ao usuário para inserir um número e calcule o fatorial desse número.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

        System.out.print("Insira um numero: ");
		int num1 = sc.nextInt();
		for(int i = num1 - 1; i > 0; i--)
		{
			num1 = num1 * i;
		}
		System.out.println("O fatorial do seu numero e: " + num1);

		sc.close();
	}

}
