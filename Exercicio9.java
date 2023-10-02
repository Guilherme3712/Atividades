import java.util.Scanner;

public class Exercicio9 {

//9: Conversor de Temperatura
//Crie um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa, 
//dependendo da escolha do usuário.

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Escolha como gostaria de vonverter a temperatura: ");
		System.out.println("1. Celsius para Fahrenheit");
		System.out.println("2. Fahrenheit para Celsius");


		int op;

		double temp;

		do{
		System.out.print("Escolha: ");
		op = sc.nextInt();
		if(op < 1 || op > 2)
			System.out.println("Digite apenas numeros entre 1 e 2!");
		}while(op < 1 || op > 2);

		if(op == 1){
			System.out.print("Insira a temperatura em Celsius: ");
			temp = sc.nextDouble();
		}else{
			System.out.print("Insira a temperatura em Fahrenheit: ");
			temp = sc.nextDouble();
		}
		
		double C = 0;
		double F = 0;

		switch (op) {
			case 1:
				F = (temp * 1.8) + 32;
				System.out.printf("A temperatura em Fahrenheit esta em: %.2f", F);
				break;
			case 2:
				C = (temp - 32) / 1.8; ;
				System.out.printf("A temperatura em Celsius esta em: %.2f", C);
				break;
			default:
				System.out.println("Escolha invalida!");
		}
		sc.close();
	}

}
