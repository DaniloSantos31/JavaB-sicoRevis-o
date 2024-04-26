import java.util.Scanner;
public class questao1 {
    //Conversão de Temperatura: Escreva um programa que converta temperatura de Celsius para Fahrenheit.
    //A fórmula é F = C * 9/5 + 32.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Celcius: ");
        double celcius = input.nextDouble();

        double fahrenheit = (celcius * 9/5 + 32);

        System.out.println("A temperatura convertida em fahrenheit é: " + fahrenheit);

        input.close();
    }
}