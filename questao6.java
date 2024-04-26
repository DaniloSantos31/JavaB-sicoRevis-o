import java.util.Scanner;
    public class questao6 {
    /*Calculadora Simples: Desenvolva um programa que realize operações básicas
    (soma, subtração, multiplicação, divisão) entre dois números. */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        double soma = 0;
        double sub = 0;
        double multi = 0;
        double divisao = 0;

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Soma ");
        System.out.println("2 - Subtração ");
        System.out.println("3 - Multiplicação ");
        System.out.println("4 - Divisão ");
        System.out.println("5 - Sair ");

        int op = input.nextInt();

        switch (op) {
        case 1:
        System.out.println("Digite um número: ");
        num1 = input.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = input.nextDouble();
        soma = num1 + num2;
        System.out.println(" A soma dos números é " + soma);
        break;

        case 2:
        System.out.println("Digite um número: ");
        num1 = input.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = input.nextDouble();
        sub = num1 - num2;
        System.out.println(" A subtração dos números é: " + sub);
        break;

        case 3:
        System.out.println("Digite um número: ");
        num1 = input.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = input.nextDouble();
        multi = num1 * num2;
        System.out.println(" O produto dos números digitados é: " + multi);
        break;

        case 4:
        System.out.println("Digite um número: ");
        num1 = input.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = input.nextDouble();
        divisao = num1/num2;
        System.out.println(" A divisão dos números é " + divisao);
        break;

        case 5:
        System.out.println("Fim do programa.");
        break;
        }
        input.close();
    }
}