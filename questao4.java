import java.util.Scanner;
public class questao4 {
    /*Verificador de Par ou Ímpar:
    Crie um programa que leia um número inteiro e imprima se é par ou ímpar.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        System.out.println("Digite um número: ");
        num1 = input.nextInt();
        
        if(num1 % 2 == 0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é ímpar");
        }
        input.close();
    }
}
