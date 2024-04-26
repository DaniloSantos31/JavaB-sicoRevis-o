import java.util.Scanner;
public class questao3 {
    /*Cálculo de Área de Círculo: 
    Escreva um programa que leia o raio de um círculo e calcule sua área (A = πr^2).
    Use Math.PI para o valor de π.*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o raio do círculo: ");
        int raio = input.nextInt();
        double area = Math.PI * (raio * raio);
        
        System.out.println("A área do círculo é: " + area);

        input.close();
    }
}