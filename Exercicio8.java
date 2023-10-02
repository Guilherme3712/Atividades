import java.util.Scanner;

public class Exercicio8 {

//8: Verificar Palíndromo
//Peça ao usuário para inserir uma palavra e determine se é um palíndromo 
//(se pode ser lida da mesma forma da esquerda para a direita e vice-versa).

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		String palavra, arvalap="";

        System.out.print("Insira uma palavra: ");
		palavra = sc.nextLine();

		for (int i = (palavra.length() - 1); i>= 0; i--){
			arvalap += palavra.charAt(i);
		}

		if(arvalap.toLowerCase().equals(palavra.toLowerCase()))
			System.out.println("E um polindromo!");
		else
			System.out.println("Nao e um polindromo!");
		
		sc.close();
	}

}
