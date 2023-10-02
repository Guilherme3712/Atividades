import java.util.Scanner;

public class Exercicio6 {

//6: Média de Números
//Peça ao usuário para inserir uma série de números e calcule a média deles.

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double total = 0, num, qtd=0;

		System.out.println("Para parar o programa digite '0'!");

		do{
			System.out.print("Insira um numero: ");
			num = sc.nextInt();
			if (num<=0)
				break;
			total += num;
			qtd++;
		}while(num > 0);


		double media = total / qtd;

        System.out.println("A media e: " + media);
		
		sc.close();
	}

}
