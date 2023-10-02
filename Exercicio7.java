import java.util.Scanner;

public class Exercicio7 {

//7: Tabuada
//Peça ao usuário para inserir um número e exiba a tabuada desse número de 1 a 10.

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int tabuada, produto;

        System.out.print("Insira um numero: ");
	 	tabuada = sc.nextInt();

		System.out.println("Tabuada do: " + tabuada);
		for(int i = 0; i <= 10; i++)
		{
			produto = tabuada * i;
			System.out.printf("%d X %d = %d%n", tabuada, i, produto);
		}
		

		sc.close();
	}

}
