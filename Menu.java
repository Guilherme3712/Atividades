import javax.swing.*;
import java.awt.*;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Bem-vindo\n" +
                    "Escolha uma opção!\n" +
                    "1- Exercicío 1\n" +
                    "2- Exercicío 2\n" +
                    "3- Exercicío 3\n" +
                    "4- Exercicío 4\n" +
                    "5- Exercicío 5\n" +
                    "6- Exercicío 6\n" +
                    "7- Exercicío 7\n" +
                    "8- Exercicío 8\n" +
                    "9- Exercicío 9\n" +
                    "10- Exercicío 10\n" +
                    "0- Sair\n"

            ));

            Component parentComponent;
            if (opcao==0)
                break;
            else if (opcao==1)
                exercicio1();
            else if (opcao==2)
                exercicio2();
            else if (opcao==3)
                exercicio3();
            else if (opcao==4)
                exercicio4();
            else if (opcao==5)
                exercicio5();
            else if (opcao==6)
                exercicio6();
            else if (opcao==7)
                exercicio7();
            else if (opcao==8)
                exercicio8();
            else if (opcao==9)
                exercicio9();
            else if (opcao==10)
                exercicio10();
            else
                JOptionPane.showMessageDialog(null, "Opção inválida. tente novamente!" );
        } while (opcao != 0);

    }

    //1: Soma de Dois Números
    //Peça ao usuário para inserir dois números e exiba a soma deles.

    public static void exercicio1() {
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

    // 2: Verificar Número Par ou Impar
    // Peça ao usuário para inserir um número e determine se é par ou ímpar.
    public static void exercicio2() {
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

    //3: Calculadora Simples
    //Crie uma calculadora que permita aos usuários realizar operações de adição, subtração, multiplicação e divisão.
    public static void exercicio3() {
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

    //4: Fatorial de um Número
    //	Peça ao usuário para inserir um número e calcule o fatorial desse número.
    public static void exercicio4() {
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

    //5: Contagem Regressiva
    //Peça ao usuário para inserir um número e faça uma contagem regressiva a partir desse número até 1.
    public static void exercicio5() {
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

    //6: Média de Números
    //Peça ao usuário para inserir uma série de números e calcule a média deles.
    public static void exercicio6() {
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

    //7: Tabuada
    //Peça ao usuário para inserir um número e exiba a tabuada desse número de 1 a 10.
    public static void exercicio7() {
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

    //8: Verificar Palíndromo
    //Peça ao usuário para inserir uma palavra e determine se é um palíndromo
    //(se pode ser lida da mesma forma da esquerda para a direita e vice-versa).

    public static void exercicio8() {
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

    //9: Conversor de Temperatura
    //Crie um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa,
    //dependendo da escolha do usuário.

    public static void exercicio9() {
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

    //10: Adivinhação de Números
    //Crie um jogo onde o computador escolhe um número aleatório entre 1 e 100, e o usuário tem que adivinhar
    //o número. O programa deve dar dicas se o número é maior ou menor, até que o usuário acerte.

    public static void exercicio10() {
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
