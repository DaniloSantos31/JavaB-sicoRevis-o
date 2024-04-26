import java.util.Scanner;
public class questao2 {
    //Calculadora de IMC: Crie um programa que calcule o Índice de Massa Corporal (IMC) de uma pessoa.
    //IMC = peso (kg) / (altura (m))^2.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double imc;
        double peso = 100;
        double altura = 1.80;

        imc = peso / (altura * altura);
        System.out.println("Qual a sua altura (m)? ");
        altura = input.nextDouble();

        System.out.println("Qual seu peso (kg)? ");
        peso = input.nextDouble();

        System.out.println("Seu índice de massa corporal (IMC) é: " + imc);

        input.close();
    }
}
