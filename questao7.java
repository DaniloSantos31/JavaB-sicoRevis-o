import java.util.Scanner;
public class questao7 {
    /*Troca de Valores: Escreva um programa que troque os valores de duas variáveis sem usar uma variável temporária. */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int a = input.nextInt();
        System.out.println("Digite um número: ");
        int b = input.nextInt();

        System.out.println("Antes da troca:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\nValores trocados:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        input.close();
    }
}