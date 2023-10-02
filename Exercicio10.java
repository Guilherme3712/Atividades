import java.util.Scanner;
import java.util.Random;

public class Exercicio10 {

//10: Adivinhação de Números
//Crie um jogo onde o computador escolhe um número aleatório entre 1 e 100, e o usuário tem que adivinhar
//o número. O programa deve dar dicas se o número é maior ou menor, até que o usuário acerte.

	public static void main(String[] args) {
		Random gen = new Random();
		Scanner sc = new Scanner (System.in);

        int aleatorio, num, tentativas = 0;

        aleatorio = (gen.nextInt(100));

        do{
            tentativas++;
            System.out.print("Tente advinhar: ");
            num = sc.nextInt();
            if (num < aleatorio)
                System.out.println("Aleatorio e maior que: " + num);
            else
                System.out.println("Aleatorio e menor que: " + num);
        }while(num != aleatorio);

        System.out.println(" -------------------------------");
        System.out.println("|                               |");
        System.out.println("|   	    Parabens :)	        |");
        System.out.println("|                               |");
        System.out.println(" -------------------------------");
        System.out.println("Você acertou em " +tentativas+ " tentativas!");

		sc.close();
	}

}
