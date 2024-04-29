public class questao9 {
    /*Cálculo de Média: 
    Faça um programa que leia três notas de um aluno, calcule e mostre a média aritmética e a situação do aluno (aprovado se média >= 7). */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double nota1 = input.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = input.nextDouble();

        System.out.println("Nota 3: ");
        double nota3 = input.nextDouble();

        input.close();

        double media = (nota1 + nota2 + nota3)/3;

        if(media >= 7){
            System.out.println("Média: " + media + " O aluno foi aprovado!");
        }else{
            System.out.println("Média: " + media + " O aluno foi aprovado!");
        }
    }
}
