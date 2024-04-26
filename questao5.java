import java.util.Scanner;
public class questao5 {
    /*Comparador de Números:
    Escreva um programa que leia dois números e indique qual é o maior, o menor ou se são iguais.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.println("Digite um número: ");
        num1 = input.nextInt();

        System.out.println("Digite outro número: ");
        num2 = input.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " É maior que " + num2);
        }
        if(num2 > num1){
            System.out.println(num2 + " É maior que " + num1);
        }
        if(num1 == num2){
            System.out.println(num1 + " É igual a " + num2);
        }
        input.close();
    }
}
