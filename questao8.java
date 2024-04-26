import java.util.Scanner;
public class questao8 {
    /*Conversor de Minutos para Horas: 
    Crie um programa que converta uma quantidade de minutos em horas e minutos (exemplo: 90 minutos = 1 hora e 30 minutos). */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor em minutos: ");
        int minutos = input.nextInt();

        input.close();

        int horas = minutos/60;
        int minRestante = horas % 60;
        /* 
        if(minutos < 60){
            System.out.println(minutos + " Minuto(s) ");
        }else{
            System.out.println(horas + " hora(s) " + " e " + minRestante + " minuto(s) ");
        }*/
        System.out.println(horas + " hora(s) " + " e " + minRestante + " minuto(s) ");
    }
}