import java.util.Scanner;

public class Exercicio5 {

//5: Contagem Regressiva
//Peça ao usuário para inserir um número e faça uma contagem regressiva a partir desse número até 1.

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

        System.out.print("Insira o primeiro numero: ");
		int contagem = sc.nextInt();


		System.out.println("Contagem Regressiva Inciada!");
		for(int i = contagem; i > 0; i--)
		{
			System.out.println(i);
		}
		System.out.println("Contagem Regressiva Finalizada!");
		

		sc.close();
	}

}
